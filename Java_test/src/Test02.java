
public class Test02 {
	public static void main(String[]args) {
		int a;
		int b;
		a=2;
		b=1;
		while(a<10) {
			if(a==3||a==5)
				System.out.println("("+a+"´Ü)");
			while(b<10) {
				System.out.println(a+"*"+b+"="+(a*b));
				b++;
			}
			a++;
			b=1;
			System.out.println();
		}
		
	}

}
