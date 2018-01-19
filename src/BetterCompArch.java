import java.util.Scanner;

public class BetterCompArch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		long fin = in.nextInt();
		long x = 0;
		long y = 0;
		long steps = 0;
		
		long bound = (long) Math.floor(Math.sqrt(fin));
		steps = (long) (Math.pow(bound, 2) + bound);
		System.out.println(bound);
		if (bound % 2 == 0) {
			x = bound;
			y = bound;
			long difference = steps - fin;
			if ((steps - fin) > 0) {
				x -= difference;
			}
			else if ((steps - fin) < 0){
				y += difference;
			}
		}
		else {
			x = bound;
			y = bound;
			long difference = steps - fin;
			if ((steps - fin) < 0) {
				x += difference;
			}
			else if ((steps - fin) > 0){
				y -= difference;
			}
		}
		
		System.out.println(x + " " + y);
	}

}
