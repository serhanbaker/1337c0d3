Single Number
=============
Given an array of integers, every element appears twice except for one. Find that single one.

**Note:**
Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?

```
Another answer idea:     
First, we sum all numbers 1...n.     
Then, we sum all numbers in our input array, 
which should be the same as our other sum but with our repeat number added in twice.     

So the difference between these two sums is the repeated number!
```
