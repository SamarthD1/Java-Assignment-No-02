// 4. Write a program to print reverse alphabets from Z to A.
public class ReverseAlphabets 
{
    public static void main(String[] args) 
    {
        System.out.println("Alphabets from Z to A:");
        for (char c = 'Z'; c >= 'A'; c--) 
        {
            System.out.print(c + " ");
        }
    }
}