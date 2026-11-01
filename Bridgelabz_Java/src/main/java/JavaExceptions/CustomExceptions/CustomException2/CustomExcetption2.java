package JavaExceptions.CustomExceptions.CustomException2;
import java.io.*;
public class CustomExcetption2 
{
    
    static void MA() throws IOException
    {
        throw new IOException("Hiii this is an IOException");
    }
    static void MB() throws IOException
    {
        MA();
    }
    public static void main(String[] args) 
    {
        try
        {
            MA();
        }
        catch(IOException e)
        {
            System.out.println(e.getMessage());
        }
    }
}
