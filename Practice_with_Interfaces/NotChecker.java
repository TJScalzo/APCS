public class NotChecker implements Checker
{
    private String substring;
    
    public NotChecker(String substring)
    {
        this.substring = substring;
    }
    
    public boolean accept(String text)
    {
        return text.indexOf(substring) == -1;
    }
}