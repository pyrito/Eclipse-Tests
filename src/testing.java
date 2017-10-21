
public class testing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int b = 5;
		int c= 8;
		int i = 1;
		while (i < 10) {
		    if ((i++) % 2 == 0)
		        System.out.println(i);
		}
		System.out.println(check());
		System.out.println(++b + ++c);
	}
	
	static boolean check() {
		return true && false || true;
	}

}
