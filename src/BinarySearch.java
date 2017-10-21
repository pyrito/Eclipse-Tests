
public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = new int[] {1,2,3,6,7,8,10,11,12};
		System.out.println(binarySearch(array, 1));
	}
	
	static boolean binarySearch(int[] arr, int value) {
		int high  = arr.length - 1;
		int low = 0;
		while(high >= low) {
			int middle = (high + low) / 2;
			if(arr[middle] == value) {
				return true;
			}
			if(value > arr[middle]) {
				low = middle + 1;
			}
			if(value < arr[middle]) {
				high = middle - 1;
			}
		}
		return false;
	}

}
