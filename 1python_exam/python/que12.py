# A local bakery is organising Christmas sale. The early bird users can buy one cake and get maximum
# 2 cakes free. Design a form for the user where he/she orders the first PAID cake flavour and adds two
# or less FREE cakes to the cart. If the total number of FREE cakes exceeds two, the program should
# raise, FreebieLimitExceededError.


class FreebieLimitExceededError(Exception):
    """Custom exception for exceeding the limit of free cakes."""
    def __init__(self, message="The number of free cakes exceeds the allowed limit of 2."):
        self.message = message
        super().__init__(self.message)

def order_cakes():
    try:
        paid_cake = input("Enter the flavour of the paid cake: ")
        print("You can add up to 2 free cakes.")
        
        free_cakes = []
        for i in range(2):
            add_free_cake = input(f"Do you want to add a free cake {i+1}? (yes/no): ").strip().lower()
            if add_free_cake == "yes":
                free_cake_flavour = input("Enter the flavour of the free cake: ")
                free_cakes.append(free_cake_flavour)
            elif add_free_cake == "no":
                break
            else:
                print("Invalid input. Please enter 'yes' or 'no'.")
                i -= 1  # to ask the same free cake again in the next iteration
        
        if len(free_cakes) > 2:
            raise FreebieLimitExceededError
        
        print("\nOrder Summary:")
        print(f"Paid Cake: {paid_cake}")
        print(f"Free Cakes: {', '.join(free_cakes)}" if free_cakes else "No free cakes added.")
        
    except FreebieLimitExceededError as e:
        print(e)

order_cakes()
