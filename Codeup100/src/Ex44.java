// a,b,c 중 짝수값 출력
import java.util.Scanner;

public class Ex44 {
	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	int a = s.nextInt();
	int b = s.nextInt();
	int c = s.nextInt();
	
	if(a % 2 == 0) {
		System.out.printf("%d ",a);
		
	}
	if(b % 2 == 0) {
		System.out.printf("%d ",b);
		
	}
	if(c % 2 == 0) {
		System.out.printf("%d ",c);
		
	}
	
	}
}

/*
// a,b,c 중 큰값 출력 3항 연산자
import java.util.Scanner;

public class Ex44 {
	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	int a = s.nextInt();
	int b = s.nextInt();
	int c = s.nextInt();
	
	System.out.println((a < b ? a : b) < c ? (a < b ? a : b) : c);
	}
}
*/