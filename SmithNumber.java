

import java.util.Scanner;
public class SmithNumber {
        
    int digitSum(int n) {
        if(n==0)
            return 0;
        return n%10 + digitSum(n/10);
    }

    
    int primeFactorDigitSum(int n) {
        int sum = 0;
        for (int i = 2; i * i <= n; i++) {
            
            while (n % i == 0) {
                sum += digitSum(i);
                n /= i;
            }
            
        }
        if (n > 1) {
            sum += digitSum(n);
        }
        return sum;
    }
    
    //To check for a Smith number
    boolean  isSmithNumber(int n) {
        
        
        int digitSumN = digitSum(n);
        int primeFactorSum = primeFactorDigitSum(n);
        return digitSumN == primeFactorSum;
        
    } 
    
    //to check whether a number is Composite or not
    boolean  isComposite(int n )
    {
        int c=0;
        for(int i=1;i<=n;i++)
            if(n%i==0)
                c++;  //counter to count factor
        return c>2;
    }
    //main function 
    public static void main() {
        
        Scanner in=new Scanner(System.in);
        //Taking user input to check for a Smith number. 
        System.out.println("Enter a number  ");
        int number = in.nextInt();
        
        SmithNumber obj=new SmithNumber();  //object
        if(obj.isComposite(number)) 
        {
          
            if (obj.isSmithNumber(number)) {
                System.out.println(number + " is a Smith number.");
        }
            else 
            {
                System.out.println(number + " is not a Smith number.");
            }
        }
        else
            System.out.println(number + " is not a Smith number.");
    }
}
