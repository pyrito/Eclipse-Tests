import java.util.Arrays;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] lol = new int[] {1,2,3,4};
		int[] ayy = new int[] {0,1,2,3};
		
		System.out.println(Arrays.toString(Solution.merge(lol, lol.length, ayy, ayy.length)));
		
	}

	static class Solution {
	    public static int[] merge(int[] nums1, int m, int[] nums2, int n) {
	        int[] array1 = nums1;
	        int[] array2 = nums2;
	        int[] fin = new int[m + n];
	        int count = 0;

	        int onePoint = 0;
	        int twoPoint = 0;
	        
	        for(int i = 0; onePoint < m && twoPoint < n; i++){
	            if(array1[onePoint] <= array2[twoPoint]){
	                fin[count] = array1[onePoint];
	                //System.out.println(onePoint);
	                onePoint++;
	            }
	            else{
	                fin[count] = array2[twoPoint];
	                twoPoint++;
	            }
	            count++;
	        }
	        //System.out.println(twoPoint);
	        if(twoPoint < n){
	            for(int j = twoPoint; j < n; j++){
	            		//System.out.println(array2[j]);
	                fin[count] = array2[j];
	                count++;
	            }
	        }
	        else if(onePoint < m){
	            for(int z = onePoint; z < m; z++){
	                fin[count] = array1[z];
	                count++;
	            }
	        }
	        return fin;
	    }
	}
}
