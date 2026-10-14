/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/


public class SpecificWord
{
	public static void main(String[] args) {
	    String[] s = {"My name is Manthan","My name is Rohan","My name is Aditya","My name is Akanksha"};
	    String target = "Rohan";
	    int n = s.length;
		boolean flag = false;
		outer:
	    for(int i=0;i<n;i++){
	        String[] words = s[i].split(" ");
	        int m = words.length;
	        for(int j=0;j<m;j++){
	            if(words[j].equals(target)){
	                System.out.println("The sentence is: " + s[i]);
					flag = true;
	                break outer;
	            }
	        }
	    }
		if(!flag){
			System.out.println("The word not found");
		}
	}
}