import java.util.Scanner;

public class Ex09_05 {

	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		String str, strRep, strSub, strAry[];
		
		System.out.println("���ڿ��� �Է��ϼ��� : ");
		str = s.nextLine();
		
		strRep = str.replace(" ","$");		//�Է� ���ڿ��� ������ $�� �ٲ۴�
		strSub = str.substring(3,8);		//�Է¹��ڿ��� 3��°���� 8��°������ ���ڸ� ����
		strAry = str.split(" ");            //�Է¹��ڿ��� �������� �и�
		
		System.out.println("�Է� ���ڿ� ==> "+str);
		System.out.println("�ٲ� ���ڿ� ==> "+strRep);
		System.out.println("�Ϻ� ���ڿ� ==> "+strSub);
		for(int i=0; i<strAry.length; i++) {
			System.out.println("�и��� ���ڿ�"+ i + "==>" + strAry[i]);
		}
	}
}
