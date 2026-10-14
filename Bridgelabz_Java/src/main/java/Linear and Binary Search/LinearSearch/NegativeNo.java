/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.io.FileReader;
import java.io.BufferedReader;

public class NegativeNo
{
	public static void main(String[] args) {
	    int[] arr = {1,0,1,2,4,5,-4,-3};
	    int n = arr.length;
	    for(int i=0;i<n;i++){
	        if(arr[i] < 0){
	            System.out.println("The index is" + i);
	            break;
	        }
	    }
	    System.out.println("No negative number");
	}
}