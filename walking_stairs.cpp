
/*
Question 1:
 Write function numOfWays(n) Where n is number of steps. 
User may either take 1 or 2 steps to reach the top.
Determine how many ways you can reach the top given stair size n.
Question 2:
 Write function numOfWays(n,[x]) 
 n is same. [x] = an array of allowed step sizes.
 Determine number of possible ways to ascend  stairs given n,[x]

*/

/*
Q1:
First Idea:
    V2 - loop through all combinations count if mod 0
Proven math:
    (N) = (n-1) + (n-2)     N is equal to the result of n -1 and result of n-2 therefore recursive solution


*/