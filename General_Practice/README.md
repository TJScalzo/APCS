## Exam Practice 1
### `Car`

Create a class to represent a Car. Include fields, a constructor, and methods as follows:
<br>Car objects should store the following information:
- make (String)
- model (String)
- color (String)
- mileage (double)
- price (double)
- passengerSpace (int)

There are TWO ways to create a new Car:
1. The default car is a black Ford Mustang, starting with 0.0 miles, costing $40,000 and with space
for 2 passengers.
1. The make, model, color, price, and passengerSpace are input via parameter variables. The
mileage starts at 0.0


A Car has the following methods:
- `getMake` – returns the make
- `getModel` – returns the model
- `getColor` – returns the color
- `getMileage` – returns the current mileage.
- `getPrice` – returns the price
- `getPassengerSpace` – returns the number of passengers the car is designed to hold
- `setPrice` – changes the price to new given price.
- `drive` – adds a given amount to the current mileage.
- `printReport` – prints the make, model, color, mileage, price, and number of passengers the car is designed to hold.
- One other MUTATOR method of your choice which makes sense with the concept of a car


### `testCar`
In the following test class, create 2 new cars C1 and C2. C1 should be created using the default
constructor and C2 should be created using the other constructor with whatever input values you
wish.
1. Print a report on both car objects.
2. Set the price of C1 to be $55,000.
3. Drive C2 150 miles.
4. //write a line of code to show you know how to test any accessor method you wish
5. Print a report on both car objects.

```Java
public class testCar
{
  public static void main(String args[])
  {
    //write your code here
  }
}
```

## Statics Practice
### `BankAccount`
Together in class, we will use the idea of adding a static field to make it so the BankAccount class has a unique consecutive ID number for all account objects created.  We will use the idea of keeping track of the NEXT id to be used. This is all called a serial number and the only way to create it is for there to be something all objects of the same class shared which means a static field!

### `Person`
For independent practice, Go back to your Person class and use the idea of static to add an unique id number to all person objects.
