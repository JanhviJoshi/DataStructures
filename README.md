# DataStructures

#### Question 1: Find the number of unique elements in a given array. [UniqueCount.java](https://github.com/JanhviJoshi/DataStructures/blob/master/UniqueCount.java)
Solution: The given array is first sorted using the **MergeSort** algorithm. This algorithm was chosen over others becaus it has the lowest time complexity of **O(n log n)**. Then, two consecutive elements in the array are checked for uniqueness. The number of unique elements is stored in the variable *cnt*. This operation take a time of O(N).
