# You are enrolling for a driving school. The program takes your name, address, and age. If the age is
# less than 18, the program raises, LearnerUnderAgeError. Write the program in Python to achieve this
# business requirement.
class LearnerUnderAgeError(Exception):
    """Custom exception for learners under the age of 18."""
    def __init__(self, message="Learner is underage for enrolling in the driving school. Must be at least 18 years old."):
        self.message = message
        super().__init__(self.message)

def enroll_in_driving_school():
    try:
        name = input("Enter your name: ")
        address = input("Enter your address: ")
        age = int(input("Enter your age: "))

        if age < 18:
            raise LearnerUnderAgeError
        
        print("Enrollment successful!")
        print(f"Name: {name}")
        print(f"Address: {address}")
        print(f"Age: {age}")

    except LearnerUnderAgeError as e:
        print(e)
    except ValueError:
        print("Invalid input for age. Please enter a valid number.")

enroll_in_driving_school()
