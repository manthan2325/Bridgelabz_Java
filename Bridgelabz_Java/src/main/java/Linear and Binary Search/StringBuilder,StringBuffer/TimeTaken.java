/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class TimeTaken
{
	public static void main(String[] args) {
	    String s = "a";
	    int n = 1000000;
	    StringBuilder sb = new StringBuilder();
	    StringBuffer sb1 = new StringBuffer();
	    long start = System.nanoTime();
	    for(int i=0;i<n;i++){
	        sb.append(s);
	    }
	    long end = System.nanoTime() - start;
	    long start1 = System.nanoTime();
	    for(int i=0;i<n;i++){
	        sb1.append(s);
	    }
	    long end1 = System.nanoTime() - start1;
	    System.out.println("Time taken by StringBuilder is : " + end);
	    System.out.println("Time taken by StringBuffer is : " + end1);
	    
	}
}