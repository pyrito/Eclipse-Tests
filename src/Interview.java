import java.util.ArrayList;
import java.util.Collections;

public class Interview {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		int[] nums = new int[] {-40,30,-2,-4,-1,0,40,50};
		for(int i = 0; i < nums.length; i++) {
			numbers.add(nums[i]);
		}
		int[] result = sumClosestToZero(numbers);
		
		for(int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
	}
	
	public static int[] sumClosestToZero(ArrayList<Integer> integers) {
		Collections.sort(integers);
		
		if(integers.size() < 2) {
			System.err.println("Invalid input");
		}
		
		int left = 0;
		int right = integers.size() - 1;
		int minimumSum = integers.get(left) + integers.get(right);
		int[] closestToZero = new int[2];
		
		while(right > left) {
			int sum = integers.get(left) + integers.get(right);
			
			if(Math.abs(sum) < Math.abs(minimumSum)) {
				minimumSum = sum;
				closestToZero[0] = integers.get(left);
				closestToZero[1] = integers.get(right);
			}
			
			if(sum < 0) {
				left++;
			}
			else {
				right--;
			}
		}
		
		return closestToZero;
	}

}
