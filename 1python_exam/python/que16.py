# Traffic signalS across the city have got an upgrade. If the 2 wheelers passing by the signal are
# speeding over 80kms/hr the app captures the vehicle number and issues a chalan to the owner after
# raising OverSpeedingError. Write a python program to achieve this.

class OverSpeedingError(Exception):
    """Custom exception for over-speeding."""
    def __init__(self, message="Speeding over 80 km/hr is not allowed!"):
        self.message = message
        super().__init__(self.message)

def issue_challan(vehicle_number, speed):
    print(f"Challan issued to vehicle number {vehicle_number} for speeding at {speed} km/hr.")

def check_speed():
    try:
        vehicle_number = input("Enter your vehicle number: ")
        speed = float(input("Enter your speed (in km/hr): "))
        
        if speed > 80:
            raise OverSpeedingError
        
        print("You are within the speed limit. Drive safely!")
        
    except OverSpeedingError:
        issue_challan(vehicle_number, speed)
    except ValueError:
        print("Invalid input for speed. Please enter a valid number.")

if __name__ == "__main__":
    check_speed()
