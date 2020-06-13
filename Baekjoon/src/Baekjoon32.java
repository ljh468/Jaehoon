// 평균점수 구하기 40점이하는 40점으로
import java.util.Scanner;

public class Baekjoon32{
    public static void main(String[] args){
      	    /* Scanner s = new Scanner(System.in);
    	       int sum = 0;
    	       int arr = 0;
    	       for(int i=0; i<5; i++) {
    	    	   arr = s.nextInt();
    	    	   if(arr<40) {
    	    		   arr = 40;
    	    	   }
    	    	   sum += arr;
    	       }
    	       System.out.println(sum/5); */

    	Scanner s = new Scanner(System.in);
    	int[] arr = new int[5];
    	int i = 0;
    	int sum = 0;
    	for(i=0; i<5; i++) {
    		arr[i] = s.nextInt();
    		if(arr[i]<40) {
    			arr[i]=40;
    		}
    	
    	sum += arr[i];
    	}
    	int avg = sum/5;
    	System.out.println(avg);
    }
}

