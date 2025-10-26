package lab5;

public class Circle {
	double radius;
	
	public Circle(double radius)
	{
		this.radius = radius;
	}
	
	public double area()
	{
		return Math.PI*radius*radius;
	}
	
	@Override
	public int hashCode()
	{
		int inHashCode = (int) (radius * 1000);
		int x = 3 + (5*inHashCode + 7);
		int y = x * inHashCode + 13;
		return y*inHashCode;
	}
	
	@Override
	public boolean equals(Object obj)
	{
		if(this == obj)
			return true;
		if(obj == null)
			return false;
		if(this.getClass() != obj.getClass())
			return false;
		Circle otherObj = (Circle) obj;
		return Double.compare(this.radius, otherObj.radius) == 0;
	}
}
