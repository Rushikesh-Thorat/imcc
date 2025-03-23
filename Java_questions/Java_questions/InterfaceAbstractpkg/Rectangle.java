package InterfaceAbstractpkg;

public class Rectangle implements Area {
private double length, breadth, area;

public Rectangle(double length, double breadth) {
	this.length = length;
	this.breadth = breadth;
	}

public void compute() {
	area = length * breadth;
}

public void print() {
	System.out.println("Area of Rectangle: " + area);
}

}
