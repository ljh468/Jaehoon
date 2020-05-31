import java.util.Arrays;
import java.util.Scanner;

public class Ex08_03 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int[] aa = new int[4];
		int hap;
		
		for(int i=0; i<aa.length; i++) {
			System.out.println((i+1)+"번째 숫자를 입력하세요");
			aa[i] = s.nextInt();
		}
			hap = aa[0]+aa[1]+aa[2]+aa[3];
			System.out.println(Arrays.toString(aa));
			System.out.println("합계는 ==>"+hap);
	}

}
