# You have got a garbled data source file. The text in this file (source.txt) consists of small and capital
# letters. You have to read this file line after line and separate the small letters from the capital letters
# using regex. Write the small letters and capital letters into another file, destination.txt. Also, print the
# total number of small letters and capital letters at the end of the program execution. Use file handling
# for reading and writing to the corresponding file.

import re

# Step 1: Create the source.txt file with the given data
with open("source.txt", "w") as file:
    file.write("This is a NEW LINE which We neeD to ChEck!\n")

# Function to separate small and capital letters using regex
def separate_letters(line):
    small_letters = re.findall(r'[a-z]', line)
    capital_letters = re.findall(r'[A-Z]', line)
    return ''.join(small_letters), ''.join(capital_letters)

# Initialize counters for small and capital letters
total_small_letters = 0
total_capital_letters = 0

# Step 2: Read from source.txt, separate letters, and write to destination.txt
with open("source.txt", "r") as source_file, open("destination.txt", "w") as destination_file:
    for line in source_file:
        small, capital = separate_letters(line)
        total_small_letters += len(small)
        total_capital_letters += len(capital)
        destination_file.write(small + '\n')
        destination_file.write(capital + '\n')

# Print the total number of small and capital letters
print(f"Total number of small letters: {total_small_letters}")
print(f"Total number of capital letters: {total_capital_letters}")
