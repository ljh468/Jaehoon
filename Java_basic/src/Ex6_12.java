//import java.util.Scanner;
public class Ex6_12 {

	public static void main(String[] args) {
//		Scanner sc= new Scanner(System.in);
	int i;
	int j;
	
//		for(i=2; i<=9; i++) {
		for(i=9; i>=2; i--) {
			System.out.println(i+"단을 출력합니다.");
//			for(j=1; j<=9; j++)	
			for(j=9; j>=1; j--) {
//				System.out.println(i+"X"+j+"="+(i*j));
				
				System.out.printf("%dX%d=%d\n",i,j,i*j);
			}
			System.out.println();
		}
		
	}
	
	
}
