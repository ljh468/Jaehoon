
public class Starpoint03 {
	public static void main(String[] args){
		int i,j;
		
		for(i=0; i<6; i++) {
			for(j=0; j<i+1; j++) {
				System.out.printf("*");
			}
			System.out.println();
		}
		
		for(i=0; i<5; i++) {
			for(j=5; j>i; j--){
			System.out.printf("*");
			}
				System.out.println();
		}
	}
	
}
