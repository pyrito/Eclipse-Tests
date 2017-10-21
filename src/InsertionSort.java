
public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = new int[] {1,3,2,12,11,56,29};
		int[] array1 = sort(array);
		for(int i = 0; i < array1.length; i++) {
			System.out.println(array1[i]);
		}
	}
	
	public static int[] sort(int[] arr) {
		int n = arr.length;
		for(int i = 1; i < n; i++) {
			int value = arr[i];
			int j = i - 1;
			while(j >= 0 && arr[j] > value) {
				arr[j+1] = arr[j];
				j = j - 1;
			}
			arr[j+1] = value;
		}
		return arr;
	}

}
