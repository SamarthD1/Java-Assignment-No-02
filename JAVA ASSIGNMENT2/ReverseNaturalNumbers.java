// 1. Write a program to print all natural numbers in reverse.
import java.util.Scanner;

public class ReverseNaturalNumbers 
{
    public static void main(String[] args) 
    {
        
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter the starting number: ");
        int n = scanner.nextInt();

        
        System.out.println("Natural numbers in reverse order:");
        for (int i = n; i >= 1; i--) {
            System.out.print(i + " ");
        }

        
        scanner.close();
    }
}

    
