
public class Ex6_14 {

	public static void main(String[] args) {
		int i, k;

		for (i = 2; i <= 9; i++) 
			System.out.printf("  #��%d��#",i);
			
			System.out.printf("\n\n");
			
			for (i = 1; i <= 9; i++) {
				for(k=2; k<=9; k++) {
					System.out.printf("%2dX%2d=%2d",k,i,k*i);
				}
				System.out.printf("\n");
			}
		
	}

}
