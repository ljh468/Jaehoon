import java.util.Scanner;
// [기초-종합] 3 6 9 게임의 왕이 되자!(설명)
public class Ex54{
	public static void main(String[] args) {
		
		Scanner s =new Scanner(System.in);
		
		int  n = s.nextInt();
		
		for(int i=1; i<=n; i++) {
			if(i%3 ==0) {
				System.out.print("X ");
			}else{
				System.out.print(i+" ");
			}
		}
	}
}

