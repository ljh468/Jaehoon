import java.util.Scanner;
// [기초-종합] 16진수 구구단?
	public class Ex53 {
		public static void main(String[] args) {
			
			Scanner s =new Scanner(System.in);
			
			String  a = s.nextLine();
			
			int num = Integer.parseInt(a,16);
			
			 for(int i=1; i<16; i++) {
	                
	                System.out.format("%X*%X=%X%n",num,i,num*i);
	            }
		}
	}


/*
// [기초-종합] 주사위를 2개 던지면?(설명)
public class Ex53 {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int a = s.nextInt();
		int b = s.nextInt();
		for (int i = 1; i <= a; i++) {
			for( int k = 1; k <= b; k++) {
				System.out.println(i + " " + k);
			}
		}
	}
}
*/