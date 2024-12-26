from pymongo import MongoClient

# Connect to MongoDB
client = MongoClient("mongodb://localhost:27017/")

# Create (or switch to) the database
db = client["MarathonDB"]

# Create (or switch to) the collection
collection = db["Participants"]

# Sample data to add to the collection
participants_data = [
    {"RegistrationNumber": "A001", "Name": "John Doe"},
    {"RegistrationNumber": "A002", "Name": "Jane Smith"},
    {"RegistrationNumber": "A003", "Name": "Alice Johnson"},
    {"RegistrationNumber": "A004", "Name": "Bob Brown"},
    {"RegistrationNumber": "A005", "Name": "Charlie Davis"}
]

# Insert sample data into the collection
collection.delete_many({})  # Clear existing data
collection.insert_many(participants_data)
print("Sample data has been inserted into the collection.")

# Function to delete a participant by registration number
def delete_participant_by_registration_number(registration_number):
    query = {"RegistrationNumber": registration_number}
    result = collection.delete_one(query)
    if result.deleted_count > 0:
        return f"Participant with registration number {registration_number} has been deleted."
    else:
        return f"No participant found with registration number {registration_number}."

# Example usage
registration_number_to_delete = input("Enter the registration number of the participant who has not reported: ")
result_message = delete_participant_by_registration_number(registration_number_to_delete)
print(result_message)
