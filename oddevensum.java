import java.util.*;
public class oddevensum {
    public static void main(String args [])
    {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number:");
    int a=sc.nextInt();
    int so=0, se=0, c=0,d=0;
    while(a>0)
    {
        d=a%10;
        c++;
        if(c%2==0)
        se+=d;
        else
        so+=d;
        a/=10;
    }
    System.out.println("Sum at Odd Digits="+so+"\n Sum at even digits:"+se);




    }
    
}
