// ����
import java.util.Arrays;

public class Ex05_04 {

	public static void main(String[] args) {
		int[] num = {0,1,2,3,4,5,6,7,8,9}; // �迭 0~9 ����
		System.out.println(Arrays.toString(num)); // ����� �迭�� �����ֱ� 
		
		for(int i=0; i<100; i++) { //100�� ����
			int n=(int)(Math.random()*10); //0~9���� ����
			int tmp = num[0];
			num[0] = num[n];
			num[n] = tmp;
		}
		System.out.println(Arrays.toString(num));
	}

}
