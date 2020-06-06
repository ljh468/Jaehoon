import java.util.Scanner;

public class BeakJoon22 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		for(int i=0; i<n; i++) {
		System.out.println("Case #"+(i+1)+": "+(s.nextInt()+s.nextInt()));
		
		}
	}
}
/* import java.util.Scanner;

public class BeakJoon22  {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		for (int n = s.nextInt(), i = 0; i++ < n;)
			System.out.printf("Case #%d: %d\n", i, s.nextInt() + s.nextInt());
	}
} */