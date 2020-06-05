//while 구구단
public class Ex01 {

	public static void main(String[] args) {
		int i=2;
		int k=1;
		
	
		while(i<10) {
			if(i==3||k==5) {
				System.out.println("<"+i+"단>");
			}
			while(k<10) {
				System.out.println(i+"X"+k+"="+i*k);
				k++;
			}
			k=1;
			i++;
			System.out.println();
		}


	}

}
