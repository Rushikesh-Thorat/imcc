# For the upcoming sports events, the sports cell of your institute needs to create a separate what's app
# group. Students name and mobile numbers are in "Contacts.txt" file. Read this file and extract only
# the numbers from it. Write the numbers into another file, "MobileNumber.txt" only after verifying that it
# is a valid MOBILE number, else DO NOT write it. Use regex and file handling in python to achieve
# this.

# Assume that the Contacts.txt file has following data:
# abc 919123456788
# pqr 919000000000
# rst 890392
# usv 7858953512


import re

# Step 1: Create the attendance.txt file with the given data
with open("attendance.txt", "w") as file:
    file.write("Akshay\n")
    file.write("Aparna\n")
    file.write("Mayuresh\n")
    file.write("Mithila\n")
    file.write("Robin\n")
    file.write("Rajesh\n")
    file.write("Malhar\n")
    file.write("Ajinkya\n")

# Function to verify attendance using regex
def verify_attendance(student_name):
    with open("attendance.txt", "r") as file:
        data = file.read()
        # Using regex to search for the student name, case insensitive
        if re.search(r'\b' + re.escape(student_name) + r'\b', data, re.IGNORECASE):
            return f"{student_name}'s attendance is marked"
        else:
            return f"{student_name} was absent for the lecture"

student_name = input("Enter student name: ")
result = verify_attendance(student_name)
print(result)


