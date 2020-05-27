
public class While_99den {

	public static void main(String[] args) {
		int a=2;
		int b=1;
		
		while(a<=8) {
			if(a==3||a==5) {	//3단과 5단은 위에 목차를 삽입
				System.out.println("("+a+")단");
				
			}
			while(b<=9) {
				System.out.println(a+"X"+b+"="+(a*b));
				b++;
			}
			a++;
			b=1;  				//b는 초기화를 해줘야한다
			System.out.println();
			
		}
		
		
	}

}