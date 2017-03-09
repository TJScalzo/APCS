public class FibonacciGroup implements NumberGroup
{
    private int[] group;
    private int length;
    
    public FibonacciGroup(int length)
    {
        //asdf
    }
    
    public boolean contains(int num)
    {
        for(int i = 0; i < length; i++) {
            if(num == group[i])
                return true;
        }
        return false;
    }
}