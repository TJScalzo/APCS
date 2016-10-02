public class ifWeather
{
    public static void main(String[] args)
    {
        double temperature = 90;
        double humidity = .77;
        humidity = humidity * 100; // Changes it from decimal into percentage
        System.out.println("It is " + temperature + " degrees outside with " + humidity + "% humidity.");
        if ((temperature > 85) && (humidity >= 60))
        {
            System.out.println("It's so hot out!");
        }
        else if ((temperature > 85) && !(humidity >= 60))
        {
            System.out.println("It's hot, but at least it's not humid!");
        }
        else if (!(temperature > 85) && (humidity >= 60))
        {
            System.out.println("It's not that hot, but it's still pretty humid!");
        }
        else
        {
            System.out.println("The weather's pretty nice!");
        }
     }
}