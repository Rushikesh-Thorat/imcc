class Node:
    def __init__(self, data):
        self.data = data
        self.next = None

class Stack:
    def __init__(self):
        self.top = None

    # Push an element onto the stack
    def push(self, data):
        new_node = Node(data)
        new_node.next = self.top
        self.top = new_node

    # Pop an element from the stack
    def pop(self):
        if self.is_empty():
            return "Stack is empty"
        popped_node = self.top
        self.top = self.top.next
        return popped_node.data

    # Check if the stack is empty
    def is_empty(self):
        return self.top is None

    # Count the number of elements in the stack
    def size(self):
        count = 0
        current_node = self.top
        while current_node:
            count += 1
            current_node = current_node.next
        return count

    # Reverse the stack
    def reverse(self):
        prev_node = None
        current_node = self.top
        while current_node:
            next_node = current_node.next
            current_node.next = prev_node
            prev_node = current_node
            current_node = next_node
        self.top = prev_node

    # Reverse a string using Stack
    def reverse_string(self, input_str):
        for char in input_str:
            self.push(char)
        reversed_str = ''
        while not self.is_empty():
            reversed_str += self.pop()
        return reversed_str

    # Check for balanced parenthesis
    def check_balanced_parenthesis(self, expression):
        for char in expression:
            if char in ["(", "{", "["]:
                self.push(char)
            else:
                if self.is_empty():
                    return False
                top_char = self.pop()
                if not self.is_matching_pair(top_char, char):
                    return False
        return self.is_empty()

    def is_matching_pair(self, char1, char2):
        if char1 == '(' and char2 == ')':
            return True
        if char1 == '{' and char2 == '}':
            return True
        if char1 == '[' and char2 == ']':
            return True
        return False

    # Sort the stack in ascending order
    def sort_stack(self):
        if not self.is_empty():
            temp = self.pop()
            self.sort_stack()
            self.sorted_insert(temp)

    def sorted_insert(self, element):
        if self.is_empty() or element > self.top.data:
            self.push(element)
        else:
            temp = self.pop()
            self.sorted_insert(element)
            self.push(temp)

    # Print the stack
    def print_stack(self):
        current_node = self.top
        print("Stack:", end=" ")
        while current_node:
            print(current_node.data, end=" -> ")
            current_node = current_node.next
        print("None")

# Example usage
stack = Stack()
stack.push(10)
stack.push(20)
stack.push(5)
stack.push(30)
print("Original Stack:")
stack.print_stack()

print("\nPop an element:")
print(stack.pop())
stack.print_stack()

print("\nReverse the stack:")
stack.reverse()
stack.print_stack()

print("\nCheck if the stack is empty:")
print(stack.is_empty())

print("\nCount the number of elements in the stack:")
print(stack.size())

print("\nReverse a string 'hello' using Stack:")
print(stack.reverse_string('hello'))

print("\nCheck for balanced parenthesis:")
expression = "{[()()]}"
print(f"Expression {expression} is balanced: {stack.check_balanced_parenthesis(expression)}")

print("\nSort the stack in ascending order:")
stack.sort_stack()
stack.print_stack()
