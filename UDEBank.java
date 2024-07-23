class MyException extends Exception
{
    int a;
    MyException(int a)
    {
        this.a=a;
    }
    public String toString()
    {
       return "Your bank balance is less :(";
    }
}
class UDEBank
{
    static void balance(int a) throws MyException
    {
        if(a<1000)
        throw new MyException(a);
        else
        System.out.println("Paisa hi paisa:)");
    } 
    public static void main(String args[])
    {
        try
        {
            balance(500);
        }
        catch(MyException e)
        {
            System.out.println(e);
        }
    }
}
