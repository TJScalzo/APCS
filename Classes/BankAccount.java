public class BankAccount
{
    // Fields
    private double balance;
    private String owner;
    // Constructors
    public BankAccount() // Default constructor
    {
        balance = 0.00;
        owner = "Mary Sue";
    }
    public BankAccount(double b, String o) // Some other constructor
    {
        balance = b;
        owner = o;
    }
    public BankAccount(String o)
    {
        balance = 0.00;
        owner = o;
    }
    public BankAccount(double b)
    {
        balance = b;
        owner = "Mary Sue";
    }
    // Methods
    public double getBalance()
    {
        return balance;
    }
    public String getOwner()
    {
        return owner;
    }
    public void deposit(double howmuch)
    {
        balance = balance + howmuch;
    }
    public void withdraw(double howmuch)
    {
        balance = balance - howmuch;
    }
    public void printInfo()
    {
        System.out.println("Balance: $" + balance);
    }
}