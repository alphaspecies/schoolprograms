public class neon
{
    public static void main(String args [])
    {
        int a,b,c,sum=0;
        for(a=1;;a++)
        {
           b=a*a;
           while(b>0)
           {
            c=b%10;
            sum+=c;
            b/=10;

           }
           if(sum==a)
           System.out.println(a);
           sum=0;
        }
    }
}