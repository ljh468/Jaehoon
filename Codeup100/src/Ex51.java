import java.util.Scanner;

// ¦���� �� ������
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
// ���� 1�� �Է¹޾� �� ������ ����ϱ�(����)
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