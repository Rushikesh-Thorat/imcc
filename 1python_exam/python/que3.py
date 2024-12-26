# The admin office of the college has taken first names of the students in a separate array and last
# names in another separate array. While printing the full name of each student the first name from one
# array should be appended to the last name from the other array. The appended names should be
# stored in a third array called, fullName. Write a program in numpy to achieve this and print the final
# array, fullName


import numpy as np

# Given lists
first_names = np.array(["Ram", "Abhay", "Murli", "Neha", "Monika", "Mangal", "Bholenath", "Sunanda"])
last_names = np.array(["Singh", "Kumar", "Sharma", "Mishra", "Sherpa", "Rajput", "Pujari", "Kashyap"])

# Create full names by concatenating first and last names
full_names = np.char.add(np.char.add(first_names, ' '), last_names)

# Print the full names array
print("Full names array:", full_names)
