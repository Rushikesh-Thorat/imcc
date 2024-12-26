from pymongo import MongoClient

# Connect to MongoDB
client = MongoClient("mongodb://localhost:27017/")

# Create (or switch to) the database
db = client["MCADepartment"]

# Create (or switch to) the collection
collection = db["FacultySubjects"]

# Insert the predefined faculty and subjects data
faculty_subjects = [
    {"FacultyName": "Mr. ABC", "Subject": "Java Programming"},
    {"FacultyName": "Ms. PQR", "Subject": "Full Stack Development"},
    {"FacultyName": "Ms. XYZ", "Subject": "Cyber Security"},
    {"FacultyName": "Mr. JKL", "Subject": "Software Project Management"},
    {"FacultyName": "Mr. LMN", "Subject": "Research Methodology"},
    {"FacultyName": "Ms. BNC", "Subject": "Soft Skills"}
]

# Insert the data into the collection
collection.delete_many({})  # Clear existing data
collection.insert_many(faculty_subjects)
print("Faculty subjects data has been inserted into the collection.")

def fetch_subject_by_faculty_name(faculty_name):
    query = {"FacultyName": faculty_name}
    result = collection.find_one(query)
    if result:
        return result["Subject"]
    else:
        return "This faculty is not teaching any subject in second semester."

def main():
    while True:
        faculty_name = input("Enter the faculty name (or type 'exit' to quit): ")
        if faculty_name.lower() == 'exit':
            break
        subject = fetch_subject_by_faculty_name(faculty_name)
        print(subject)

if __name__ == "__main__":
    main()
