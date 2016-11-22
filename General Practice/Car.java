public class Car
{
	private String make;
	private String model;
	private String color;
	private double price;
	private int passengerSpace;
	private double mileage;
	public Car()
	{
		make = "Ford";
		model = "Mustang";
		color = "black";
		price = 40000;
		passengerSpace = 2;
		mileage = 0.0;
	}
	public Car(String whatMake, String whatModel, String whatColor, double whatPrice, int howManyPassengers)
	{
		make = whatMake;
		model = whatModel;
		color = whatColor;
		price = whatPrice;
		passengerSpace = howManyPassengers;
		mileage = 0.0;
	}
	public String getMake()
	{
		return make;
	}
	public String getModel()
	{
		return model;
	}
	public String getColor()
	{
		return color;
	}
	public double getMileage()
	{
		return mileage;
	}
	public double getPrice()
	{
		return price;
	}
	public int getPassengerSpace()
	{
		return passengerSpace;
	}
	public void setPrice(double newPrice)
	{
		price = newPrice;
	}
	public void drive(double distance)
	{
		mileage = mileage + distance;
	}
	public void printReport()
	{
		System.out.println("DIAGNOSTICS REPORT");
		System.out.println("Make & Model: " + make + " " + model);
		System.out.println("Mileage: " + mileage + " miles");
		System.out.print("Capacity: " + passengerSpace + " people");
		System.out.println("     Price: $" + price);
	}
	public void paintCar(String whatColor)
	{
		color = whatColor;
	}
}