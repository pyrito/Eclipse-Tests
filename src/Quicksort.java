
public class Quicksort {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[] {7, 2, 1, 6, 8, 5, 3, 4};
		quicksort(arr, 0, 7);
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	static void quicksort(int[] array, int start, int end) {
		if(start < end) {
			int splitIndex = partition(array, start, end);
			quicksort(array, start, splitIndex - 1);
			quicksort(array, splitIndex + 1, end);
		}
		 
	}
	
	static int partition(int[] array, int start, int end) {
		//Choose your pivot randomly
		int randomIndex = (int)(Math.random() * (end - start)) + start;
		int pivot = array[randomIndex];
		
		//Move the pivot all the way to the right of the array
		for(int j = randomIndex; j < end; j++) {
			array[j] = array[j+1]; 
		}
		array[end] = pivot;
		
		int partitionIndex = start;
		
		for(int i = start; i < end; i++) {
			if(array[i] <= pivot) {
				int temp1 = array[partitionIndex];
				array[partitionIndex] = array[i];
				array[i] = temp1;
				partitionIndex++;
			}
		}
		
		array[end] = array[partitionIndex];
		array[partitionIndex] = pivot;
		
		return partitionIndex; 
	}
	
	

}
