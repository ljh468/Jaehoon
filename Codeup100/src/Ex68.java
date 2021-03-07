// 코드업 기초 100제 완료
import java.util.Scanner;

public class Ex68 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 개미굴 정보 입력받고 저장
        int[][] antCave = new int[10][10];
        for(int i = 0; i < 10; i++) {
            String caveInput = sc.nextLine();
            String[] caveInputSplit = caveInput.split(" ");
            for(int j = 0; j < 10; j++) {
                antCave[i][j] = Integer.parseInt(caveInputSplit[j]);
            }
        }

        int[][] antPath;
        antPath = antCave;

        // 개미 경로 표시
        boolean isReached = false;
        int x,y;
        x = 1; y = 1;
        while(!isReached) {
            if(antPath[x][y + 1] == 1) { // 오른쪽이 막힌 경우
                if(antPath[x + 1][y] == 1) { // 오른쪽이 막혔을 때 아래쪽도 막힌 경우(도착)
                    break;
                } 
                else { // 아래쪽은 열린 경우, 0 또는 2
                    x++;
                }
            } 
            else if(antPath[x][y + 1] != 1) { // 오른쪽이 0 또는 2 }
                y++;
            }
            if(antPath[x][y] == 2) { // 도착
                    isReached = true;
            }
            antPath[x][y] = 9;
        }

        antPath[1][1] = 9; // 시작점 마크

        // 개미굴 출력
        for(int i = 0; i < 10; i++) {
            for(int j = 0; j < 10; j++) {
                System.out.print(antPath[i][j] + " ");
            }
            System.out.println("");
        }
    }
}