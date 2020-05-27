
public class Starpoint04 {
	public static void main(String[] args){
		
		int i;
		int j;
		int k;
		
		for(i=0; i<6; i++) {
			for(j=5; j>i; j--) {
				System.out.printf(" ");
			}
			for(k=0; k<i+1; k++) {
				System.out.printf("*");
				
			}
			System.out.println();
		}
		for(i=0; i<5; i++) {
			for(j=0; j<i+1; j++) {
				System.out.printf(" ");
			}
			for(j=5; j>i; j--) {
				System.out.printf("*");
			}
			System.out.println();
		}
		
	}
	
}
