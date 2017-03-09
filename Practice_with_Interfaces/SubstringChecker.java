public class SubstringChecker implements Checker
{
    private String substring;
    
    public SubstringChecker(String substring)
    {
        this.substring = substring;
    }
    
    public boolean accept(String text)
    {
        return text.indexOf(substring) != -1;
    }
}