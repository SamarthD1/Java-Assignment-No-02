import java.util.Scanner;

public class PrintAlphabets 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the starting alphabet (beg): ");
        char beg = scanner.next().charAt(0);

        System.out.print("Enter the ending alphabet (end): ");
        char end = scanner.next().charAt(0);

        if (beg > end || beg < 'a' || end > 'z') 
        {
            System.out.println("Invalid input. Please ensure beg <= end and both are lowercase letters.");
        } 
        else 
        {
            System.out.println("Alphabets from " + beg + " to " + end + ":");
            for (char c = beg; c <= end; c++) 
            {
                System.out.print(c + " ");
            }
        }

        scanner.close();
    }
}