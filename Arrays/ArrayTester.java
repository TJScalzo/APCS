public class ArrayTester
{
     public static void main(String[] args)
    {
        int[] Powerball = new int[6];
        for(int i = 0; i < Powerball.length - 1; i++) {
            Powerball[i] = (int)(Math.random() * 69 + 1);
        }
        Powerball[Powerball.length - 1] = (int)(Math.random() * 26 + 1);
        System.out.println("These are your PowerBall numbers:");
        for(int i = 0; i < Powerball.length - 1; i++) {
            System.out.println(Powerball[i] + " ");
        }
        System.out.println();
        
        String[] Sayings = new String[5];
        Sayings[0] = "A fool and his money are soon parted.";
        Sayings[1] = "An apple a day keeps the hunger away.";
        Sayings[2] = "All Greek to me!";
        Sayings[3] = "Cut the mustard.";
        Sayings[4] = "Down and Out in the Magic Kingdom";
        for(int i = 0; i < Sayings.length; i++) {
            System.out.println(Sayings[i]);
        }
        System.out.print("Random saying: " + Sayings[(int)(Math.random() * Sayings.length)]);
    }
}