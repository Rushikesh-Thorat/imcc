# You are working on data compressing application. As a part of this, you have to read from the source
# text file and eliminate the white spaces in each line. Once the line is without white spaces (compact
# format), you have to write it to another file, compact.txt
# Use regex and file handling in python to achieve this.


import re

# Step 1: Create the source.txt file with the given data
with open("source.txt", "w") as file:
    file.write("this is a text file\n")
    file.write(" with so many sp a ces\n")
    file.write("can you read this?? ? ?\n")
    file.write(" and then there is thi s\n")

# Function to remove white spaces using regex
def remove_whitespace(line):
    return re.sub(r'\s+', '', line)

# Step 2: Read from source.txt, eliminate white spaces, and write to compact.txt
with open("source.txt", "r") as source_file, open("compact.txt", "w") as compact_file:
    for line in source_file:
        compact_line = remove_whitespace(line)
        compact_file.write(compact_line + "\n")

print("Whitespace removal and writing to compact.txt completed.")
