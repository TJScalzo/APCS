### `BankAccount`
I can't find the instructions for this either. Sorry...

### `Employee`
A copy of `Employee` from the `Classes` project.

### `MultiTester`
Create a third class called MultITester.
In MultiTester remove everything except one method:
```Java
  public static void main(String[] args)
{
/* Put code in here */
}
```

__In the main method do the following:__
1. Make three `BankAccount` objects using each constructor once and hitch them to reference variables named as you wish (i.e. b1, b2…., slushFund, etc.)
2. Call deposit and withdraw on each `BankAccount` object.  Use `printInfo` as much as you like to tell if other methods worked.
3. Make one `Employee` object using the constructor with parameters.
4. Call every method one time on the `Employee` object.  Use `printPersonnelRecord` as much as you like to tell if other methods worked.
5. Copy and paste the code of the `MultiTester` class into a google doc and turn in.


### `Bank`

<details><summary>I have the code!</summary><p>
```Java
public class Bank
{
  //fields
  private boolean isOpen;
  private BankAccount account1;
  private BankAccount account2;
  private BankAccount account3;

  //constructors
  public Bank()
  {
    isOpen = true;
    account1 = new BankAccount(300.0,"Alexandra Hamilton" );
    account2 = new BankAccount()
    account3 = new BankAccount(100.0,"Jones of Clark");
  }
  // Assumes three BankAccounts already made:
  public Bank(BankAccount b1, BankAccount b2, BankAccount b3)
  {
    isOpen = true;
    account1 = b1;




  }
  public Bank(double startingAmountForAllAccounts)
  {
    isOpen = true;






  }

//include one more constructor of your choice

}
```
</p></details>
1. Copy and paste the code above to create a new class called Bank and fill in the appropriate code to make the constructors function including a constructor of your own design.
2. Add the following methods to the Bank class
  - `calcTotalFunds` - gets the balance of each account and returns the total of these balances.
  - `chargeFees` - takes a parameter for the fee amount and deducts it from each account.
  - `addInterest` - adds 5% interest to all accounts.
  - `printAllReports` - prints the info for each accounts

### `TestBank`
3. Create a test class called `TestBank` which tests ALL constructors and methods.

### `Bank` (continued)
4. Create a has-a relationship between `Employee` class and the `Bank` class as well by adding fields for five bank employees:
  - president
  - vice president
  - 3 tellers
5. Modify ALL of the existing `Bank` constructors as you see fit.

6. Add the following methods to the Bank class:
  - `fireBigShots` - fires the president and vice president
  - `replaceBigShots` - replaces the president and vice president with new existing `Employee` objects
  - `giveTellersRaise` - gives all tellers a raise input by parameter
  - `printCompanyReport` - prints a report of all accounts and all employees in the `Bank`.

7. Update the `TestBank` class so it tests all new methods. 
