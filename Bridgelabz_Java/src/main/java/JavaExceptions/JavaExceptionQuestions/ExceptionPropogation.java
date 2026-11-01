package JavaExceptions.JavaExceptionQuestions;
import java.io.*;
public class ExceptionPropogation 
{
    static void methordB()
    {
        int a = 5/0;
        System.out.println(a);
    }
    static void methordA()
    {
        methordB();
    }
    public static void main (String [] args)
    {
        try
        {
            methordA();
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}
