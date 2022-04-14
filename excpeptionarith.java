import java.util.*;
public class excpeptionarith {
    public static void main(String args[])
    {
        try{
            int a=20,b=0;
            int c=a/b;
            System.out.println("Result "+c);
        }
        catch(ArithmeticException e)
            {
            System.out.println("can't divide it by zero");
        }
    }
}
