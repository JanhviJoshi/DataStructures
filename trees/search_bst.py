'''
insertion/creation, searching and travesl of a BST
'''

class Node:
    def __init__(self, key):
        self.left = None
        self.right = None
        self.key = key
        
'''
new node to be added is node
'''        
def insert(root, node):
    if not root: #root is null 
        root = node
    elif root.key < node.key:
        if root.right is None:
            root.right = node
        else:
            insert(root.right, node)
    else:
        if root.left is None:
            root.left = node
        else:
            insert(root.left, node)


#searching
'''
root is the current root and key is the value to be found
'''
def search(root, key):
    if root is None:
        return root
    if  root.key == key:
        return root.key
    if root.key < key:
        return search(root.right, key)
    
    return search(root.left, key)

def inorder(root):
    if root:
        inorder(root.left)
        print(root.key)
        inorder(root.right)

def preorder(root):
    if root is not None:
        print(root.key)
        preorder(root.left)
        preorder(root.right)

def postorder(root):
    if root:
        postorder(root.left)
        postorder(root.right)
        print(root.key)


r = Node(5)
insert(r, Node(10))
insert(r, Node(20))
insert(r, Node(30))
insert(r, Node(3))
insert(r, Node(9))



# inorder(r)
# preorder(r)
postorder(r)

print(search(r, 100))
print(search(r, 10))

