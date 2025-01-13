public class DivisibleByNine 
{
    
    // Recursive function to check divisibility by 9
    public static boolean isDivisibleBy9(int num) 
  {
        // Base case: If the number is less than 10, check directly
        if (num < 10)
          
            return num == 9;  // Returns true if the number is 9

        // Recursive case: Sum the digits of the number
        int sum = sumDigits(num);
        
        // Recursively call isDivisibleBy9 on the sum of digits
        return isDivisibleBy9(sum);
    }

    // Function to sum the digits of a number
    public static int sumDigits(int num) 
  {
        int sum = 0;
        while (num > 0) 
        {
            sum += num % 10;  // Add the last digit of num
            num /= 10;  // Remove the last digit from num
        }
        return sum;
    }

    public static void main(String[] args) {
        int number = 81;  // Example number to check divisibility by 9
        
        if (isDivisibleBy9(number))
            System.out.println(number + " is divisible by 9.");
        else 
            System.out.println(number + " is not divisible by 9.");
        }
    }
