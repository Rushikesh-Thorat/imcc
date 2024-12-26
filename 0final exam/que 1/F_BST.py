class TreeNode:
    def __init__(self, data):
        self.data = data
        self.left = None
        self.right = None

class BST:
    def __init__(self):
        self.root = None

    # Insert a node into the BST
    def insert(self, data):
        if self.root is None:
            self.root = TreeNode(data)
        else:
            self._insert(data, self.root)

    def _insert(self, data, node):
        if data < node.data:
            if node.left is None:
                node.left = TreeNode(data)
            else:
                self._insert(data, node.left)
        else:
            if node.right is None:
                node.right = TreeNode(data)
            else:
                self._insert(data, node.right)

    # Find the minimum value in the BST
    def find_min(self):
        current = self.root
        while current.left:
            current = current.left
        return current.data

    # Find the maximum value in the BST
    def find_max(self):
        current = self.root
        while current.right:
            current = current.right
        return current.data

    # Search for a specific node and print its level
    def search_and_print_level(self, data):
        return self._search_and_print_level(data, self.root, 1)

    def _search_and_print_level(self, data, node, level):
        if node is None:
            return -1
        if node.data == data:
            return level
        elif data < node.data:
            return self._search_and_print_level(data, node.left, level + 1)
        else:
            return self._search_and_print_level(data, node.right, level + 1)

    # Count the number of nodes in the BST
    def count_nodes(self):
        return self._count_nodes(self.root)

    def _count_nodes(self, node):
        if node is None:
            return 0
        return 1 + self._count_nodes(node.left) + self._count_nodes(node.right)

    # Count the number of nodes in left subtree
    def count_left_subtree_nodes(self):
        if self.root and self.root.left:
            return self._count_nodes(self.root.left)
        return 0

    # Count the number of nodes in right subtree
    def count_right_subtree_nodes(self):
        if self.root and self.root.right:
            return self._count_nodes(self.root.right)
        return 0

# Example usage
bst = BST()
bst.insert(50)
bst.insert(30)
bst.insert(70)
bst.insert(20)
bst.insert(40)
bst.insert(60)
bst.insert(80)

print("Minimum value in BST:", bst.find_min())
print("Maximum value in BST:", bst.find_max())

data = 40
level = bst.search_and_print_level(data)
if level != -1:
    print(f"Node {data} is at level {level}")
else:
    print(f"Node {data} not found")

print("Total number of nodes in BST:", bst.count_nodes())
print("Number of nodes in left subtree:", bst.count_left_subtree_nodes())
print("Number of nodes in right subtree:", bst.count_right_subtree_nodes())
