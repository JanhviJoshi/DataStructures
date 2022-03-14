"""
resources: 

https://leetcode.com/problems/palindrome-partitioning/discuss/1667647/Well-Explained-JAVA-C%2B%2B-PYTHON-JavaScript-oror-Easy-for-mind-to-Accept-it  (both explanation and code)

https://leetcode.com/problems/palindrome-partitioning/discuss/1667786/Python-Simple-Recursion-oror-Detailed-Explanation-oror-Easy-to-Understand (only theory explanation part, not code)

the tree is formed below for example: "xxyy"
"""

class Solution:
    def partition(self, s: str) -> List[List[str]]:
        
        def is_pal(s):
            if s == s[::-1]:
                return True
            
            
        def rec(s, ans, combo):
            if not s:
                ans.append(combo[:])
                # print(ans)
                return
                
            for i in range(1, len(s)+1):
                if is_pal(s[:i]):  # if left side of the current partition is a palindrome
                    rec(s[i:], ans, combo + [s[:i]]) # sned the right side of the partitions for processing
                    
            return ans
                    
                    
        return rec(s, [], [])
                    