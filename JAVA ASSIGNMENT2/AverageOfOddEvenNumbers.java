import java.util.Scanner;

public class AverageOfOddEvenNumbers {
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the value of N: ");
        int N = scanner.nextInt();

        int oddSum = 0, evenSum = 0;

        int oddNumber = 1;
        int evenNumber = 2;

        for (int i = 1; i <= N; i++) 
        {
            oddSum += oddNumber;
            evenSum += evenNumber;

            oddNumber += 2;
            evenNumber += 2;
        }

        double oddAverage = (double) oddSum / N;
        double evenAverage = (double) evenSum / N;

        System.out.println("Average of first " + N + " odd numbers: " + oddAverage);
        System.out.println("Average of first " + N + " even numbers: " + evenAverage);

        scanner.close();
    }
}