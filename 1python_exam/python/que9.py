# For the upcoming sports events, the sports cell of your institute needs to create a separate what's app
# group. Students name and mobile numbers are in "Contacts.txt" file. Read this file and extract only
# the numbers from it. Write the numbers into another file, "MobileNumber.txt" only after verifying that it
# is a valid MOBILE number, else DO NOT write it. Use regex and file handling in python to achieve
# this

import re

# Step 1: Create the Contacts.txt file with the given data
with open("Contacts.txt", "w") as file:
    file.write("abc 919123456788\n")
    file.write("pqr 919000000000\n")
    file.write("rst 890392\n")
    file.write("usv 7858953512\n")

# Function to verify if a number is a valid mobile number using regex
def is_valid_mobile_number(number):
    return re.fullmatch(r'[789]\d{9}', number) is not None

# Step 2: Read from Contacts.txt, extract valid mobile numbers, and write to MobileNumber.txt
with open("Contacts.txt", "r") as source_file, open("MobileNumber.txt", "w") as destination_file:
    for line in source_file:
        name, number = line.split()
        if is_valid_mobile_number(number[-10:]):
            destination_file.write(number[-10:] + "\n")

print("Valid mobile numbers have been written to MobileNumber.txt.")
