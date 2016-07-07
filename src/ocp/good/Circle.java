package ocp.good;

public class Circle extends Shape{
	double radius;

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double area() {
		return  this.getRadius()*this.getRadius()*Math.PI;
	} 

}
