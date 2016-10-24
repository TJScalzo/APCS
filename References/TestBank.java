public class TestBank
{
    public static void main(String[] args)
    {
        // Constructors
        Bank b1 = new Bank();
        BankAccount ba1 = new BankAccount();
        BankAccount ba2 = new BankAccount(999.99, "Roxanne");
        BankAccount ba3 = new BankAccount("'Broke' Joe");
        Bank b2 = new Bank(ba1, ba2, ba3);
        Bank b3 = new Bank(500);
        Bank b4 = new Bank("Interabang");
        
        // Methods
        System.out.println("Total Funds: " + b1.calcTotalFunds());
        System.out.println();
        
        b1.chargeFees(30);
        System.out.println("Total Funds now: " + b1.calcTotalFunds());
        System.out.println();
        
        b1.addInterest();
        System.out.println("Total Funds now: " + b1.calcTotalFunds());
        System.out.println();
        
        b1.printAllReports();
    }
}