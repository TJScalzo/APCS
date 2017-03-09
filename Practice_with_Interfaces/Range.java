public class Range implements NumberGroup
{
    private int[] group;
    private int length;
    
    public Range(int min, int max)
    {
        length = max - min + 1;
        group = new int[length];
        for(int i = 0; i < length; i++) {
            group[i] = min + i;
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
