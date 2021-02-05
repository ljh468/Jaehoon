import java.util.Scanner;
// [기초-1차원배열] 이상한 출석 번호 부르기1(설명)

public class Ex62{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] arr = new int[24];


        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();
            arr[num-1] += 1;
        }

        for (int i = 0; i < 23; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}