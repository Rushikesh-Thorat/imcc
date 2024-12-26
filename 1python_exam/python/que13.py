# You are designing login form for a user. Using this form, the user can enter wrong password
# maximum 3 times. If he/she tries to log in using the wrong credentials after the third attempt then
# raise, MaximumLoginAttemptsExceededError.

class MaximumLoginAttemptsExceededError(Exception):
    """Custom exception for exceeding the maximum number of login attempts."""
    def __init__(self, message="Maximum login attempts exceeded."):
        self.message = message
        super().__init__(self.message)

def login():
    correct_password = "password123"  # This is a placeholder. In real applications, never hardcode passwords.
    max_attempts = 3
    attempts = 0

    while attempts < max_attempts:
        entered_password = input("Enter your password: ")
        if entered_password == correct_password:
            print("Login successful!")
            return
        else:
            attempts += 1
            print(f"Incorrect password. You have {max_attempts - attempts} attempts left.")

    if attempts >= max_attempts:
        raise MaximumLoginAttemptsExceededError

def main():
    try:
        login()
    except MaximumLoginAttemptsExceededError as e:
        print(e)

if __name__ == "__main__":
    main()
