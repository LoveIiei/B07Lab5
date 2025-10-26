package lab5;
public class Rectangle {
	double x;
	double y;
	
	public Rectangle(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public double area() {
		return x * y;
	}

	@Override
	public int hashCode() {
		int hx = Double.hashCode(x);
    	int hy = Double.hashCode(y);
    	return 31 * hx + hy;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Rectangle other = (Rectangle) obj;
		return Double.compare(this.x,  other.x) == 0.0 && Double.compare(this.y,  other.y) == 0.0;
	}
}
