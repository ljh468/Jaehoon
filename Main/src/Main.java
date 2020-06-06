import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
        
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());
        int[] hap = new int[num];
        int sum = 0;
        
		for(int i=0; i<num; i++)
		{
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			while(st.hasMoreTokens())
			{
				sum += Integer.parseInt(st.nextToken());
				hap[i] = sum;	
			}
			sum = 0;
		}
		for(int i=0; i<num; i++)
		{
			bw.write(hap[i]+"");
			bw.newLine();
		}
		bw.flush();
		bw.close();
	}
}