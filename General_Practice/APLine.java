public class APLine
{
    private int a;
    private int b;
    private int c;
    
    public APLine(int a, int b, int c)
    {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public double getSlope()
    {
        double slope = -a/b;
        return slope;
    }
    
    public boolean isOnLine(int x, int y)
    {
        double solution = a*x + b*y + c;
        if (solution == 0)
            return true;
        else
            return false;
    }
}