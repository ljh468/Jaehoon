
// ����(����, 0 ~ 100)�� �Է¹޾� �򰡸� ����غ���.

import java.util.Scanner;

public class Ex46 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
       if(100>=a&&a>=0){
		if(100>=a && a >=90) {
			System.out.println("A");
		}else if (a >= 70) {
			System.out.println("B");
		}else if (a >= 40) {
			System.out.println("C");
		}else {
			System.out.println("D");
		}
       }else {
    	   System.out.println("�ٽ��Է����ּ���");
       }
	}
}
