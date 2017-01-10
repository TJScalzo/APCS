## Parts 1 & 2
### `ArrayTester`

1. Declare and create a new array object called `Powerball` of 6 ints.
2. Loop through elements 0 through 4 in the array and using Math.random() assign a random int from 1 to 69 to the array.
3. Assign a random int from 1 to 26 to element 5 (last spot in array)
4. Print out the message "These are your PowerBall numbers" and then loop through the whole array and print the number in each element."

1. Declare and create a new array object of 5 String objects called Sayings
2. Load short (G rated) sayings into each element of the array.
3. i.e
  - "Only the good die young."
  - "Less is more."
  - "Necessity is the mother of invention."
  - "Taking first step often gets you more than halfway there."
  - "Don't be a lemming!"
4. Loop through  and  print each element in the array.
5. Using Math.random() again and the length of the array print a random saying.

<details><summary>**Solution**</summary><p>

```Java
//main method
  public static void main(String[] args) {
    int[] PowerBall = new int[6];
    for (int count = 0; count < PowerBall.length -1 ; count++) {
        PowerBall[count] = (int)(Math.random() * 69 + 1);
      }
    PowerBall[PowerBall.length -1] = (int)(Math.random() * 26 + 1);
    System.out.println("These are your PowerBall numbers:");
    for (int count = 0; count < PowerBall.length; count++) {
        System.out.print(PowerBall[count] + " ");
      }
    System.out.println();

    String[] Sayings = new String[5];
    Sayings[0] = "Only the good die young.";
    Sayings[1] = "Less is more.";
    Sayings[2] = "Necessity if the mother of invention.";
    Sayings[3] = "Taking first step often gets you more than halfway there.";
    Sayings[4] = "Don't be a lemming!";
    for (int count = 0; count < Sayings.length; count++) {
        System.out.println(Sayings[count]);
      }

   System.out.print("Random saying: " + Sayings[(int)(Math.random() * Sayings.length)]);
  }
```</details>

## Part 3:
### `BankAccount`, `Bank`, & `Employee`

1. Go all the way back to your `BankAccount` class and `Bank` class.
2. Copy and paste the code for `Bank` into a new class called `BetterBank`.
3. Reimplement the `Bank` as an array of `BankAccount` objects and redo all methods. You'll need to add a lot of looping.

I actually did this part before it was assigned because I was a little ahead in class. I decided to also redo the `Employee` class.
