package ocp.good;

public class AreaCalculator {
	public double area(Rectangle[] shapes) {
		double area = 0;
		for (Shape shape : shapes) {
			area += shape.area();
		}

		return area;
	}
}
