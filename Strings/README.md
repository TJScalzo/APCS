### Part 0: Practice with String methods:
Use String concatenation `(+)`, `length()`, `indexOf()`, and `substring()` methods to solve these short problems. You can use the [AP Quick Reference guide](http://apcentral.collegeboard.com/apc/public/repository/ap_comp_sci_a_quick_reference.pdf) to help you.

BEFORE you write ANY code, I want you to write PSEUDO code in your own words for each of these which describes how you think you would do each of them. This will be collected along with your code. Think about which String methods  - (`indexof` `substring` `length`) that you will need as well as temporary reference variables and looping.


1. Write a method named `findComma` to return the location of the first comma in a given String. Return -1 if no comma is found.
2. Write a method named `isVowel` that returns true if the first letter in a given word is vowel.
3. Write a method named `removeMiddle` to return a given word with either the middle character or middle two characters removed depending on if the length is even or odd.
4. Write a method named `chopSwitch` which breaks a given String (i.e  "frontback") in half as evenly as possible and returns it with the two halves switched (i.e "backfront").
5. Write a method named `scroll` which moves the first character of a given string to the end of the string and returns the new string.
6. Write a method named `switchx2o` which loops through a given String and changes all "x" to "o".



### Part 1: Practice with String methods:

Implement a method for each problem in a class with a single static main method. Make all other methods static as well. Test each method by calling and printing in the main method. Remember as you do these that Strings are objects and that they are IMMUTABLE!

```Java
public class StringPractice1
{
  public static void main(String[] args)
  {
    String s = “Some kind of test string”;
    System.out.println(“Testing findComma: ” + findComma(s));
  }

  public static int findComma(String input)
  {
    //blah blah
  }
}
```

Some methods may need loops - here is some refresher help on loops:
```Java
for (int i = 0; i < 15; i++)
{
  //statements that are repeated a known number of times
}

int i = 0;
while (i < 15)
{
  //statements that are repeated as long as condition is true
  i++;
}
```

#### `findComma`
Returns the location of the first comma in a given String. Return -1 if no comma is found.

#### `isVowel`
Returns true if the first letter in a given word is vowel.

#### `removeMiddle`
Returns a given word with either the middle character or middle two characters removed depending on if the length is even or odd.

#### `chopSwitch`
Breaks a given String (i.e  "frontback") in half as evenly as possible and returns it with the two halves switched (i.e "backfront").

#### `scroll`
Moves the first character of a given string to the end of the string and returns the new string.

#### `switchx2o`
Loops through a given String and changes all "x" to "o".
