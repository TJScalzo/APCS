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
    public boolean compareTo(BankAccount other)
    {
        if (Math.abs(this.balance - other.balance) <= .00000000000000001)
            return true;
        else
            return false;
    }
    public void printInfo()
    {
        System.out.println("Owner: " + owner);
        System.out.println("Balance: $" + balance);
    }
}