/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class AppendString
{
	public static void main(String[] args) {
	    String s = "Hello";
	    int n = s.length();
	    StringBuffer sb = new StringBuffer();
	    for(int i=0;i<n;i++){
	        sb.append(s.charAt(i));
	    }
	    System.out.println("String is : " + sb.toString());
	}
}