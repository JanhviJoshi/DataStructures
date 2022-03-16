# DataStructures

#### Question 1: Find the number of unique elements in a given array. 
**Solution**: <br>The given array is first sorted using the **MergeSort** algorithm. This algorithm was chosen over others becaus it has the lowest time complexity of **O(n log n)**. Then, two consecutive elements in the array are checked for uniqueness. The number of unique elements is stored in the variable *cnt*. This operation takes a time of O(N). <br>
Code: [UniqueCount.java](https://github.com/JanhviJoshi/DataStructures/blob/master/UniqueCount.java)


#### Question 2: Find the frequency of each element given an input string.
**Solution**: <br>
**With Time Complexity: O(n<sup>2</sup>)** <br>
Using two nested for loops, we select one element and search for its occurences in the rest of the string. We continue doing this for the whole string. <br>
**With Time Complexity: O(n log n)** <br>
Sort the string using **MergeSort** and then find the frequency of each element using a single for loop. <br>
Code: [FrequencyCount.java](https://github.com/JanhviJoshi/DataStructures/blob/master/FrequencyCount.java) <br>
**With Time Complexity: O(n)** <br>
Using a HashMap which does not allow storing duplicate key values. The HashMap hence, stores unique elements as keys and their frequencies as their corresponding values. <br>
Code: [FrequencyCountStringHashMap.java](https://github.com/JanhviJoshi/DataStructures/blob/master/FrequencyCountStringHashMap.java)


#### Question 3: Implement a LinkedList.
