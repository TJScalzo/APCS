public class Bank
{
    // Fields
    private String name;
    private boolean isOpen;
    private BankAccount account1;
    private BankAccount account2;
    private BankAccount account3;

    // Constructors
    public Bank()
    {
        isOpen = true;
        name = "Farmington Bank";
        account1 = new BankAccount(300.0, "Tim Barron");
        account2 = new BankAccount();
        account3 = new BankAccount(100.0, "Joe Bradley");
    }
    public Bank(BankAccount b1, BankAccount b2, BankAccount b3)
    {
        isOpen = true;
        name = "Farmington Bank";
        account1 = b1;
        account2 = b2;
        account3 = b3;
    }
    public Bank(double startingAmountForAllAccounts)
    {
        isOpen = true;
        name = "Farmington Bank";
        account1 = new BankAccount(startingAmountForAllAccounts);
        account2 = new BankAccount(startingAmountForAllAccounts);
        account3 = new BankAccount(startingAmountForAllAccounts);
    }
    public Bank(String whatName)
    {
        isOpen = true;
        name = whatName;
        account1 = new BankAccount(300.0, "Tim Barron");
        account2 = new BankAccount();
        account3 = new BankAccount(100.0, "Joe Bradley");
    }
    // Methods
    public double calcTotalFunds()
    {
        double totalFunds = account1.getBalance() + account2.getBalance() + account3.getBalance();
        return totalFunds;
    }
    public void chargeFees(double feeAmount)
    {
        account1.withdraw(feeAmount);
        account2.withdraw(feeAmount);
        account3.withdraw(feeAmount);
    }
    public void addInterest()
    {
        account1.deposit(account1.getBalance()*.05);
        account2.deposit(account2.getBalance()*.05);
        account3.deposit(account3.getBalance()*.05);
    }
    public void printAllReports()
    {
        account1.printInfo();
        System.out.println();
        account2.printInfo();
        System.out.println();
        account3.printInfo();
        System.out.println();
    }
}