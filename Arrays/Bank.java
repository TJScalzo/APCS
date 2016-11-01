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
        Employee[] temp2 = {new Employee("John", "Smith", 18, "Teller", 100),new Employee("Mary", "Sue", 17, "Teller", 98),new Employee("Jerry", "Sumth", 19, "Teller", 101)};
        tellers = temp2;
    }
    // Methods
    public double calcTotalFunds()
    {
        double totalFunds;
        for (int i=0;i<accounts.length;i++) {
            totalFunds = totalFunds + accounts[i].getBalance();
        }
        return totalFunds;
    }
    public void chargeFees(double feeAmount)
    {
        for (int i=0;i<accounts.length;i++) {
            accounts[i].withdraw(feeAmount);
        }
    }
    public void addInterest()
    {
        for (int i=0;i<accounts.length;i++) {
            accounts[i].deposit(accounts[i].getBalance()*.05);
        }
    }
    public void printAllReports()
    {
        System.out.println("ALL REPORTS:");
        for (int i=0;i<accounts.length;i++) {
            System.out.println();
            accounts[i].printInfo();
        }
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