import java.util.Scanner;
class LCM
{
    static void main()
    {
        Scanner in=new Scanner(System.in);
        int i,n,max;
        
        System.out.println("Enter value in N ");
        n=in.nextInt();
        
        int a[]=new int[n ];
        
        System.out.println("Enter value in array of sixe "+n+": ");
        for(i=0;i<n;i++)
        a[i]=in.nextInt();
        max=a[0];
        for(i=0;i<n;i++)
            if(a[i]>max)
                max=a[i];
        int lcm=max;
        for(i=0;i<n;i++)
        {
            if(lcm%a[i]!=0)
            {
                lcm=lcm+max;
                i=-1;
            }
        }
        System.out.println(lcm);
    }
}
