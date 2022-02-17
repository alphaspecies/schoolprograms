import java.util.*;
public class valsum {
    public static void main(String args [])
    {
Scanner sc=new Scanner(System.in);
System.out.println("Please enter the number:");
int a=sc.nextInt();
int sum_even=0, sum_odd=0, d=0;
while(a>0)
{
    d=a%10;
    if(d%2==0)
    sum_even+=d;
    else
    sum_odd+=d;
    a/=10;
}
System.out.println("Sum of the odd numbers:"+sum_odd+"\n Sum of the even numbers:"+sum_even);
    }
    
}
