import java.util.*;
class GCD
{
    int num1,num2;
    GCD(int x,int y)
    {
        num1=x;
        num2=y;
        
    }
    
    int findGCD(int m,int n)
    {
         if(m%n==0)
              return n;
         return findGCD(n,m%n);

    }
    
    
    public void getGCD()
    {
        int result=findGCD(num1,num2);
        System.out.println("GCD of two number = " + result);
    }
    
    static void main()
    {
        Scanner in = new Scanner(System.in);
        int p,q;
        System.out.println("Enter two number ");
        p=in.nextInt();
        q=in.nextInt();
        GCD obj=new GCD(p,q);
        obj.getGCD();
        
    }
}
