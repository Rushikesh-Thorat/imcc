# Following details of some avenger and their characteristics are given to us:
# Black widow-fierce fighter
# Thor-funny
# Iron man -Commander Captain America - Defender
# Hulk - Logician
# Add these to a text file titled, AvengerDetails.txt
# Please note that the avenger name is separated by '-' from his/her characteristic
# Using pandas, read this file and display the details on the console with the headings, Avenger Characteristic.



import pandas as pd

# Step 1: Create the AvengerDetails.txt file
with open("AvengerDetails.txt", "w") as file:
    file.write("Black widow-fierce fighter\n")
    file.write("Thor-funny\n")
    file.write("Iron man-Commander\n")
    file.write("Captain America-Defender\n")
    file.write("Hulk-Logician\n")

# Step 2: Read the file and display the details using pandas
df = pd.read_csv("AvengerDetails.txt", sep="-", header=None, names=["Avenger", "Characteristic"])

# Displaying the DataFrame with the heading
print(" Avenger Characteristic")
print(df)
