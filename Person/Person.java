public class Person
{
    private String firstName;
    private String lastName;
    private int age;
    private double height;
    private double weight; 
    private int IQ;
    private String birthDate;
    private boolean isFemale;
    
    public Person()
    {
        firstName = "Sam";
        lastName = "Java";
        age = 21;
        height = 66.0;
        weight = 175.0;
        IQ = 100; 
        birthDate = "07-31-2000";
        isFemale = (Math.random() > 0.5);
    }
    public Person(String firstName, String lastName, int age, double height, double weight, int IQ, String birthDate)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.IQ = IQ; 
        this.birthDate = birthDate;
        isFemale = (Math.random() > 0.5);
    }

        public String getFirstName()
    {
        return this.firstName;
    }
    public String getLastName()
    {
        return this.lastName;
    }
    public int getAge()
    {
        return this.age;
    }
    public double getWeight()
    {
        return this.weight;
    }
    public double getHeight()
    {
        return this.height;
    }
    public int getIQ()
    {
        return this.IQ;
    }
    public String getBirthDate()
    {
        return this.birthDate;
    }
    public boolean isPersonFemale()
    {
        return this.isFemale;
    }
    public void lernStuf()
    {
        this.IQ = this.IQ + 1;
    }
    public void sniffMarker(int howLong)
    {
        this.IQ = this.IQ - (int)(howLong * 1.02);
    }
    public void printPersonalReport()
    {
        System.out.println("Name:" + " " + firstName + " " + lastName);
        System.out.println("Age:" + " " + age);
        System.out.println("Height:" + " " + height);
        System.out.println("Weight:" + " " + weight);
        System.out.println("IQ:" + " " + IQ);
        System.out.println("Birthdate:" + " " + birthDate);
        if (!isFemale) {
            System.out.println("The person is male.");
        } else {
            System.out.println("The person is female.");
        }
    }
    public Person createChild(Person partner, String firstName, String birthDate)
    {
        Person mother;
        Person father;
        Person child = null;
        if (child != null) {
            System.out.println("Excuse me, you've already had a child. Leave some room for the rest of us!");
            return null;
        } else {
            if (partner.isFemale == this.isFemale) {
                System.out.println("Sorry, you can't create a child on your own.");
                return null;
            } else {
                if (this.isFemale) {
                    mother = this;
                    father = partner;
                } else {
                    mother = partner;
                    father = this;
                }
                if (mother.age < 13) {
                    if (father.age < 12) {
                        System.out.println("Sorry, you're both way too young to have kids.");
                        return null;
                    } else if (father.age < 15) {
                        System.out.println("She's too young to have kids.");
                        return null;
                    } else {
                        System.out.println("Geez! Don't be gross!");
                        return null;
                    }
                } else if (mother.age < 18) {
                        System.out.println("Are you sure you're ready?");
                        System.out.println("Wait a couple more years...");
                        return null;
                } else if (mother.age >= 45) {
                    System.out.println("I'm sorry... You can't have kids anymore.");
                    return null;
                } else {
                    if (father.age < 12) {
                        System.out.println("He's too young to have kids.");
                        return null;
                    } else if (father.age < 15) {
                        System.out.println("Geez! Don't be gross!");
                        return null;
                    } else {
                        child = new Person(firstName, father.lastName, 0, 20, 7.5, mother.IQ, birthDate);
                        String childNoun;
                        if (child.isFemale) {
                            childNoun = "girl";
                        } else {
                            childNoun = "boy";
                        }
                        System.out.println("Congratulations, it's a " + childNoun + "!");
                        return child;
                    }
                }
            }
        }
    }
}