import java.util.Scanner;

public class Ex09_04 {

	public static void main(String[] args) {
		String str = "Java�� �����ϴ� ��, Java�� ��վ��.^^";
		
		System.out.println("���ڿ� ==>"+str);
		
		System.out.print("���� ó�� ������ Java ��ġ ==> ");
		System.out.println(str.indexOf("Java")); 
		// "Java ���ڰ� ó�� ������ ��ġ�� ���
		System.out.print("�������� ������ Java ��ġ ==>");
		System.out.println(str.lastIndexOf("Java"));  
		//"Java" ���ڰ� ������ ������ ��ġ�� ���
	}
}
