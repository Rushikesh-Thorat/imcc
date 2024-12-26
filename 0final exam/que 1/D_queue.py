class Node:
    def __init__(self, data):
        self.data = data
        self.next = None

class LinearQueue:
    def __init__(self):
        self.front = None
        self.rear = None

    # Enqueue an element into the queue
    def enqueue(self, data):
        new_node = Node(data)
        if self.rear is None:
            self.front = self.rear = new_node
            return
        self.rear.next = new_node
        self.rear = new_node

    # Dequeue an element from the queue
    def dequeue(self):
        if self.is_empty():
            return "Queue is empty"
        temp = self.front
        self.front = temp.next
        if self.front is None:
            self.rear = None
        return temp.data

    # Check if the queue is empty
    def is_empty(self):
        return self.front is None

    # Reverse the queue using stack
    def reverse_queue(self):
        stack = []
        while not self.is_empty():
            stack.append(self.dequeue())
        while stack:
            self.enqueue(stack.pop())

    # Count the number of occurrences of an element in a queue
    def count_occurrences(self, element):
        count = 0
        current = self.front
        while current:
            if current.data == element:
                count += 1
            current = current.next
        return count

    # Search for an element in the queue
    def search(self, element):
        current = self.front
        position = 0
        while current:
            if current.data == element:
                return position
            current = current.next
            position += 1
        return -1

    # Merge two queues into one
    def merge_queues(self, other_queue):
        merged_queue = LinearQueue()
        current = self.front
        while current:
            merged_queue.enqueue(current.data)
            current = current.next
        current = other_queue.front
        while current:
            merged_queue.enqueue(current.data)
            current = current.next
        return merged_queue

    # Check if two queues are identical
    def are_identical(self, other_queue):
        current1 = self.front
        current2 = other_queue.front
        while current1 and current2:
            if current1.data != current2.data:
                return False
            current1 = current1.next
            current2 = current2.next
        return current1 is None and current2 is None

    # Print the queue
    def print_queue(self):
        current = self.front
        print("Queue:", end=" ")
        while current:
            print(current.data, end=" -> ")
            current = current.next
        print("None")

# Example usage
queue1 = LinearQueue()
queue1.enqueue(10)
queue1.enqueue(20)
queue1.enqueue(30)
print("Original Queue 1:")
queue1.print_queue()

print("\nDequeue an element:")
print(queue1.dequeue())
queue1.print_queue()

print("\nReverse the queue:")
queue1.reverse_queue()
queue1.print_queue()

print("\nCount occurrences of 20:")
print(queue1.count_occurrences(20))

print("\nSearch for element 20:")
print(queue1.search(20))

queue2 = LinearQueue()
queue2.enqueue(40)
queue2.enqueue(50)
print("\nOriginal Queue 2:")
queue2.print_queue()

merged_queue = queue1.merge_queues(queue2)
print("\nMerged Queue:")
merged_queue.print_queue()

print("\nCheck if queue1 and queue2 are identical:")
print(queue1.are_identical(queue2))

print("\nCheck if queue1 and merged_queue are identical:")
print(queue1.are_identical(merged_queue))
