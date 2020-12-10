// 수1 설탕배달 문제
import java.util.Scanner;

public class Baekjoon58 {
	public static void main(String[] args) {
		int suger = 0;
		int count = 0; 
		Scanner s = new Scanner(System.in);
		suger = s.nextInt();
		
		while(true) {
			if(suger%5==0) {
				System.out.println(suger/5+ count);
				// 5키로 봉투로 딱 맞아 떨어지면 break;
			break;
			}else if(suger<=1) {
				System.out.println(-1);
				// 4가되면 3으로 나눠도 1이 남기때문에 정확하게 담을수 없다
				break;
			}
			suger = suger-3;
			// 3키로 봉지에 담고 count를 하나 늘려준다
			count++;
		}
		
	}
}