package Student;
import java.time.LocalDateTime;
import java.util.*;


enum ActionType {
    DEPOSIT,
    WITHDRAW,
    TRANSFER,
    LOGIN,
    FAILED_LOGIN
}

enum Status {
    SUCCESS,
    FAILED
}



class LogEntry {

    private final int logId;
    private final String accountNumber;
    private final ActionType actionType;
    private final double amount;
    private final LocalDateTime timestamp;
    private final Status status;

    public LogEntry(int logId, String accountNumber,
                    ActionType actionType, double amount,
                    Status status) {
        this.logId = logId;
        this.accountNumber = accountNumber;
        this.actionType = actionType;
        this.amount = amount;
        this.timestamp = LocalDateTime.now();
        this.status = status;
    }

    public int getLogId() { 
    	return logId;
    }
    
    public String getAccountNumber() { 
    	return accountNumber; 
    }
    
    public ActionType getActionType() { 
    	return actionType; 
    }
    
    public double getAmount() { 
    	return amount;
    }
    public LocalDateTime getTimestamp() { 
    	return timestamp; 
    }
    public Status getStatus() { 
    	return status; 
    }

    @Override
    public String toString() {
        return "LogEntry{" +
                "logId=" + logId +
                ", account='" + accountNumber + '\'' +
                ", action=" + actionType +
                ", amount=" + amount +
                ", time=" + timestamp +
                ", status=" + status +
                '}';
    }
}


interface SuspiciousDetector {
    List<LogEntry> detectSuspiciousLogs();
}


class LogManager implements SuspiciousDetector {

    private int logCounter = 0;

    // Maintain chronological order
    private List<LogEntry> allLogs = new ArrayList<>();
  
    // Fast account lookup
    private Map<String, List<LogEntry>> accountLogs = new HashMap<>();

    // Fast action type lookup
    private  Map<ActionType, List<LogEntry>> actionLogs = new HashMap<>();

    // Recent logs (latest at front)
    private Deque<LogEntry> recentLogs = new ArrayDeque<>();


    public void addLog(String accountNumber, ActionType actionType, double amount,Status status) {

        logCounter++;

        LogEntry log = new LogEntry(
                logCounter,
                accountNumber,
                actionType,
                amount,
                status
        );

        // Add to chronological list
        allLogs.add(log);

        // Add to account map
        accountLogs
                .computeIfAbsent(accountNumber, k -> new ArrayList<>())
                .add(log);

        // Add to action map
        actionLogs
                .computeIfAbsent(actionType, k -> new ArrayList<>())
                .add(log);

        // Add to recent deque
        recentLogs.addFirst(log);
    }


    public List<LogEntry> getLogsByAccount(String accountNumber) {
        return accountLogs.getOrDefault(accountNumber, Collections.emptyList());
    }


    public List<LogEntry> getRecentLogs(int n) {
        List<LogEntry> result = new ArrayList<>();
        Iterator<LogEntry> iterator = recentLogs.iterator();

        while (iterator.hasNext() && n > 0) {
            result.add(iterator.next());
            n--;
        }

        return result;
    }

    public List<LogEntry> getLogsByAction(ActionType actionType) {
        return actionLogs.getOrDefault(actionType, Collections.emptyList());
    }
    
    @Override
    public List<LogEntry> detectSuspiciousLogs() {

        List<LogEntry> suspicious = new ArrayList<>();

        for (String account : accountLogs.keySet()) {

            List<LogEntry> logs = accountLogs.get(account);

            int size = logs.size();
            int start = Math.max(0, size - 5);

            int failedLoginCount = 0;

            for (int i = start; i < size; i++) {
                LogEntry log = logs.get(i);

                if (log.getActionType() == ActionType.FAILED_LOGIN) {
                    failedLoginCount++;
                }

                if (log.getActionType() == ActionType.WITHDRAW
                        && log.getAmount() > 50000) {
                    suspicious.add(log);
                }
            }

            if (failedLoginCount > 3) {
                for (int i = start; i < size; i++) {
                    if (logs.get(i).getActionType() == ActionType.FAILED_LOGIN) {
                        suspicious.add(logs.get(i));
                    }
                }
            }
        }

        return suspicious;
    }

}




public class SecureBankingLogManager {
	public static void main(String[] args) {
		LogManager manager = new LogManager();
	    Scanner sc = new Scanner(System.in);
	
	    while (true) {

	        System.out.println("\n==== Secure Banking Log Manager ====");
	        System.out.println("1. Add Log");
	        System.out.println("2. Get Logs by Account");
	        System.out.println("3. Get Recent Logs");
	        System.out.println("4. Detect Suspicious Activity");
	        System.out.println("5. Search by Action Type");
	        System.out.println("6. Exit");
	
	        int choice = sc.nextInt();
	        sc.nextLine();
	
	        switch (choice) {
	
	            case 1:
	                System.out.print("Account Number: ");
	                String acc = sc.nextLine();
	
	                System.out.print("Action (DEPOSIT/WITHDRAW/TRANSFER/LOGIN/FAILED_LOGIN): ");
	                ActionType action = ActionType.valueOf(sc.nextLine().toUpperCase());
	
	                System.out.print("Amount: ");
	                double amount = sc.nextDouble();
	
	                System.out.print("Status (SUCCESS/FAILED): ");
	                Status status = Status.valueOf(sc.next().toUpperCase());
	
	                manager.addLog(acc, action, amount, status);
	                System.out.println("Log added successfully!");
	                break;
	
	            case 2:
	                System.out.print("Enter Account Number: ");
	                List<LogEntry> logs = manager.getLogsByAccount(sc.nextLine());
	                logs.forEach(System.out::println);
	                break;
	
	            case 3:
	                System.out.print("Enter 1Number: ");
	                List<LogEntry> recent = manager.getRecentLogs(sc.nextInt());
	                recent.forEach(System.out::println);
	                break;
	
	            case 4:
	                List<LogEntry> suspicious = manager.detectSuspiciousLogs();
	                suspicious.forEach(System.out::println);
	                break;
	
	            case 5:
	                System.out.print("Enter Action Type: ");
	                ActionType type = ActionType.valueOf(sc.nextLine());
	                manager.getLogsByAction(type).forEach(System.out::println);
	                break;
	
	            case 6:  
	                System.out.println("Exiting...");
	                sc.close();
	                return;
	
	            default:
	                System.out.println("Invalid choice!");
	        }
	    } 
	}
}
