class Node:
    def __init__(self, data, priority):
        self.data = data
        self.priority = priority
        self.next = None

class PriorityQueue:
    def __init__(self):
        self.front = None

    # Enqueue an element with a given priority
    def enqueue(self, data, priority):
        new_node = Node(data, priority)
        if self.front is None or self.front.priority > priority:
            new_node.next = self.front
            self.front = new_node
        else:
            current = self.front
            while current.next and current.next.priority <= priority:
                current = current.next
            new_node.next = current.next
            current.next = new_node

    # Peek the highest priority element
    def peek(self):
        if self.front is None:
            return "Queue is empty"
        return self.front.data

    # Display Queue
    def display_queue(self):
        current = self.front
        print("Priority Queue:", end=" ")
        while current:
            print(f"({current.data}, {current.priority})", end=" -> ")
            current = current.next
        print("None")

    # Dequeue the element with the highest priority
    def dequeue(self):
        if self.front is None:
            return "Queue is empty"
        highest_priority_node = self.front
        self.front = self.front.next
        return highest_priority_node.data

# Example usage
pq = PriorityQueue()
pq.enqueue('Task1', 3)
pq.enqueue('Task2', 1)
pq.enqueue('Task3', 2)
print("Original Priority Queue:")
pq.display_queue()

print("\nPeek the highest priority element:")
print(pq.peek())

print("\nDequeue the highest priority element:")
print(pq.dequeue())
pq.display_queue()
