import java.util.Scanner;
public class Ex6_10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.printf("값을 입력하세요");
		int num = sc.nextInt();
		int hap = 0;
		
		for(int i = 1; i <= num; i++) {
			hap += i;
			
		}
		System.out.printf("1부터 %d까지의 합은 : %d", num,hap);
		
	}
	
	
}
