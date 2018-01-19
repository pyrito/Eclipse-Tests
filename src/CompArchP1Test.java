import java.util.Scanner;

public class CompArchP1Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int fin = in.nextInt();
		int x = 0;
		int y = 0;
		int steps = 0;
		int first = 1;
		int second = 2;
		boolean done = false;
		
		while(!done) {
			// Add to the right
			x++;
			steps++;
			System.out.println(steps);
			if(fin == steps) {
				break;
			}
			
			// Move up
			for (int i = 0; i < first && steps < fin; i++) {
				y++;
				++steps;
			}
			System.out.println(steps);
			if(fin == steps) {
				break;
			}
			
			// Move to the left
			for (int i = 0; i < first && steps < fin; i++) {
				x--;
				++steps;
			}
			System.out.println(steps);
			if(fin == steps) {
				break;
			}
			
			// Move up one
			y++;
			steps++;
			if(fin == steps) {
				break;
			}
			System.out.println(x + " " + y);
			System.out.println(steps);
			// Move to the right 
			for (int i = 0; i < second && steps < fin; i++) {
				++steps;
				x++;
			}
			System.out.println(steps);
			if(fin == steps) {
				break;
			}
			
			// Move to the left
			for (int i = 0; i < second && steps < fin; i++) {
				++steps;
				y--;
			}
			System.out.println(steps);
			if(fin == steps) {
				break;
			}

			first += 2;
			second += 2;
		}
		
		System.out.println(x + " " + y);
	}

}
