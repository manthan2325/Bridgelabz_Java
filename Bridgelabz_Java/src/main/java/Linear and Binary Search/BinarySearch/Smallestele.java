/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/


public class Smallestele
{
	public static void main(String[] args) {
	   int[] arr = {3,4,5,1,2};
	   int n = arr.length;
	   int low = 0;
	   int high = n-1;
	   int index = -1;
	   while(low < high){
	       int mid = (low + high) / 2;
	       if(arr[mid] > arr[high]){
	           low = mid + 1;
	       }else{
	           high = mid;
	       }
	   }
	   index = low;
	   System.out.println("The index is : " + index);
	}
}