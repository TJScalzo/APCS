public class Employee
{
    // Fields
    private String firstName;
    private String lastName;
    private int age;
    private String idNum;
    private String title;
    private double salary;
    // Constructors
    public Employee()
    {
        firstName = "Mary";
        lastName = "Sue";
        age = 21;
        idNum = "31-415-9265";
        title = "The Chosen One";
        salary = 66666.66;
    }
    public Employee(String fN, String lN, int a, String t, double s)
    {
        firstName = fN;
        lastName = lN;
        age = a;
        idNum = "00-000-0000";
        title = t;
        salary = s;
    }
    // Methods
    public String getFirst()
    {
        return firstName;
    }
    public String getLast()
    {
        return lastName;
    }
    public void setID(String newIdNum)
    {
        idNum = newIdNum;
    }
    public String getID()
    {
        return idNum;
    }
    public void increaseAge()
    {
        age++;
    }
    public void giveRaise(double raise)
    {
        salary = salary + raise;
    }
    public void changePosition(String newTitle, double newSalary)
    {
        title = newTitle;
        salary = newSalary;
    }
    public void fire()
    {
        title = "TERMINATED";
        salary = 0.0;
    }
    public void printPersonnelReport()
    {
        System.out.println("PERSONNEL REPORT:");
        System.out.println(lastName + ", " + firstName + " (" + idNum + ")");
        System.out.println("AGE: " + age);
        System.out.print("TITLE: " + title + "  ");
        System.out.println("  SALARY: $" + salary);
    }
}