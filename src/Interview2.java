import java.util.ArrayList;
import java.util.Collections;

public class Interview2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		int[] nums = new int[] {3, 0, 2};
		for(int i = 0; i < nums.length; i++) {
			numbers.add(nums[i]);
		}
		int result = missingFromSequence(numbers);
		System.out.println(result);
	}
	
	public static int missingFromSequence(ArrayList<Integer> numbers) {
		Collections.sort(numbers);
		
		if (numbers.size() == 1) {
			return numbers.get(0);
		}
		
		for(int i = 0; i < numbers.size() - 1; i++) {
			int start = numbers.get(i);
			if(start + 1 != numbers.get(i+1)) {
				return start + 1;
			}
		}
		
		return -1;
	}

}
