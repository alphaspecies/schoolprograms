import java.util.*;
public class fd
{
    public static void main(String args [])
    {
    Scanner sc=new Scanner(System.in);
         int a=sc.nextInt();
        int b=a%10;
        int d=0;
        while(a>0)
        {
            d=a%10;
            a/=10;

        }
        System.out.println("Sum of the first & last digit="+(b+d));

    }
}