import java.util.*;

class BubbleObj{
	int rollNo;
	String name;
	
	public BubbleObj(int rollNo, String name) {
		super();
		this.rollNo = rollNo;
		this.name = name;
	}
	
}

class BubbleSortOnObject{
  public static void main(String[] args) {

		List<BubbleObj> list = new ArrayList<>();
		list.add(new BubbleObj(11,"A"));
		list.add(new BubbleObj(10,"B"));
		list.add(new BubbleObj(5,"D"));
		list.add(new BubbleObj(5,"C"));
		list.add(new BubbleObj(15,"F"));
		list.add(new BubbleObj(15,"E"));

		for(int i = 0; i < list.size() - 1; i++) {
			for(int j = 0; j < list.size() - 1 - i; j++) {
				if(list.get(j).rollNo > list.get(j+1).rollNo ) {
					BubbleObj temp = list.get(j);
					list.set(j,list.get(j+1));
					list.set(j+1,temp);
				}else if(list.get(j).rollNo == list.get(j+1).rollNo && list.get(j).name.compareTo(list.get(j+1).name) > 0) {
					BubbleObj temp = list.get(j);
					list.set(j,list.get(j+1));
					list.set(j+1,temp);
				}
			}
		}

			
		for(BubbleObj obj : list) {
			System.out.println(obj.rollNo + " " + obj.name);
		}
}}