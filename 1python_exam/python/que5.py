# Following details of some states and their capitals are given to us: Maharashtra Mumbai Goa Panaji
# Sikkim Gangtok Odisha Bhubaneshwar Bihar Patna
# Add these to a text file titled, StateDetails.txt
# Using pandas, read this file and display the details on the console with the HEADING STATE CAPITAL. Please note that the name of the state and its capital is separated by a space.


import pandas as pd

# Step 1: Create the StateDetails.txt file
with open("StateDetails.txt", "w") as file:
    file.write("Maharashtra Mumbai\n")
    file.write("Goa Panaji\n")
    file.write("Sikkim Gangtok\n")
    file.write("Odisha Bhubaneshwar\n")
    file.write("Bihar Patna\n")

# Step 2: Read the file and display the details using pandas
df = pd.read_csv("StateDetails.txt", sep=" ", header=None, names=["State", "Capital"])

# Displaying the DataFrame with the heading

print(df)
