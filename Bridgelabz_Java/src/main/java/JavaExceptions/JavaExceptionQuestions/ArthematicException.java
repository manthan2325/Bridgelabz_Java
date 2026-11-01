package JavaExceptions.JavaExceptionQuestions;
import java.io.*;

public class ArthematicException 
{
    public static void main (String [] args)
    {
        try
            {
                int a = 5/0;
                System.out.println(a);
            }
        catch(ArithmeticException e)
            {
                System.out.println("cant divide by 0");
                System.out.println(e.getMessage());
                System.out.println(e.getClass().getSimpleName());
            }
        System.out.println("Program completed.");
    }
}
