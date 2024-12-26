# Sports cell of your college has received the names of 12 cricket players in NAME:AGE format. Write a
# program using numpy which will SPLIT the name from age and print only the list of 12 names of the
# players on the screen.
# ["ABC:22","PQR:21","XYZ:22","DEF:23","
# DAS:21","GHF:22","JHK:22","RST:21","YUG:
# 21","OPL:22","BNM:23","FBV:21"]

import numpy as np

# Given list of players in NAME:AGE format
players = np.array([
    "ABC:22", "PQR:21", "XYZ:22", "DEF:23",
    "DAS:21", "GHF:22", "JHK:22", "RST:21",
    "YUG:21", "OPL:22", "BNM:23", "FBV:21"
])

# Split the names from the ages
names = np.array([player.split(':')[0] for player in players])

# Print the list of names
print("List of player names:", names)
