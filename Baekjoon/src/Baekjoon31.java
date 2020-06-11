import java.util.Scanner;
import java.lang.Math;

public class Baekjoon31{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        
        int n = s.nextInt();
        int i=0;
        while(i<n) {
        	int x1 =  s.nextInt();
            int y1 =  s.nextInt();
            int r1 =  s.nextInt();
            int x2 =  s.nextInt();
            int y2 =  s.nextInt();
            int r2 =  s.nextInt();
            
          double d = Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2));
         
            if(Math.abs(r1-r2)<d&&d<r1+r2) {
            	System.out.println(2);
            }
            else if(r1+r2==d||Math.abs(r2-r1)==d&&r1!=r2) {
            	System.out.println(1);
            }
            else if(r1+r2<d||d<Math.abs(r2-r1)) {
            	System.out.println(0);
            }
            else if(x1==x2&&y1==y2&&r1==r2) {
            System.out.println(-1);
            }
            i++;
            }
            
        }
    }


