# On the newly built Samruddhi highway, the national government has implemented speed limit to keep
# the commuters safe. Your application takes the speed value from the user. If the value is beyond 120
# kms/hr, raise, SpeedingLimitExceededError and issue a chalan to the speeding driver after taking
# his/her vehicle number.

class SpeedingLimitExceededError(Exception):
    """Custom exception for exceeding the speed limit."""
    def __init__(self, message="Speed limit exceeded!"):
        self.message = message
        super().__init__(self.message)

def issue_challan(vehicle_number, speed):
    print(f"Challan issued to vehicle number {vehicle_number} for speeding at {speed} km/hr.")

def main():
    try:
        speed = float(input("Enter your speed (in km/hr): "))
        if speed > 120:
            vehicle_number = input("Enter your vehicle number: ")
            raise SpeedingLimitExceededError
        else:
            print("You are within the speed limit. Drive safely!")

    except SpeedingLimitExceededError:
        issue_challan(vehicle_number, speed)
    except ValueError:
        print("Invalid input for speed. Please enter a valid number.")

if __name__ == "__main__":
    main()
