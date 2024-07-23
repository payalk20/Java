class MyException extends Exception
{
    private int ex;
    MyException(int a)
    {
        ex=a;
    }
    public String toString()
    {
        return "Not Eligible for Voting";
    }
}
class UDEVoting
{
    static void vote(int a) throws MyException
    {
        if(a<18)
        throw new MyException(a);
        else
        System.out.println("Eligible for Voting");
    } 
    public static void main(String args[])
    {
        try
        {
            vote(15);
        }
        catch(MyException e)
        {
          System.out.println(e);  
        }
    }
}