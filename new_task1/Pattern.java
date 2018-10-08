package newTask1;

public class Pattern {
public static void main(String[] args) {
	String s="JAVAJ2EE";
	int i,j;
	char[] c=s.toCharArray();
	 for(i=0; i<c.length; i++)
	    {
	        for(j=0; j<=i; j++)
	        {
	            System.out.print(c[j]);
	        }
	        System.out.println();
	    }
	 for(i=(c.length-2); i>=0; i--)
	    {
	        for(j=0; j<=i; j++)
	        {
	            System.out.print(c[j]);
	        }
	        System.out.println();
	    }
}

}
