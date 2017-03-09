public class FibonacciGroup implements NumberGroup
{
    private int[] group;
    private int length;
    
    public FibonacciGroup(int length)
    {
        this.length = length;
        group = new int[length];
        int prev2 = 0;
        int prev1 = 1;
        for(int i = 0; i < length; i++) {
            if(i <= 1) {
                group[0] = prev2;
                group[1] = prev1;
            } else {
                group[i] = prev2 + prev1;
                prev2 = prev1;
                prev1 = group[i];
            }
        }
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