public class BankAccount
{
    // Fields
    private double balance;
    private String owner;
    private int serial;
    private static int nextNum = 0;
    
    // Constructors
    public BankAccount() // Default constructor
    {
        balance = 0.00;
        owner = "Mary Sue";
        serial = nextNum;
        nextNum++;
    }
    public BankAccount(double b)
    {
        balance = b;
        owner = "Mary Sue";
        serial = nextNum;
        nextNum++;
    }
}