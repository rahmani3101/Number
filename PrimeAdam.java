import java.util.Scanner;

public class PrimeAdam
{
    public int reverse(int num) {
        int rev = 0;
        
        while (num != 0) {
            int d = num % 10;
            rev = rev * 10 + d;
            num /= 10;
        }
        
        return rev;
    }
    
     boolean isAdam(int num) {
        int sqNum = num * num;
        int revNum = reverse(num);
        int sqRevNum = revNum * revNum;
        int rev = reverse(sqNum);
        
        return rev == sqRevNum;
    }
    
    boolean isPrime(int num) {
        int c = 0;
        
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                c++;
            }
        }
        
        return c == 2;
    }
    
     static void main() {
         PrimeAdam obj=new PrimeAdam ();
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the value of m: ");
        int m = in.nextInt();
        System.out.print("Enter the value of n: ");
        int n = in.nextInt();
        int count = 0;
        
        if (m >= n) {
            System.out.println("INVALID INPUT");
            return;
        }
        
        System.out.println("THE PRIME-ADAM INTEGERS ARE:");
        for (int i = m; i <= n; i++) {
            boolean adam = obj.isAdam(i);
            if (adam) {
                boolean prime = obj.isPrime(i);
                if (prime) {
                    System.out.print(i + " ");
                    count++;
                }
            }
        }
        
        if (count == 0) {
            System.out.print("NIL");
        }
        
        System.out.println(" \n FREQUENCY OF PRIME-ADAM INTEGERS IS: " + count);
    }
}
