### Part 1
**Part A** - The first constructor has been done for you except for the isFemale field:

For the gender use the code below which uses the random method from the Math class.  The Math class is built into Java and the random method returns a pretty much random double greater than or equal to 0.0 and less than 1.0.
```java
if (Math.random() > 0.5)
    isFemale = false;
else
    isFemale = true;
```
Test out the class at this point using BlueJ and you should randomly get either female or male Person objects.  (Bonus; there is a slick way to avoid needing this if else statement and accomplishing same thing.  Who can find it?)

**Part B -** Create a 2nd constructor which has parameters that take values to be input for ALL fields.  Remember you can use the inside reference `this` to help here if you wish.  Test it using BlueJ!

**Part C** - Using an if else statement add a better way to print out the gender to the printPersonalReport() than true or false. do NOT change the field from being boolean isFemale, just change how it is printed.

**Part D** - Create 2 mutator methods of your choice.

**Part E** - Create the following rather complicated method createChild.

The createChild method works as follows:

- It takes three inputs:  a reference to another  Person object called `partner`, a String for a child’s first name, and a String for a child’s birthdate
- It returns a reference to a NEW Person object.  This means you will have to use the **new** command inside this method of the Person class and you will use the 2nd constructor of the Person class in this method.
- How it works:
  - First using if statements determine if the parents have opposite genders.
  - HINT: you will need to put IF ELSE statements Inside IF ELSE statements (nesting).
  - HINT: there is a reason we made isFemale boolean - use it.
  - HINT: creating two local Person reference variables (mother and father)is very useful in this method
  - If `this` and `partner` are opposite genders then create a Person object as follows:
    - Using more if else statements determine between this and partner which is the mother and which is the father.
    - Input the child’s last name from the father and the IQ from the mother.
    - Input 7.5 lbs for weight and 20 inches for height.
    - Use first name and birthdate stored in the method parameters.
    - Return the reference to the new person object
  - If `this` and `partner` are NOT opposite genders then print the message “That is not possible with this configuration.” and return null.
- HINT - the user of LOCAL variables is HUGELY helpful in this method!

**Part F** - Test this method using BlueJ making sure it works for all possible inputs.

**Part G** - Add one of your own USEFUL modification to the Person class but **keep cohesiveness** in mind. Here are some suggestions:
- Additional constructors are needed that provide more accurate average heights and weights based on gender.
- Restriction on having children based on age
- A way for one Person object to have a status of “married” or “committed”


### Part 2
Create a relatively simple class of **your choice** that does the following:
- Has a USES (HAS -A) relationship with Person class
- Has at least three fields that are references to Person objects
- Has at least two constructors including a default for easy testing.
- Has a method which accesses using the accessor method and prints the name of all Person objects.
- Has a method which calculates and returns the average height OR average weight OR average age of all the person objects.
- Has a method which uses the createChild method between Person objects and returns or stores a reference to the resulting object.

**Possible names for this class: Family, Commune, HumanRace, Posse, PoliticalParty, (humor ok but don't be offensive)**
