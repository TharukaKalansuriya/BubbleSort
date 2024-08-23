package bubblesort;

public class bubbleSort{
	
	// bubble sort = pairs of adjacent elements are compared, and the elements
	//		            swapped if they are not in order.
	
	//				
	//				 small data set = okay-ish
	//				 large data set = BAD
	
	public static void main(String[] args) {
		
		int array[] =  {9, 1, 8, 2, 7, 3, 6, 4, 5};
		
		//1-define bubble sort method
		//3-add passing array
		
		bubbleSort(array);
		
		for(int i : array) {
			System.out.print(i);
		}
	}
	//2-define outside main method
	//4-add array
	public static void bubbleSort(int array[]) {
		
		for(int i = 0; i < array.length - 1; i++) {
			for(int j = 0; j < array.length - i - 1; j++) {
				if(array[j] > array[j+1]) {
					int temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
		}
	}
}
