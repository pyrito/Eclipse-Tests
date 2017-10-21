
public class MergeSort {
	private int[] array;
	private int arraySize;
	private int[] temp;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array1 = new int[]{1, 2, 5, 3, 7, 19, 15, 12, 13, 56, 22};
		MergeSort m = new MergeSort(array1);
		int[] array2 = m.mergesort();
		m.showArray(array2);
	}
	
	public MergeSort(int[] input) {
		array = input;
		arraySize = array.length;
		temp = new int[arraySize];
	}
	
	public int[] mergesort() {
		sort(0, arraySize - 1);
		return array;
	}
	
	public void sort(int low, int high) {
		if(low < high) {
			int mid = (low + high) / 2;
			sort(low,mid);
			sort(mid + 1, high);
			merge(low, mid, high);
		}
	}
	
	public void merge(int low, int mid, int high) {
		for(int i = low; i <= high; i++) {
			temp[i] = array[i];
		}
		int a = low;
		int b = mid + 1;
		int c = low;
		
		while(a <= mid && b <= high) {
			if(temp[a] <= temp[b]) {
				array[c] = temp[a];
				a++;
			}
			else {
				array[c] = temp[b];
				b++;
			}
			c++;
		}
		while(a <= mid) {
			array[c] = temp[a];
			a++;
			c++;
		}
	}
	
	public void showArray(int [] arr){
		for(int i=0;i<arr.length;i++){
			System.out.print(" " + arr[i]);
		}
	}
	
}
