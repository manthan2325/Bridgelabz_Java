
public class ReverseString{
    public static void main(String[] args){
        StringBuilder sb = new StringBuilder("hello");
        sb.append("World");
        sb.reverse();
        System.out.println("String is : " + sb.toString());
    }
}