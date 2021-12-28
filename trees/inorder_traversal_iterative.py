"""
Returns a list of elements in inorder
Iterative solution
"""

# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    # ls = list()
    def inorderTraversal(self, root: Optional[TreeNode]) -> List[int]:
        
        ls = list()
        self.helper(root, ls)
        return ls
    

    def helper(self, curr, ls):
        stack = []
                
        while True:
            if curr:
                stack.append(curr)
                curr = curr.left
            elif stack:
                curr = stack[-1]
                # print(stack[-1].val)
                ls.append(stack[-1].val)
                stack = stack[:-1]
                curr = curr.right
            else:
                break
            