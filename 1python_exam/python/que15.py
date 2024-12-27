# A world famous rock band is going to play in your city soon and you are designing its ticket booking
# application. Each user is allowed to book 1 to 5 tickets only. If the number of tickets booked by a
# person exceeds 5 then raise, TooManyTicketsBookedError.


class TooManyTicketsBookedError(Exception):
    """Custom exception for booking too many tickets."""
    def __init__(self, message="Cannot book more than 5 tickets."):
        self.message = message
        super().__init__(self.message)

def book_tickets():
    try:
        num_tickets = int(input("Enter the number of tickets you want to book (1-5): "))
        
        if num_tickets < 1 or num_tickets > 5:
            raise TooManyTicketsBookedError
        
        print(f"You have successfully booked {num_tickets} ticket(s). Enjoy the concert!")
        
    except TooManyTicketsBookedError as e:
        print(e)
    except ValueError:
        print("Invalid input. Please enter a number between 1 and 5.")

book_tickets()
