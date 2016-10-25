public class Bank
{
    // Fields
    private String name;
    private boolean isOpen;
    private BankAccount account1;
    private BankAccount account2;
    private BankAccount account3;
    private Employee president;
    private Employee vicePresident;
    private Employee teller1;
    private Employee teller2;
    private Employee teller3;

    // Constructors
    public Bank()
    {
        isOpen = true;
        name = "Farmington Bank";
        account1 = new BankAccount(300.0, "Tim Barron");
        account2 = new BankAccount();
        account3 = new BankAccount(100.0, "Joe Bradley");
        president = new Employee("Mr.", "Greg", 35, "President", 1000000000);
        vicePresident = new Employee("I'm", "Rich Too!", 21, "Vice President", 10000000);
        teller1 = new Employee("John", "Smith", 18, "Teller", 100);
        teller2 = new Employee("Mary", "Sue", 17, "Teller", 98);
        teller3 = new Employee("Jerry", "Sumth", 19, "Teller", 101);
    }
    public Bank(BankAccount b1, BankAccount b2, BankAccount b3)
    {
        isOpen = true;
        name = "Farmington Bank";
        account1 = b1;
        account2 = b2;
        account3 = b3;
        president = new Employee("Mr.", "Greg", 35, "President", 1000000000);
        vicePresident = new Employee("I'm", "Rich Too!", 21, "Vice President", 10000000);
        teller1 = new Employee("John", "Smith", 18, "Teller", 100);
        teller2 = new Employee("Mary", "Sue", 17, "Teller", 98);
        teller3 = new Employee("Jerry", "Sumth", 19, "Teller", 101);
    }
    public Bank(double startingAmountForAllAccounts)
    {
        isOpen = true;
        name = "Farmington Bank";
        account1 = new BankAccount(startingAmountForAllAccounts);
        account2 = new BankAccount(startingAmountForAllAccounts);
        account3 = new BankAccount(startingAmountForAllAccounts);
        president = new Employee("Mr.", "Greg", 35, "President", 1000000000);
        vicePresident = new Employee("I'm", "Rich Too!", 21, "Vice President", 10000000);
        teller1 = new Employee("John", "Smith", 18, "Teller", 100);
        teller2 = new Employee("Mary", "Sue", 17, "Teller", 98);
        teller3 = new Employee("Jerry", "Sumth", 19, "Teller", 101);
    }
    public Bank(String whatName, String pFN, String pLN)
    {
        isOpen = true;
        name = whatName;
        account1 = new BankAccount(300.0, "Tim Barron");
        account2 = new BankAccount();
        account3 = new BankAccount(100.0, "Joe Bradley");
        president = new Employee(pFN, pLN, 35, "President", 1000000000);
        vicePresident = new Employee("I'm", "Rich Too!", 21, "Vice President", 10000000);
        teller1 = new Employee("John", "Smith", 18, "Teller", 100);
        teller2 = new Employee("Mary", "Sue", 17, "Teller", 98);
        teller3 = new Employee("Jerry", "Sumth", 19, "Teller", 101);
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
        System.out.println("ALL REPORTS:");
        System.out.println();
        account1.printInfo();
        System.out.println();
        account2.printInfo();
        System.out.println();
        account3.printInfo();
        System.out.println();
    }
    public void fireBigShots()
    {
        president.fire();
        vicePresident.fire();
    }
    public void replaceBigShots(Employee president2, Employee vicePresident2)
    {
        president = president2;
        vicePresident = vicePresident2;
    }
    public void giveTellersRaise(double howMuch)
    {
        teller1.giveRaise(howMuch);
        teller2.giveRaise(howMuch);
        teller3.giveRaise(howMuch);
    }
    public void printCompanyReport()
    {
        this.printAllReports();
        president.printPersonnelReport();
        System.out.println();
        vicePresident.printPersonnelReport();
        System.out.println();
        teller1.printPersonnelReport();
        System.out.println();
        teller2.printPersonnelReport();
        System.out.println();
        teller3.printPersonnelReport();
    }
}