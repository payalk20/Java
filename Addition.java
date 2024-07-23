import java.util.Scanner;

class Addition
{
    public static void main(String args[])
    {
        int a, b, sum;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of A: ");
        a=sc.nextInt();

        System.out.print("Enter the value of B: ");
        b=sc.nextInt();

        sum=a+b;
        System.out.println("Sum ="+sum);
    }
}