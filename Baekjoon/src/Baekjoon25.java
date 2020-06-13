// 입력이 끝날 때까지 A+B를 출력하는 문제. EOF에 대해 알아 보세요.
// hasNext(); 값이 존재하느냐 안하느냐
import java.util.Scanner;

public class Baekjoon25{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        
        while(s.hasNext()) {
        	int a =  s.nextInt();
            int b =  s.nextInt();
            System.out.println(a+b);
            
            
        }
            
    }
}

