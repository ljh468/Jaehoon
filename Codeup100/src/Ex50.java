import java.util.Scanner;
// 문자 1개 입력받아 알파벳 출력하기(설명)
public class Ex50 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		char n = s.nextLine().charAt(0);
		
		char a = 'a';
		
		while(a<=n) {
			System.out.print(a+" ");
			a++;
		}
		
	}
}


/*
// 정수 1개 입력받아 카운트다운 출력하기2(설명)
public class Ex50 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();

		while (true) {
			num--;
			System.out.println(num);
			if (num == 0) {

				break;
			}

		}
	}
} 
 */