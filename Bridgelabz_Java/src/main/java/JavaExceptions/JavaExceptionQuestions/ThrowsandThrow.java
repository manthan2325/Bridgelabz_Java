package JavaExceptions.JavaExceptionQuestions;
import java.io.*;

public class ThrowsandThrow 
{
    public static void main (String [] args)
    {
        try
            {
                exc();
            }
        catch(IOException e)
            {
                System.out.println(e.getMessage());
            }
    }
    static void exc() throws IOException
    {
        throw new IOException("Hello world! this is an Ioexception");
    }
    
}
