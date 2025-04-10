package graphics;

public class Square implements figure
{
	private double side;
	public Square(double side)
	{
		this.side=side;
	}
	public double area()
	{
		return side*side;
	}
}
