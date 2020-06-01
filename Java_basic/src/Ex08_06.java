import java.util.Arrays;
import java.util.Scanner;

public class Ex08_06 {

	public static void main(String[] args) {
		int aa[] = {10,20,30,40,50};
		int count , size;
		
		count = aa.length;
		size = count*Integer.BYTES;
		
		System.out.println("배열 aa[]의 요소의 개수는 " + count + "입니다.");
		System.out.println("배열 aa[]의 요소의 전체크기는 " + size + "입니다.");

}
}
