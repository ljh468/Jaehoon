
public class Test02 {
	public static void main(String[]args) {
		int i = 3;
		int k = 1;
		while(i<9) {
			if(i==3||i==5) {
				System.out.println("<"+i+"´Ü>");
			}
			k=1;
			while(k<10) {
				System.out.println(i+"*"+k+"="+(i*k));
				k++;
			}
			System.out.println();
			i++;
		}
		
	}

}
