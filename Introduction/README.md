### `Hello`
1. In the project, create a new java class named `Hello`
2. Select all the code Bluej puts in my default and delete it
3. Into your BlueJ class file named Hello.java type the following code:

4. (Original instructions had image of code to type)

5. Change the value of the String variable name to be your own name.
6. Compile and run this program.
7. Debug as needed.


### Expanding `Hello` with Variables (int & double)

- Read the comments provided to help you understand what the code is doing and add ONLY the highlighted lines of code to the main method as follows:

```Java
public static void main(String[] args)
{
	String name  = "Tim";
	System.out.println("Hello " + name + " I am Java how are you today.");
	//declare a variable named sumOfAges meant to hold an integer (whole number)
	int sumOfAges;
	//assign a value to the memory location created for sumOfAges
	sumOfAges = 0;
	//print the value stored in sum
	System.out.println("The sum of everyone's age  is currently " + sumOfAges);
	//declare a variable named totalCost of the data type double and assign it 0.0
	double totalCost = 0.0;
}
```

- Debug and test until it runs correctly.
- Declare int variables age1, age2, age3, age4 and assign them appropriate values of your choice.
- Assign sumOfAges the result of adding all the age variables using the + operator.
- Declare the double variables costCandyBar, costSoda, costPopcorn, costTickets and assign them values of your choice.
- Assign totalCost the result of adding all the other costs variables.
- Print out totalCost the same way that sumOfAges was printed.


### `ifHungry`
__Boolean variables and if statements__

Variables of the data type know as boolean can hold only one of two possible values:  **true** or **false**.

Add code for the following to the main method:
- Declare a boolean variable named `isHungry` and set it to true.
- Print out the value of `isHungry` the same way that `sumOfAges` was printed.


The if else statement is used in Java for decision making in your code.  It works as follows:

```Java
if (someCondition)
{
	//do some stuff
}
else
{
	//do different stuff
}
```

__Note:__ `someCondition` must be a boolean expression.


Try adding code to the main method for the following:
- if `isHungry` is true then a certain message is printed out like "You should have eaten breakfast."
- if `isHungry` is false then a different message such as "That's good." is printed.

### `ifAge`
Create a variable to store a person's age and print a message if they are 16 or older and a different message of they are not 16 or older.

### `ifTired`
Create a variable with a name of your own choice to hold true or false.  Print a message of your choice when it is true and another message when it is false.

### `ifWeather`
Create a variable to store temperature and one to hold humidity percentage.  Print a message of your choice when it is above 85 degrees AND 60% humidity or more.

### (I didn't do this one...)
Create a variable to store a person's height and a person's weight.  Print a message of your choice based on a boolean combination (&& || !) of 2 conditions using height and weight.

### `ifHappy`
Create TWO boolean variables (i.e isHungry).  Print 2 possible messages based on boolean combinations of the two variables.


### `whileCounting`
- Use a while loop to print the numbers 1 to 20 along with the text "the count is…"
- Use a while loop to print the numbers 20 to 1 backwards with the text "the count is…".

### `whileTrue`
- Create an example of a while loop that runs forever.
- Create an example of a while loop that runs 0 times.

### `Fibonacci`
CHALLENGE : Create an int variable called num.  Use other variables and a while loop to print the Fibonacci sequence for as many terms as num.  http://whatis.techtarget.com/definition/Fibonacci-sequence
i.e for num = 6  fib number is 5
Fibonacci sequence - 0 1 1 2 3 5 8 13 21...
