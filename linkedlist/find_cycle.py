"""
# 141 on leetcode

two solutions:
1. using dictionary/list/set or hashmap/map
2. using floyd's loop detection algorithm
"""

"""
soln number 1
Time complexity is o(n)
"""
# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def hasCycle(self, head: Optional[ListNode]) -> bool:
        l = list()
        
        pt = head
        
        if not pt:
            return False
        
        while True:
            if pt in l:
                return True
            else:
                l.append(pt)
            
            pt = pt.next
            
            if not pt:
                return False



"""
soln #2 

Floyd's loop detection algorithm: uses 2 pointer, a slower and another faster. 
Time complexity is O(n) and space complexity is O(1).
This is the most optimal solution
"""
# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def hasCycle(self, head: Optional[ListNode]) -> bool:
        
        tort, hare = head, head
        
        # if not tort:
        #     return False
        
        while hare and hare.next and hare.next.next:
            tort = tort.next
            hare = hare.next.next
            
            if tort == hare: # or tort == hare 
                return True
            
        return False

