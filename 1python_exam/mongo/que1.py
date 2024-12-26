from pymongo import MongoClient

def get_book_details():
    books = []
    for i in range(5):
        print(f"Enter details for book {i + 1}:")
        title = input("Title: ")
        author = input("Author: ")
        price = float(input("Price: "))
        subject = input("Subject: ")
        publication_year = int(input("Publication Year: "))
        
        book = {
            "Title": title,
            "Author": author,
            "Price": price,
            "Subject": subject,
            "PublicationYear": publication_year
        }
        
        books.append(book)
    return books

def insert_books_to_mongodb(books):
    # Connect to MongoDB
    client = MongoClient("mongodb://localhost:27017/")
    
    # Create (or switch to) the database
    db = client["LibraryDB"]
    
    # Create (or switch to) the collection
    collection = db["Books"]
    
    # Insert books into the collection
    collection.insert_many(books)
    print("Books have been inserted into the collection.")

def main():
    books = get_book_details()
    insert_books_to_mongodb(books)

if __name__ == "__main__":
    main()
