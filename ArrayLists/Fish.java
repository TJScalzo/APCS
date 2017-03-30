public class Fish
{
    // Instance variables
    private int age;
    private String color;
    private boolean isAlive;
    
    // Constructor
    public Fish()
    {
        age = 1;
        color = "gray";
        isAlive = true;
    }
    // Methods
    public void swim()
    {
        String plural = "s";
        if (age == 1)
            plural = "";
        if (isAlive)
            System.out.println("The " + color + " fish, which is " + age + " year" + plural + " old, is swimming....");
        else
            System.out.println("Dead fish can't swim with the fishes.");
    }
    
    public String getColor()
    {
        return color;
    }
    
    public void setColor(String c)
    {
        color = c;
    }
    
    public int getAge()
    {
        return age;
    }
    
    public void setAge(int a)
    {
        age = a;
    }
    
    public void die()
    {
        isAlive = false;
    }
    
    public boolean getIsAlive()
    {
        return isAlive;
    }
}