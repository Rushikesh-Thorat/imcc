
class Node:
    def __init__(self, data):
        self.data = data
        self.next = None

class SinglyLinkedList:
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

    # Print the list
    def print_list(self):
        current_node = self.head
        while current_node:
            print(current_node.data, end=" -> ")
            current_node = current_node.next
        print("None")

    # Insert a node at a specific position
    def insert(self, data, position):
        new_node = Node(data)
        if position == 0:
            new_node.next = self.head
            self.head = new_node
            return
        current_node = self.head
        for _ in range(position - 1):
            if current_node is None:
                raise ValueError("Position out of bounds")
            current_node = current_node.next
        new_node.next = current_node.next
        current_node.next = new_node

    # Delete the last node
    def delete_last(self):
        if self.head is None:
            return
        if self.head.next is None:
            self.head = None
            return
        current_node = self.head
        while current_node.next.next:
            current_node = current_node.next
        current_node.next = None

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

    # Find the Minimum and Maximum node value
    def find_min_max(self):
        if self.head is None:
            return None, None
        min_val = max_val = self.head.data
        current_node = self.head
        while current_node:
            if current_node.data < min_val:
                min_val = current_node.data
            if current_node.data > max_val:
                max_val = current_node.data
            current_node = current_node.next
        return min_val, max_val

    # Count Even and odd value nodes
    def count_even_odd(self):
        even_count = odd_count = 0
        current_node = self.head
        while current_node:
            if current_node.data % 2 == 0:
                even_count += 1
            else:
                odd_count += 1
            current_node = current_node.next
        return even_count, odd_count

    # Merge two lists
    def merge_lists(self, other_list):
        if self.head is None:
            self.head = other_list.head
            return
        if other_list.head is None:
            return
        current_node = self.head
        while current_node.next:
            current_node = current_node.next
        current_node.next = other_list.head

    # Reverse the list
    def reverse(self):
        prev_node = None
        current_node = self.head
        while current_node:
            next_node = current_node.next
            current_node.next = prev_node
            prev_node = current_node
            current_node = next_node
        self.head = prev_node

# Example usage
list1 = SinglyLinkedList()
list1.append(1)
list1.append(2)
list1.append(3)
print("List 1:")
list1.print_list()

list1.insert(4, 2)
print("List 1 after inserting 4 at position 2:")
list1.print_list()

list1.delete_last()
print("List 1 after deleting last node:")
list1.print_list()

position = list1.search(2)
print(f"Element 2 found at position: {position}")

min_val, max_val = list1.find_min_max()
print(f"Minimum value: {min_val}, Maximum value: {max_val}")

even_count, odd_count = list1.count_even_odd()
print(f"Even nodes: {even_count}, Odd nodes: {odd_count}")

list2 = SinglyLinkedList()
list2.append(5)
list2.append(6)
print("List 2:")
list2.print_list()

list1.merge_lists(list2)
print("List 1 after merging with List 2:")
list1.print_list()

list1.reverse()
print("List 1 after reversing:")
list1.print_list()
