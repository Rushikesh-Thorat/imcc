package pkgQuestion7;

public class BookARide {
	private static final int MAX_SEATS = 4;//Maximum number of seats in the cab.
	
	//method to book seats.
	public void bookSeat(int totalNoOfBooking) throws RideOverBooked{
		if (totalNoOfBooking > MAX_SEATS) {
			throw new RideOverBooked("Cannot book more than " + MAX_SEATS + " seats. Requested seats: " + totalNoOfBooking);
			}else {
				System.out.println(totalNoOfBooking + " seat(s) booked successfully!");
				
			}
	}
}
