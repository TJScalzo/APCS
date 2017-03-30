public class Shark extends Fish
{
    public Shark()
    {
         super();
    }
    
    //methods
    public void eat(Fish victim)
    {
        victim.die();
    }
}
