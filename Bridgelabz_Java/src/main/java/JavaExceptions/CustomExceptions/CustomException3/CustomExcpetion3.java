package JavaExceptions.CustomExceptions.CustomException3;

import java.io.*;
public class CustomExcpetion3 
{
    
    public static void main(String[] args) 
    {
        try
        {
            int a =5/0;
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}
