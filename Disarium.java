


import java.util.Scanner;

class Disarium_number
{
    int num,size;
  
    Disarium_number(int nn)
    {
        num=nn;
        size=0;
    }

  
    void countDigit()
    {
        int x=num;
        while(x>0)
        {
            size++;
            x/=10;
        }
    }

  
    int sumOfDigits(int n,int p)
    {
        if(n==0)
        {
            return 0;
        }
        return ((int)Math.pow(n%10,p)+sumOfDigits(n/10,(p-1)));
    }

  
    void check()
    {
        countDigit();
        if(sumOfDigits(num,size)==num)
        {
            System.out.println("It is Disarium number");
            
        }
        else
        {
            System.out.println("It is not  Disarium number");
            
        }
    }
  
    public static void main()
    {
        Scanner in =new Scanner(System.in);
        System.out.println("Enter a number");
        int n=in.nextInt();
        Disarium_number ob=new Disarium_number(n);
        ob.check();
    }
  
    }
    
