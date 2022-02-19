import java.util.*;
public class altin {
    public static void main(String args [])
    {
        Scanner sc=new Scanner(System.in);
        /*Program to find the sum of all digits excluding the first and the last digit*/
        System.out.println("Enter the number:");
        int a=sc.nextInt();
        int sum=0, d=0, b=a%10;
        while(a>0)
        {
        d=a%10;
        sum+=d;
        a/=10;
        }
        System.out.println("Sum="+(sum-(d+b)));
    }
    
}
