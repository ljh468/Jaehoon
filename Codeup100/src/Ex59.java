
import java.util.Scanner;
//[����-����] �� �����ϱ�2
public class Ex59{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        long a = s.nextLong();
        long r = s.nextLong();
        long n = s.nextLong();

        long result = a;

        for (int i = 1; i < n; i++) {
            result *= r;
        }

        System.out.println(result);

    }
}