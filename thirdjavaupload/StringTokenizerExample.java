package thirdjavaupload;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class StringTokenizerExample {

	public static void main(String[] args) throws IOException{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	System.out.println("please enter input");
	StringTokenizer strToken= new StringTokenizer(br.readLine(), " ");
	System.out.println("number of words entered = "+strToken.countTokens());
	while(strToken.hasMoreElements()){
		System.out.println(strToken.nextToken());
	}
	}

}
