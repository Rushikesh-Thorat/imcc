from pymongo import MongoClient

# Connect to MongoDB
client = MongoClient("mongodb://localhost:27017/")

# Create (or switch to) the database
db = client["JukeBox"]

# Create (or switch to) the collection
collection = db["Songs"]

# Insert the predefined singer and songs data
songs_data = [
    {"Singer": "Sonu Nigam", "Songs": ["Kal ho na ho", "Mein agar kahu", "Abhi mujhme kahi", "Tumse milke dil ka", "Yeh dil diwana"]},
    {"Singer": "Arijit Singh", "Songs": ["Tera yaar hu mein", "Sajni re", "Phir le aya dil", "Kabira", "Kabhi jo badal barse"]},
    {"Singer": "Shreya Ghoshal", "Songs": ["Mere dholna", "Param sundari", "Jadu hai nasha hai", "More piya", "Tare ginn"]}
]

# Insert the data into the collection
collection.delete_many({})  # Clear existing data
collection.insert_many(songs_data)
print("Songs data has been inserted into the collection.")

def fetch_songs_by_singer(singer_name):
    query = {"Singer": singer_name}
    result = collection.find_one(query)
    if result:
        return result["Songs"]
    else:
        return "This singer has no songs in the database."


singer_name = input("Enter the singer's name : ")

songs = fetch_songs_by_singer(singer_name)
if isinstance(songs, list):
    print(f"Songs by {singer_name}:")
    for song in songs:
        print(f"- {song}")
else:
    print(songs)


