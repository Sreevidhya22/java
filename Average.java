import java.util.*;
class NegativeException extends Exception
 {
    public NegativeException(String s)
     {
        super(s);
    }
}

public class Average 
{

    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        int n;
        double sum = 0;
        int count = 0;

        System.out.print("Enter the number of values (n): ");
        n = scanner.nextInt();

        for (int i = 1; i <= n; i++)
         {
            System.out.print("Enter number " + i + ": ");
            double number = scanner.nextDouble();
            try
             {
                if (number < 0) 
                {
                    throw new NegativeException("Negative input not allowed: " + number);
                }
                sum += number;
                count++;
            } 
            catch (NegativeException e)
             {
                System.out.println("Exception caught: " + e.getMessage());
            }
        }

        if (count > 0) 
        {
            double average = sum / count;
            System.out.println("Average of positive numbers: " + average);
        } else
         {
            System.out.println("No positive numbers entered. Cannot calculate average.");
        }

        scanner.close();
    }
}
