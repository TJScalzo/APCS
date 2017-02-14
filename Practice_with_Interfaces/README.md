### Interfaces (Challenge 6)
So a Java **interface** is something very different than a class. One way to think about it is that an interface is a **totally abstract class**. In other words, it has no methods that have bodys. Instead, it just lists the methods that would be required by a class. Interfaces typically have no fields and they cannot have constructors because they can NEVER be used to make objects. Instead, their goal is to be a **set of requirements** for classes which **choose to agree to implement** the interface. An interface is kind of like a contract that if you "sign on" by implementing the interface than you MUST include all the methods listed in the interface in your class. Because of this an interface can force to otherwise unrelated classes to both contain the same method.

To see this try the following:
1. Create a new project called Practice with Interfaces.
2. Add the original `Pet` class to the project NOT the one you may have modified.
3. Add your `Person` class from a while ago to the project.
Notice `Pet` and `Person` have very little to with each other.
4. Now create the Movable interface in its own Java file (you will see BlueJ has a separate option for this to make it quicker)
5. It would look like this:
```Java
public interface Moveable
{
    String move();
}
```
6. Make `Pet` implement `Moveable`. You will be required to create a move method which returns a String describing how the `Pet` moves.
7. Make `Person` implement `Moveable` too. You will be required to create a `move()` method which returns a String describing how the `Person` moves.
8. Create a new class in which you will test out the interface called `TestMoveable` and make a main method in it.
9. In the main method, create an `Person` object with a `Person` reference variable `person1`. Inside of a print statement, tell it to `move()`.
10. In the main method, also create an `Pet` object with a `Pet` reference variable `pet1`.  Inside of a print statement, tell it to `move()`.
11. Replace your `Person` reference variable with a `Moveable` reference variable `t1`.  Tell `t1` to `move()`.
12. Replace your `Pet` reference variable with a `Moveable` reference variable `t2`. Tell `t2` to `move()`.
13. Finally create an array of 3 `Moveable` objects and fill it with references to 2 `Persons` and a `Pet`. Loop through and tell them all to `move()`.

#### QUESTIONS
- Can you ever say `new Moveable()`?
- Why?
- What about `new Moveable[10]`?
- Why?
