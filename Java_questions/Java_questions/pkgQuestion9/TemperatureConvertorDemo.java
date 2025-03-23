package pkgQuestion9;
import java.util.Scanner;

public class TemperatureConvertorDemo {
     public static void main(String[] args) {
		TemperatureConverterImplementation Obj = new TemperatureConverterImplementation();
//		Obj.convertToCelcius(65);
//		Obj.convertToFarenheit(28);
		float cel,far;
		int opt;
		Scanner sc = new Scanner(System.in);
		System.out.println("1. To convert Celcius to Farenheit");
		System.out.println("2. To convert Farenhehit to Celcius");
		try {
		System.out.println("Enter your choice:");
		opt = sc.nextInt();
		switch (opt) {
		case 1: {
			System.out.println("Enter Temperature in Celcius:");
			cel = sc.nextFloat();
			Obj.convertToFarenheit(cel);
			break;
			
		}
		case 2:{
			System.out.println("Enter Temperature in Farenheit:");
			far = sc.nextFloat();
			Obj.convertToCelcius(far);
			break;
			
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + opt);
		}
		}
		catch(Exception e){
			System.out.println(e);
		}
		
	
     }
}
