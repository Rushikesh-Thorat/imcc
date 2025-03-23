package InterfaceAbstractpkg;
import java.util.Scanner;
public class AreaDemo {
	public static void main(String[] args) {
		float len, bre, radius;
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter the Length: ");
		len = sc.nextFloat();
		System.out.println("Enter the Breadth: ");
		bre = sc.nextFloat();
		Rectangle rec = new Rectangle(len, bre);
		System.out.println("Calculating Area of Rectangle:");
		rec.compute();
		rec.print();
		System.out.println();
		System.out.println("Enter the Radius: ");
		radius = sc.nextFloat();	
		Circle c = new Circle(radius);
		System.out.println("Calculating Area of Circle:");

		c.compute();
		c.print();
		
		
	}
}
