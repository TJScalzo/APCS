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
    private int serial;
    private static int nextNum = 0;
    
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
        serial = nextNum;
        nextNum++;
    }
    public Person(String firstName, String lastName, int age, double height, double weight, int IQ, String birthDate, boolean isFemale)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.IQ = IQ; 
        this.birthDate = birthDate;
        this.isFemale = isFemale;
        serial = nextNum;
        nextNum++;
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
                boolean isFemale = (Math.random() > 0.5);
                child = new Person(firstName, father.lastName, 0, 20, 7.5, mother.IQ, birthDate, isFemale);
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