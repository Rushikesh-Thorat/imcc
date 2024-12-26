# In the recent IPL season, player, ABC bolwed 6 overs each in 3 matches. His bowling score in the
# first match was, 12 runs, 10 runs, 2 runs, 3 runs, 5 runs, 0 run. In the second match it was, 20 runs, 2
# runs, 3 runs, 0 runs, 15 runs, 4 runs and in the final match it was, 10 runs, 8 runs, 3 runs, 0 runs, 0
# runs, 9 runs. Using numpy, can you find the mean of his bowling score in each match?


import numpy as np

# Bowling scores for each match
match1 = np.array([12, 10, 2, 3, 5, 0])
match2 = np.array([20, 2, 3, 0, 15, 4])
match3 = np.array([10, 8, 3, 0, 0, 9])

# Calculate the mean for each match
mean_match1 = np.mean(match1)
mean_match2 = np.mean(match2)
mean_match3 = np.mean(match3)

print(f"Mean bowling score in the first match: {mean_match1}")
print(f"Mean bowling score in the second match: {mean_match2}")
print(f"Mean bowling score in the third match: {mean_match3}")
