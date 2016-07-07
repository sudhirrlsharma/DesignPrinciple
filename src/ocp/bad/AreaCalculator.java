package ocp.bad;

public class AreaCalculator {
	public double area(Rectangle[] shapes) {
		double area = 0;
		for (Shape shape : shapes) {
			if (shape instanceof Rectangle) {
				Rectangle rectangle = (Rectangle) shape;
				area += rectangle.getWidth() * rectangle.getHeight();
			}else{
				 Circle circle = (Circle)shape;
		            area += circle.getRadius() * circle.getRadius() * Math.PI;
			}
		}

		return area;
	}
}
