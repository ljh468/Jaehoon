// ��� �Ųٷ� �� ��
import java.util.Scanner;

public class Baekjoon54 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int a = s.nextInt();
		int b = s.nextInt();
		
		int num1 = revers(a); 
		int num2 = revers(b);
		
		if(num1>num2) { // num1�� num2���� ũ�� num1���, �ƴϸ� num2���
			System.out.println(num1);
		}else {
			System.out.println(num2);
		}
	}
	
	public static int revers(int num) { // ���ڸ� �Ųٷ� �ٲٱ����� revers �Լ�
		String str = String.valueOf(num); //int�� �޾ƿ� ���ڸ� ���ڿ��� ����
		String r = "";
		for(int i=str.length(); i>0; i--) { //str���ڿ��� �Ųٷ� �ֱ����� for�� 
			r += str.charAt(i-1);
		}
		return Integer.parseInt(r); // return���� int������ ����
	}
}