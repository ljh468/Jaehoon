import java.util.Scanner;
public class Ex6_10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.printf("���� �Է��ϼ���");
		int num = sc.nextInt();
		int hap = 0;
		
		for(int i = 1; i <= num; i++) {
			hap += i;
			
		}
		System.out.printf("1���� %d������ ���� : %d", num,hap);
		
	}
	
	
}
