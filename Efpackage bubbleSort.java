package bubbleSort;

public class EfficientBubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		int arr[]= {5,2,3,16,9,4};
		
		int n=arr.length;
		
 {
	 int flag=0;
	 
		for(int i=0;i<n-1;i++) {
			
			for(int j=0;j<n-1;j++) {
				
				if(arr[j+1]<arr[j]) {
					
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					flag=1;
					
				}
				if(flag==0) {
					break;
				}
			}
	
				
		
		}
		
	for(int k=0;k<n;k++) {
		System.out.println(arr[k]);
	}
	}
	}

}