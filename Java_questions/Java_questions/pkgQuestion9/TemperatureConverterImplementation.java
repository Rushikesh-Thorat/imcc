package pkgQuestion9;

public class TemperatureConverterImplementation implements TemperatureConverter {

	float celcius,farenheit;
	
	
	@Override
	public void convertToFarenheit(float celcius) {
		farenheit = (celcius * 9/5) + 32;
		System.out.println("The celcius Temprature is:"+ celcius + "And it is equivalant to " + farenheit + " Farenheit");
		
	}

	@Override
	public void convertToCelcius(float farenheit) {
		celcius = (farenheit - 32) * 5/9; 
		System.out.println("The farenheit Temprature is:"+ farenheit + "And it is equivalant to " + celcius + " Celcius");

	}
	
	

}
