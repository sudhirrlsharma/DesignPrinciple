package ocp.good;

public class Rectangle extends Shape {
	public double width;
    public double height;
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	@Override
	public double area() {
		return this.getWidth()*this.getHeight();
	}

}
