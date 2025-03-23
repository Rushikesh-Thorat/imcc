package pkgQuestion7;

public class RideBookingDemo {
	public static void main(String[] args) {
	BookARide cabService = new BookARide();
	
	try {
		//Attempt to book seats
		cabService.bookSeat(3);//valid booking
		cabService.bookSeat(5);//This will throw RideOverBooked exception
		
	}catch(RideOverBooked e){
		System.out.println("Error: " + e.getMessage());
	}
	}
}
