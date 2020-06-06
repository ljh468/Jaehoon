import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BeakJoon20 {
public static void main(String args[]) throws NumberFormatException, IOException{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	int t = Integer.parseInt(br.readLine());
	for(int i=0; i<t; i++) {
		String x = br.readLine();
		int index = x.indexOf(" ");
		int n1 = Integer.parseInt(x.substring(0, index));
		int n2 = Integer.parseInt(x.substring(index+1,x.length()));
		bw.write((n1+n2)+"\n");
	}
	bw.close();
}
}