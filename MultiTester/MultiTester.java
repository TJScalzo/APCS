public class MultiTester
{
    public static void main(String[] args)
    {
        BankAccount b1 = new BankAccount();
        BankAccount b2 = new BankAccount(999.99, "Roxanne");
        BankAccount b3 = new BankAccount("'Broke' Joe");
        
        b1.deposit(.01);
        b1.printInfo();
        b1.withdraw(1000);
        b1.printInfo();
        
        b2.deposit(35);
        b2.printInfo();
        b2.withdraw(1256);
        b2.printInfo();
        
        b3.deposit(29669);
        b3.printInfo();
        b3.withdraw(100);
        b3.printInfo();
        
        
        Employee e1 = new Employee("Jane", "Eyre", 17, "Old Maid", 0.0);
        
    }
}