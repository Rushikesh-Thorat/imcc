package InterfaceAbstractpkg;

public class Circle implements Area {
private double radius, area;


public Circle(double radius) {
	this.radius = radius;
}


public void compute() {
	area = PI * radius * radius;
}

public void print() {
	System.out.println("Area of Circle: " + area);
}
}
