import java.util.Arrays;

public class Ex05_02 {

	public static void main(String[] args) {
		// 배열의 총합, 평균 구하기
		int sum = 0;
		float average = 0f;
		int[] num = {100, 88, 100, 100, 90}; // 배열길이 5
		
		for(int i = 0; i < num.length; i++) { // 배열 인덱스값 0,1,2,3,4
		sum += num[i];
		}
		average = sum/(float)num.length;
		System.out.println(Arrays.toString(num));
		System.out.println("총합은==> "+sum);
		System.out.println("평균은==> "+average);
		
	}

}
