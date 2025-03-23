package pkgQuestion9;
 
public interface TemperatureConverter {
	float celcius = 0;
	float farenheit = 0;
	
	public void convertToFarenheit(float celcius);
	
	public void convertToCelcius(float farenheit);
	
	public static void about() {
		System.out.println("This is the interface for defining the methods to convert celcius to farenheit and faranheit to celcius.");
	}
	
}
