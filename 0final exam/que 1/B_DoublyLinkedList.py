class Node:
    def __init__(self, data):
        self.data = data
        self.next = None
        self.prev = None

class DoublyLinkedList:
    def __init__(self):
        self.head = None

    # Append a node at the end of the list
    def append(self, data):
        new_node = Node(data)
        if self.head is None:
            self.head = new_node
            return
        last_node = self.head
        while last_node.next:
            last_node = last_node.next
        last_node.next = new_node
        new_node.prev = last_node

    # Print the list
    def print_list(self):
        current_node = self.head
        while current_node:
            print(current_node.data, end=" <-> ")
            current_node = current_node.next
        print("None")

    # Insert a node at the beginning of the list
    def insert_at_beginning(self, data):
        new_node = Node(data)
        if self.head is None:
            self.head = new_node
            return
        new_node.next = self.head
        self.head.prev = new_node
        self.head = new_node

    # Delete a node at a specific position
    def delete_at_position(self, position):
        if self.head is None:
            return
        current_node = self.head
        if position == 0:
            self.head = current_node.next
            if self.head:
                self.head.prev = None
            return
        for _ in range(position):
            current_node = current_node.next
            if current_node is None:
                return
        if current_node.next:
            current_node.next.prev = current_node.prev
        if current_node.prev:
            current_node.prev.next = current_node.next

    # Search for an element in the list
    def search(self, key):
        current_node = self.head
        position = 0
        while current_node:
            if current_node.data == key:
                return position
            current_node = current_node.next
            position += 1
        return -1

    # Count total nodes
    def count_nodes(self):
        count = 0
        current_node = self.head
        while current_node:
            count += 1
            current_node = current_node.next
        return count

    # Delete middle node
    def delete_middle_node(self):
        if self.head is None:
            return
        slow_ptr = self.head
        fast_ptr = self.head
        while fast_ptr and fast_ptr.next:
            fast_ptr = fast_ptr.next.next
            slow_ptr = slow_ptr.next
        if slow_ptr.prev:
            slow_ptr.prev.next = slow_ptr.next
        if slow_ptr.next:
            slow_ptr.next.prev = slow_ptr.prev

    # Reverse the list
    def reverse(self):
        current_node = self.head
        temp = None
        while current_node:
            temp = current_node.prev
            current_node.prev = current_node.next
            current_node.next = temp
            current_node = current_node.prev
        if temp:
            self.head = temp.prev

# Example usage
dll = DoublyLinkedList()
dll.append(1)
dll.append(2)
dll.append(3)
print("Original List:")
dll.print_list()

dll.insert_at_beginning(0)
print("List after inserting 0 at the beginning:")
dll.print_list()

dll.delete_at_position(2)
print("List after deleting node at position 2:")
dll.print_list()

position = dll.search(3)
print(f"Element 3 found at position: {position}")

total_nodes = dll.count_nodes()
print(f"Total number of nodes: {total_nodes}")

dll.delete_middle_node()
print("List after deleting the middle node:")
dll.print_list()

dll.reverse()
print("List after reversing:")
dll.print_list()
