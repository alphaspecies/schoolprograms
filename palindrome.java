import java.util.*;
class Main {
    public static void main(String args [])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int a=sc.nextInt();
        int b=a, d=0, rev=0, sum=0, pro=1;
        while(b>0)
        {
        d=b%10;
        rev=rev*10+d;
        sum=sum+d;
        pro*=d;
        b=b/10;
        }
        System.out.println("Reverse="+rev);
        System.out.println("Sum of the digits="+sum+"\n Product of the digits="+pro);
        
        if(rev==a)
        System.out.println("Palindrome Detected!");
        else
        System.out.println("Palindrome Not Found!");

    }
}