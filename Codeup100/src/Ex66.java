//  [����-2�����迭] �ٵϾ� ���� ������(����)
import java.util.Scanner;

public class Ex66 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int[][] arr = new int[19][19]; //2�����迭����

        //�Է°� �迭�� �ֱ�
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length; j++){
                arr[i][j] = sc.nextInt();
                //System.out.printf("%d ",arr[i][j]);
            }
            //System.out.println();
        }

        int count = sc.nextInt(); // ���� ������ Ƚ��(n)

        //1�̸� 0���� 0�̸� 1��
        for(int n=0; n<count; n++){
            int x = sc.nextInt()-1; //10 12
            int y = sc.nextInt()-1; //10 12

            //[10, i]�� 0�̸� 1��, 1�̸� 0����
            for(int i=0; i<arr.length; i++){
                if(arr[x][i] == 0){
                    arr[x][i] = 1;
                }else{
                    arr[x][i] = 0;
                }
            }

            //[j, 12]�� 0�̸� 1��, 1�̸� 0����
            for(int j=0; j<arr.length; j++){
                if(arr[j][y] == 0){
                    arr[j][y] = 1;
                }else{
                    arr[j][y] = 0;
                }
            }
        }
        sc.close();

        //�� ���
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length; j++){
                System.out.printf("%d ", arr[i][j]);
            }
            System.out.println();
        }

    }//end of main
}