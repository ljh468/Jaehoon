// OX ã��
import java.util.Scanner;
 
public class Baekjoon43 {
	public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
 
        int num = s.nextInt();
        s.nextLine(); //  ���๮�� ����.. 
        
        
        String[] str = new String[num];
 
        for (int i = 0; i < num; i++) {
        	str[i] = s.nextLine();   //  nextLine�� �Ѷ����� ��ü �д´�
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
