
// 점수(정수, 0 ~ 100)를 입력받아 평가를 출력해보자.

import java.util.Scanner;

public class Ex46 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
       if(100>=a&&a>=0){
		if(100>=a && a >=90) {
			System.out.println("A");
		}else if (a >= 70) {
			System.out.println("B");
		}else if (a >= 40) {
			System.out.println("C");
		}else {
			System.out.println("D");
		}
       }else {
    	   System.out.println("다시입력해주세요");
       }
	}
}
