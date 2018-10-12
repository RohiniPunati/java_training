package newTask3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UserPattern {
public static void main(String[] args) throws IOException {
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter string :");
	String str=br.readLine();
	int i,j;
	char[] c=str.toCharArray();
	
	 for(i=0; i<c.length; i++)
	    {
	        for(j=0; j<=i; j++)
	        {
	            System.out.print(c[j]+" ");
	        }
	        System.out.println();
	    }
	 for(i=(c.length-2); i>=0; i--)
	    {
	        for(j=0; j<=i; j++)
	        {
	            System.out.print(c[j]+" ");
	        }
	        System.out.println();
	    }
}

}

