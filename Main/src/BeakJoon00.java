import java.util.Scanner;

public class BeakJoon00 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		
		for(int i=1; i<=t; i++) {
			System.out.println( s.nextInt() + s.nextInt() );
		}
		
		
		s.close();
	}

}
