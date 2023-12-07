import java.util.Scanner;
class CompositeMagic
{
    static boolean Composite(int n)
    {
        int c=0;
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            c++;
        }
        return (c!=2);
    }
    static boolean Magic(int n)
    {
        int sum=0;
        while(n>9)
        {
        while(n>0)
        {
            sum+=n%10;
            n/=10;
        }
        n=sum;
        sum=0;
      }
        return (n==1);
    }
    static void main()
    {
        Scanner in=new Scanner(System.in);
        CompositeMagic ob=new CompositeMagic();
        int m,n;
        System.out.println("Enter value of m and n ");
        m=in.nextInt();
        n=in.nextInt();
        int c=0;
        for(int i=m;i<=n;i++)
        {
            if(ob.Composite(i) && ob.Magic(i))
            {
                
                if(c==0)
                System.out.println("Composite-Magic Numbers :");
                c++;
                System.out.println(i);
            }
        }
        if(c==0)
        {
            System.out.println("No Composite-Magic Number is present");
        }
    }
}
