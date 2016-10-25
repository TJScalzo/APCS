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
        Bank b4 = new Bank("Interabang", "President", "Snow");
        
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
        System.out.println();
        
        b1.fireBigShots();
        b1.printCompanyReport();
        System.out.println();
        
        Employee otherPresident2 = new Employee("Mr.", "Greg", 35, "President", 1000000000);
        Employee otherVicePresident2 = new Employee("I'm", "Rich Too!", 21, "Vice President", 10000000);
        b1.replaceBigShots(otherPresident2, otherVicePresident2);
        b1.printCompanyReport();
        System.out.println();
        
        b1.giveTellersRaise(5);
        b1.printCompanyReport();
    }
}