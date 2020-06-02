// 섞기
import java.util.Arrays;

public class Ex05_04 {

	public static void main(String[] args) {
		int[] num = {0,1,2,3,4,5,6,7,8,9}; // 배열 0~9 선언
		System.out.println(Arrays.toString(num)); // 저장된 배열값 보여주기 
		
		for(int i=0; i<100; i++) { //100번 섞기
			int n=(int)(Math.random()*10); //0~9까지 랜덤
			int tmp = num[0];
			num[0] = num[n];
			num[n] = tmp;
		}
		System.out.println(Arrays.toString(num));
	}

}
