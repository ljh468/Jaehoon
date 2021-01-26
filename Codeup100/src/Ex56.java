import java.util.Scanner;

// 그림 파일 저장용량 계산하기(설명)
public class Ex56 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		long r = s.nextLong();
		long g = s.nextLong();
		long b = s.nextLong();

		double f = (double) r * g * b / 8 / 1024 / 1024;

		System.out.printf("%.2f MB", f);
	}

}

/*
 * // 그림 파일 저장용량 계산하기(설명) public class Ex56 { public static void main(String[]
 * args) { Scanner s = new Scanner(System.in);
 * 
 * long h = s.nextLong(); 
 * long b = s.nextLong(); 
 * long c = s.nextLong(); 
 * long d = s.nextLong(); 
 * double total = 0;
 * 
 * total = h * b * c * d;
 * 
 * double result = ((total / 8) / Math.pow(2, 10) / Math.pow(2, 10));
 * System.out.format("%.1f MB", result); } }
 */