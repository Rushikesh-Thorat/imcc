from pymongo import MongoClient

# Connect to MongoDB
client = MongoClient("mongodb://localhost:27017/")

# Create (or switch to) the database
db = client["ManufacturingUnit"]

# Create (or switch to) the collection
collection = db["EmployeeLeaves"]

# Insert predefined employees data
employees_data = [
    {"Name": "John", "Designation": "Manager", "TotalLeavesAllotted": 24, "LeavesTaken": 0, "RemainingLeaves": 24},
    {"Name": "Alice", "Designation": "Floor supervisor", "TotalLeavesAllotted": 30, "LeavesTaken": 0, "RemainingLeaves": 30},
    {"Name": "Bob", "Designation": "Machine staff", "TotalLeavesAllotted": 36, "LeavesTaken": 0, "RemainingLeaves": 36}
]

# Insert the data into the collection
collection.delete_many({})  # Clear existing data
collection.insert_many(employees_data)
print("Employee leaves data has been inserted into the collection.")

def update_leaves(designation, leaves_taken):
    # Fetch the employee record by designation
    employee = collection.find_one({"Designation": designation})
    if employee:
        total_leaves_allotted = employee["TotalLeavesAllotted"]
        remaining_leaves = total_leaves_allotted - leaves_taken
        collection.update_one(
            {"_id": employee["_id"]},
            {"$set": {"LeavesTaken": leaves_taken, "RemainingLeaves": remaining_leaves}}
        )
        return f"Updated leaves for {designation}. Remaining leaves: {remaining_leaves}"
    else:
        return f"No employee found with designation {designation}"


designation = input("Enter the employee's designation : ")
leaves_taken = int(input(f"Enter the number of leaves taken by {designation}: "))
result = update_leaves(designation, leaves_taken)
print(result)

