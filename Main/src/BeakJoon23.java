import java.util.Scanner;

public class BeakJoon23 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		for(int i=0; i<n; i++) {
			int j,k = 0;
			j = s.nextInt();
			k = s.nextInt();
		System.out.println("Case #"+(i+1)+": "+j+" + "+k+" = "+(j+k));
			
		}
	}
}