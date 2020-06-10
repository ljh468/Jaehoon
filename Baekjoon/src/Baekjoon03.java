import java.util.Scanner;

public class Baekjoon03{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n =  s.nextInt();
        s.close();
        
        for(int i=1; i<10; i++){
            System.out.printf("%d * %d = %d\n",n,i,(n*i));
        }
            
    }
}

