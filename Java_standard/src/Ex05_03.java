import java.util.Arrays;

public class Ex05_03 {

	public static void main(String[] args) {
		// 배열의 최소값, 최대값구하기
		int[] num = new int[10];// 배열의 선언
		

		for (int i = 0; i < num.length; i++) {
			num[i] = (int) (Math.random() * 100) + 1; // 1~100까지 임의의수 배열에 저장
		}
		System.out.println(Arrays.toString(num));
		
		int max = num[0]; //최대값 초기화
		int min = num[0]; //최소값 초기화
		
		for(int i =1; i < num.length; i++) {
			if(num[i]>max) {
				max = num[i];
			}
			else if(num[i]<min) {
				min = num[i];
			}
		}
		System.out.println("최대값은 ==>"+max);
		System.out.println("최소값은 ==>"+min);
	}
}