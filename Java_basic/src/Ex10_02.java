
public class Ex10_02 {
public static void main(String[] args) {
		
		int[] aa =new int[3];
		try {
			aa[2] = 100/0;
			aa[3] = 100;
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("벼열 첨자가 배열크기보다 커요~~");
		}catch(ArithmeticException e) {
			System.out.println("0으로 나누는 등의 오류예요~~");
		}finally {
			System.out.println("이부분 무조건 나와요~~");
		}
	}

}
