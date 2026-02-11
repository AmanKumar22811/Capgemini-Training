# Stack Implementation Using Array in Java

## Program to Perform Push, Pop, and Peek Operations

```java
import java.util.Scanner;

class StackArray {
    int top;
    int maxSize;
    int[] stack;

    // Constructor
    StackArray(int size) {
        maxSize = size;
        stack = new int[maxSize];
        top = -1;
    }

    // Push Operation
    void push(int value) {
        if (top == maxSize - 1) {
            System.out.println("Stack Overflow! Cannot push " + value);
        } else {
            top++;
            stack[top] = value;
            System.out.println(value + " pushed into stack.");
        }
    }

    // Pop Operation
    void pop() {
        if (top == -1) {
            System.out.println("Stack Underflow! Stack is empty.");
        } else {
            System.out.println(stack[top] + " popped from stack.");
            top--;
        }
    }

    // Peek Operation
    void peek() {
        if (top == -1) {
            System.out.println("Stack is empty.");
        } else {
            System.out.println("Top element is: " + stack[top]);
        }
    }

    // Display Stack
    void display() {
        if (top == -1) {
            System.out.println("Stack is empty.");
        } else {
            System.out.println("Stack elements are:");
            for (int i = top; i >= 0; i--) {
                System.out.println(stack[i]);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter stack size: ");
        int size = sc.nextInt();

        StackArray stack = new StackArray(size);

        int choice;

        do {
            System.out.println("\n--- Stack Menu ---");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Display");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value to push: ");
                    int value = sc.nextInt();
                    stack.push(value);
                    break;

                case 2:
                    stack.pop();
                    break;

                case 3:
                    stack.peek();
                    break;

                case 4:
                    stack.display();
                    break;

                case 5:
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid choice! Try again.");
            }

        } while (choice != 5);

        sc.close();
    }
}

```

## OUTPUT : 

![Stack with array](<Screenshot (583).png>
)