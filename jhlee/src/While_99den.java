
public class While_99den {

	public static void main(String[] args) {
		int a=2;
		int b=1;
		
		while(a<=8) {
			if(a==3||a==5) {	//3�ܰ� 5���� ���� ������ ����
				System.out.println("("+a+")��");
				
			}
			while(b<=9) {
				System.out.println(a+"X"+b+"="+(a*b));
				b++;
			}
			a++;
			b=1;  				//b�� �ʱ�ȭ�� ������Ѵ�
			System.out.println();
			
		}
		
		
	}

}