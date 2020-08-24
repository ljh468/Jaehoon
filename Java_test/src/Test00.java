
public class Test00 {

	public static void main(String[] args) {
		int i = 3;
		int k = 1;
		while(i<9) {
			if((i==3||i==5)&&k==1) {
				System.out.println("<"+i+"´Ü>");
			}
			System.out.println(i+"*"+k+"="+(i+k));
			
			k++;
			if(k>9) {
				k=1;
				i++;
				System.out.println();
			}
		}
	}
}
