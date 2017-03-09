public class AndChecker implements Checker
{
    private Checker substring1;
    private Checker substring2;
    
    public AndChecker(Checker substring1, Checker substring2)
    {
        this.substring1 = substring1;
        this.substring2 = substring2;
    }
    
    public boolean accept(String text)
    {
        return substring1.accept(text) && substring2.accept(text);
    }
}