import java.util.Scanner;

public class CompArchP1Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		long fin = in.nextInt();
		long x = 0;
		long y = 0;
		long steps = 0;
		long first = 1;
		long second = 2;
		boolean done = false;
		
		while(!done) {
			// Add to the right
			x++;
			steps++;
			if(fin == steps) {
				break;
			}
			
			// Move up
			for (int i = 0; i < first && steps < fin; i++) {
				y++;
				++steps;
			}
			
			if(fin == steps) {
				break;
			}
			
			// Move to the left
			for (int i = 0; i < first && steps < fin; i++) {
				x--;
				++steps;
			}
			
			if(fin == steps) {
				break;
			}
			
			// Move up one
			y++;
			steps++;
			if(fin == steps) {
				break;
			}
	
			// Move to the right 
			for (int i = 0; i < second && steps < fin; i++) {
				++steps;
				x++;
			}
			
			if(fin == steps) {
				break;
			}
			
			// Move to the left
			for (int i = 0; i < second && steps < fin; i++) {
				++steps;
				y--;
			}
			
			if(fin == steps) {
				break;
			}

			first += 2;
			second += 2;
		}
		
		System.out.println(x + " " + y);
	}

}
