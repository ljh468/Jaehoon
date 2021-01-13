import java.util.Scanner;

// 짝수의 합 구히기
public class Ex51{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int i = 1;
		int hap = 0;
		while(i <= n) {
			
			if(i%2==0) {
				hap += i;	
			}
			i++;
		}
		System.out.println(hap);
	}
}



/*
// 정수 1개 입력받아 그 수까지 출력하기(설명)
public class Ex51 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		int a = 0;
		
		while(a <= n) {
			System.out.println(a+" ");
			a++;
		}
		
	}
}


*/