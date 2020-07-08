// OX 찾기
import java.util.Scanner;
 
public class Baekjoon43 {
	public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
 
        int num = s.nextInt();
        s.nextLine(); //  개행문자 제거.. 
        
        
        String[] str = new String[num];
 
        for (int i = 0; i < num; i++) {
        	str[i] = s.nextLine();   //  nextLine은 한라인을 전체 읽는다
        	int count = 0;
            int sum = 0;         
   
            for (int j = 0; j < str[i].length(); j++) {
                if (str[i].charAt(j) == 'O') {
                	count++;
                    sum += count;
                }
                else count = 0;
            }
            System.out.println(sum);
        }
        
        s.close();
    }
}
