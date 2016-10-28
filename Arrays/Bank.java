public class Bank
{
    // Fields
    private String name;
    private boolean isOpen;
    private BankAccount[] accounts;
    private Employee president;
    private Employee vicePresident;
    private Employee tellers[];

    // Constructors
    public Bank()
    {
        isOpen = true;
        name = "Farmington Bank";
        BankAccount[] temp1 = {new BankAccount(300.0, "Tim Barron"),new BankAccount(),new BankAccount(100.0, "Joe Bradley")};
        accounts = temp1;
        president = new Employee("Mr.", "Greg", 35, "President", 1000000000);
        vicePresident = new Employee("I'm", "Rich Too!", 21, "Vice President", 10000000);
        Employee[] temp2 = {new Employee("John", "Smith", 18, "Teller", 100),new Employee("Mary", "Sue", 17, "Teller", 98),new Employee("Jerry", "Sumth", 19, "Teller", 101)};
        tellers = temp2;
    }
    public Bank(BankAccount[] accounts)
    {
        isOpen = true;
        name = "Farmington Bank";
        this.accounts = accounts;
        president = new Employee("Mr.", "Greg", 35, "President", 1000000000);
        vicePresident = new Employee("I'm", "Rich Too!", 21, "Vice President", 10000000);
        Employee[] temp2 = {new Employee("John", "Smith", 18, "Teller", 100),new Employee("Mary", "Sue", 17, "Teller", 98),new Employee("Jerry", "Sumth", 19, "Teller", 101)};
        tellers = temp2;
    }
    public Bank(double startingAmountForAllAccounts, int numberOfAccounts)
    {
        isOpen = true;
        name = "Farmington Bank";
        BankAccount[] temp1 = new BankAccount[numberOfAccounts];
        for (int i=0;i<temp1.length;i++) {
            temp1[i] = new BankAccount(startingAmountForAllAccounts);
        }
        accounts = temp1;
        president = new Employee("Mr.", "Greg", 35, "President", 1000000000);
        vicePresident = new Employee("I'm", "Rich Too!", 21, "Vice President", 10000000);
        Employee[] temp2 = {new Employee("John", "Smith", 18, "Teller", 100),new Employee("Mary", "Sue", 17, "Teller", 98),new Employee("Jerry", "Sumth", 19, "Teller", 101)};
        tellers = temp2;
    }
    public Bank(String name, String pFN, String pLN)
    {
        isOpen = true;
        this.name = name;
        BankAccount[] temp1 = {new BankAccount(300.0, "Tim Barron"),new BankAccount(),new BankAccount(100.0, "Joe Bradley")};
        accounts = temp1;
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