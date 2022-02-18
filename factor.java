import java.util.*;
public class factor {
    public static void main(String args [])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int a=sc.nextInt();
        int i=1;
        do{
             if(a%i==0)
             System.out.print(i+" ");
             i++;

        }
        while(i<=a);

    }
    
    
}
