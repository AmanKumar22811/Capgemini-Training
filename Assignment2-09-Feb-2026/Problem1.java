class BubbleSort{
  public static void main(String[] args){
    int[] arr = {10,2,56,2,14,50,12,30,5,6,-1};
		
		for(int i = 0; i < arr.length - 1; i++) {
			for(int j = 0; j < arr.length - i - 1; j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		
		for(int val : arr) {
			System.out.print(val + " ");
		}
  }
}