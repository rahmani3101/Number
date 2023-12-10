
import java.util.Scanner;
public class Emirp
{
    int n,rev,f;
    Emirp(int nn)
    {
        n=nn;
        rev=0;
        f=2;
    }
    
    int isprime(int x )
    {
        if(f<=x)
        {
            if(x==f)
                return 1;
            if(x%f==0)
                return 0;
            ++f;
            return isprime(x);
        }
        else
        return 0;
            
    }
        
    
    void isEmirp()
    {
        int d,m=n;
        while(m!=0){
        
            rev*=10+(m%10);
            m/=10;
        }
        if(isprime(n)==1)
        {
            this.f=2;
            if(isprime(rev)==1)
                System.out.println("IT IS EMIRP NUMBER ");
            else
                System.out.println("It is not EMIRP Number ");
        }
    }
    
    
    static void main() {
        
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a number  ");
        int number = in.nextInt();
        Emirp ob=new Emirp(number);
        ob.isEmirp();
    }
}
