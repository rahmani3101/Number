import java.util.Scanner;
public class SmithNumber {
        
    int digitSum(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
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

    boolean isSmithNumber(int n) {
        int digitSumN = digitSum(n);
        int primeFactorSum = primeFactorDigitSum(n);
        return digitSumN == primeFactorSum;
    }

    public static void main() {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a number  ");
        int number = in.nextInt();
        SmithNumber obj=new SmithNumber();
        if (obj.isSmithNumber(number)) {
            System.out.println(number + " is a Smith number.");
        } else {
            System.out.println(number + " is not a Smith number.");
        }
    }
}
