/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Arrays;
import java.util.Stack;

class Span{
    void Spann(int[] arr,int[] result){
        Stack<Integer> st = new Stack<>();
        
        int n = arr.length;
        for(int i=0;i<n;i++){
            
            while(!st.isEmpty() && arr[st.peek()] < arr[i]){
                st.pop();
            }
            
            if(st.isEmpty()){
                result[i] = i + 1;
            }else{
                result[i] = i - st.peek();
            }
            st.push(i);
        }
    }
}
public class StockSpan
{
	public static void main(String[] args) {
		int[] prices = {100, 80, 60, 70, 60, 75, 85};
        int[] result = new int[prices.length];
        Span s = new Span();
        s.Spann(prices, result);

        System.out.println("Stock spans: " + Arrays.toString(result));
	}
}