import java.util.Scanner;

public class DigitReverse
 {

    public static void DisplayDigits(int number) 
    {
        if (number < 0) 
        {
            number = -number;
        }
        while (number > 0) 
        {
            int digit = number % 10;
            System.out.print(digit + " ");
            number = number / 10;
        }
    }

    public static void main(String A[]) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        int value = scanner.nextInt();
        DisplayDigits(value);
        scanner.close();
    }
}
