public class Equations
{
    public static void squaringN() {
        System.out.println("|   N   |  N Squared  | Square Root of N |  N Cubed  |  N to the 1/3  |");
        for (int n = 1; n <= 126; n = n + 5)
        {
            System.out.print("|  ");
            System.out.print(n);
            System.out.print("  |  ");
            System.out.print(Math.pow(n, 2));
            System.out.print("  |  ");
            System.out.print(Math.sqrt(n));
            System.out.print("  |  ");
            System.out.print(Math.pow(n, 3));
            System.out.print("  |  ");
            System.out.print(Math.pow(n, 1/3));
            System.out.println("  |");
        }
    }
    
    public static double distanceBig(double x1, double y1, double x2, double y2) {
        double part1 = Math.pow((x2 - x1), 2);
        double part2 = Math.pow((y2 - y1), 2);
        double d = Math.sqrt(part1 + part2);
        return d;
    }
    public static double distance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2));
    }
}