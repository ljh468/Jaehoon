//  1098 : [기초-2차원배열] 설탕과자 뽑기
import java.util.Scanner;

public class Ex67 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sizeX = sc.nextInt();
        int sizeY = sc.nextInt();

        // 배열 생성
        int[][] arr = new int[sizeX][sizeY];

        int n = sc.nextInt();
        int l, d, x, y;

        // 갯수 만큼 반복
        for (int i = 0; i < n; i++) {
            l = sc.nextInt();
            d = sc.nextInt();
            x = sc.nextInt();
            y = sc.nextInt();

            // 막대의 가로 세로 구분
            if (d == 0) {
                for (int a = y; a < y + l; a++) {
                    arr[x - 1][a - 1] = 1;
                }
            } else {
                for (int a = x; a < x + l; a++) {
                    arr[a - 1][y - 1] = 1;
                }
            }

        }

        // 배열 출력
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }

}