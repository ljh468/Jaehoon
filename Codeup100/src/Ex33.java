// 정수 두개 자동계산
import java.util.Scanner;

public class Ex33{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);
		System.out.printf("%.2f",(float)a/b);
	}
}

/*
import java.util.Scanner;


public class Ex33{
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		long a = s.nextLong();
		
		System.out.println(++a);
	}
}
*/