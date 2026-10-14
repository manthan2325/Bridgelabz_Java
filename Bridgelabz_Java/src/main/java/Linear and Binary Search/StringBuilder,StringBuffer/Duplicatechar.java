

import java.util.HashSet;

public class Duplicatechar
{
	public static void main(String[] args) {
	    String s = "Hello";
	    int n = s.length();
	    StringBuilder sb = new StringBuilder();
	    HashSet<Character> st = new HashSet<>();
	    for(int i=0;i<n;i++){
	        if(!st.contains(s.charAt(i))){
				st.add(s.charAt(i));
	            sb.append(s.charAt(i));
	        }
	    }
	    System.out.println("String is : " + sb.toString());
	}
}