## Investigating `ints` and `doubles` in Java


### `testLimits`
**Investigating the limits of Java data types `int` and `long`**

1. Create a new class named `testLimits` that only has a main method:
```Java
public static void main(String[] args)
{
  // Code goes here
}
```
2. Put the following code with a for loop in the main method:
```Java
int value = 1;
for (int i = 0; i < 10; i++)
{
  System.out.println("10 to the " + i + " = " + value);
  value = value * 10;
}
```
3. Determine what this code does and how.
4. If the loop were to run 3 more times, what do you expect will happen?
5. What actually happens?
6. Modify the loop so that it prints out powers of 2.
  - Test it for up to 2 to the 19th.
  - Keep increasing the power of 2 until something weird happens.
  - What happens and when?
  - Why do you think this odd result is happening?
  - See https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html for help.
7. Change the int data type to long in the loop.
  - What is the result?
  - Can you find when weirdness happens for longs?
8. What do you think is the cause of this weirdness?
  - Write down your thoughts.
  - Investigate some more if you'd like.
  - See https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html for help.

To help you answer above, answer the following: What is max value you can hold in 4 bits? 6 bits? 8 bits? 16 bits? N bits? 32 bits? 31 bits?


### `doubleTrouble`
**Trouble with the `double`**

1. Create a new class named `doubleTrouble` that only has a main method:
```Java
public static void main(String[] args)
{
  // Code goes here
}
```
2. In the main method put this code:
```Java
double sum = 0.0;
for (int i = 0; i < 20; i++)
{
  System.out.println(sum);
  sum = sum + 0.4;
}
```
3. Before you run it, what do you predict the result will be? Try it and see.
  - DID SOMETHING WEIRD HAPPEN?
4. What do you think is the cause of this weirdness?
  - Write down your thoughts.
  - Investigate some more if you'd like.
  - See http://www.exploringbinary.com/why-0-point-1-does-not-exist-in-floating-point/ for help.
