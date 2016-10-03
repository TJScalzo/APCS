public class Dragon
{
    // Fields
    private String color;
    private String morphology;
        private int legs;
        private int size;
        private int wings;
        private int heads;
        private boolean canFly;
    private int age;
    private String name;
    private double amountGold;
    private boolean isFemale;
    // Constructors
    public Dragon()
    {
         color = "Grey";
         morphology = "Eastern";
         legs = 4;
         size = 100;
         wings = 0;
         heads = 1;
         canFly = false;
         age = 1;
         name = "Thuwed";
         amountGold = 0.0;
         isFemale = true;
    }
    public Dragon(String whatColor, String whatMorphology, String whatName, boolean female)
    {
        color = whatColor;
        heads = 1;
        isFemale = female;
        morphology = whatMorphology;
        if (morphology == "Eastern" || morphology == "Drake") {
            legs = 4;
            size = 100;
            wings = 0;
            canFly = false;
        } else if (morphology == "Western") {
            legs = 4;
            size = 100;
            wings = 2;
            canFly = true;
        }
        else if (morphology == "Amphiptere" || morphology == "Lindwurm" || morphology == "Wyvern") {
            legs = 0;
            size = 100;
            wings = 2;
            canFly = true;
            if (morphology == "Lindwurm") {
                legs = 2;
                wings = 4;
                canFly = false;
            }
            if (morphology == "Wyvern") {
                legs = 2;
                wings = 2;
            }
        } else if (morphology == "Pygmy") {
            legs = 4;
            size = 50;
            wings = 2;
            canFly = true;
        } else if (morphology == "Two-Headed") {
            legs = 4;
            size = 120;
            wings = 2;
            heads = 2;
            canFly = true;
        }
        age = 1;
        name = whatName;
        amountGold = 0.0;
    }
    // Methods
    public void stealGold(double howmuch)
    {
        amountGold = amountGold + howmuch;
        System.out.println(name + " now has " + amountGold + " gold now.");
    }
    public void loseGold(double howmuch)
    {
        amountGold = amountGold - howmuch;
        System.out.println(name + " now has " + amountGold + " gold now.");
    }
    public String askName()
    {
        return name;
    }
    public void flyAround()
    {
        if (canFly) {
            System.out.println(name + " flies around for a little bit.");
        } else if (morphology == "Lindwurm"){
            System.out.println(name + " tries to fly around but can't even though they have wings.");
        } else {
            System.out.println(name + " doesn't have wings. Why would you bring up flying?");
            System.out.println("Geez, insensitive much?");
        }
    }
    public void rollInPaint(String paintColor)
    {
        color = paintColor;
        System.out.println(name + " is now a beautiful shade of " + color + ".");
    }
}