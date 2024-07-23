import java.util.Scanner;
class Library extends Exception
{
    int x;
    Library(int a)
    {
        x=a;
    }
    void fine(int a)
    {
        int var=a-7;
        int res=var*10;
        System.out.println("Fine : "+res);
    }
}
class UDElibrary
{
    public static void main(String args[])
    {
        int a;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter days");
        a=sc.nextInt();
        try
        {
            if(a>7)
            throw new Library(a);
            else
            System.out.println("Thank you for returning book on time");
        }
        catch(Library e)
        {
            e.fine(a);
        }
    }
}