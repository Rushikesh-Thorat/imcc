from pymongo import MongoClient

# Connect to MongoDB
client = MongoClient("mongodb://localhost:27017/")

# Create (or switch to) the database
db = client["MarathonDB"]

# Create (or switch to) the collection
collection = db["Participants"]

def delete_participant_by_registration_number(registration_number):
    query = {"RegistrationNumber": registration_number}
    result = collection.delete_one(query)
    if result.deleted_count > 0:
        return f"Participant with registration number {registration_number} has been deleted."
    else:
        return f"No participant found with registration number {registration_number}."

def main():
    while True:
        registration_number = input("Enter the registration number of the participant who has not reported (or type 'exit' to quit): ")
        if registration_number.lower() == 'exit':
            break
        result = delete_participant_by_registration_number(registration_number)
        print(result)

if __name__ == "__main__":
    main()
