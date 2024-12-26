# Recently an NGO conducted a survey of 5 families having 6 members each.
# The ages of grandfather,grandmother,father,mother,elder child,young child were taken by the
# volunteers. Unfortunately while entering this data into the program, the values got garbled looking like this:
# First family - 70,5,12,68,40,43
# Second family - 6,10,40,40,69,71
# Third family - 68,65,10,12,40,38
# Fourth family - 65,67,37,5,8,39
# Fifth family - 70,69,36,38,10,8
# Write a python program using numpy arrays which will give
# i)values sorted within the family (youngest age to oldest)
# ii) print the ages of the youngest and oldest member of EACH family


import numpy as np

# Garbled data for 5 families
families = [
    [70, 5, 12, 68, 40, 43], 
    [6, 10, 40, 40, 69, 71], 
    [68, 65, 10, 12, 40, 38], 
    [65, 67, 37, 5, 8, 39], 
    [70, 69, 36, 38, 10, 8]
]

# Convert the list of families to a NumPy array
families_np = np.array(families)

# Loop through each family
for i, family in enumerate(families_np):
    # Sort the family ages
    sorted_ages = np.sort(family)
    # Get the youngest and oldest age
    youngest = sorted_ages[0]
    oldest = sorted_ages[-1]
    # Print the results
    print(f"Family {i + 1} sorted ages: {sorted_ages}")
    print(f"Family {i + 1} youngest: {youngest}, oldest: {oldest}")

