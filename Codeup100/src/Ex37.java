// 두 정수 입력받아 비교하기2
import java.util.Scanner;

public class Ex37{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num1 = s.nextInt();
		int num2 = s.nextInt();
		s.close();
		
		if(num1<=num2) {
			System.out.println(1);
		}else {
			System.out.println(0);
		}
	}
}

/* 두 정수 입력받아 비교하기3
public class Ex37{
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	int num1 = s.nextInt();
	int num2 = s.nextInt();
	s.close();
	
	if(num1==num2) {
		System.out.println(1);
	}else {
		System.out.println(0);
	}
}
}
*/
/* 정수2개 입력받아서 비교 4
public class Ex37{
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	int num1 = s.nextInt();
	int num2 = s.nextInt();
	s.close();
	
	if(num1!=num2) {
		System.out.println(1);
	}else {
		System.out.println(0);
	}
}
}
*/