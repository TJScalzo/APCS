public class MultiTester
{
    public static void main(String[] args)
    {
        // Bank Account Stuff
        BankAccount b1 = new BankAccount();
        BankAccount b2 = new BankAccount(999.99, "Roxanne");
        BankAccount b3 = new BankAccount("'Broke' Joe");
        
        b1.deposit(.01);
        b1.printInfo();
        b1.withdraw(1000);
        b1.printInfo();
        System.out.println();
        
        b2.deposit(35);
        b2.printInfo();
        b2.withdraw(1256);
        b2.printInfo();
        System.out.println();
        
        b3.deposit(29669);
        b3.printInfo();
        b3.withdraw(100);
        b3.printInfo();
        System.out.println();
        
        // Employee Stuff
        Employee e1 = new Employee("Jane", "Eyre", 17, "Old Maid", 0.0);
        
        // Accessor Methods:
        System.out.println("First Name: " + e1.getFirst());
        System.out.println("Last Name: " + e1.getLast());
        System.out.println("ID: " + e1.getID());
        System.out.println();
        
        // Mutator Methods:
        e1.setID("12-345-6789");
        e1.increaseAge();
        e1.giveRaise(0.75);
        e1.printPersonnelReport();
        System.out.println();
        
        e1.changePosition("Wife", 0.0);
        e1.printPersonnelReport();
        System.out.println();
        
        e1.fire();
        e1.printPersonnelReport();
    }
}