# [Smallest Greater in Whole Array](https://www.geeksforgeeks.org/problems/smallest-greater-elements-in-whole-array2751/1)
## Easy
Given an array arr[], for each element, find the smallest element in the array that is strictly greater than it. If no such element exists, return -10000000 for that position. Return the resulting array.
Examples:
Input : arr[] = [13, 6, 7, 12]
Output : -10000000 7 12 13 Explanation: Here, at index 0, 13 is the greatest value in given array and no other array element is greater from 13. So at index 0 we fill '-10000000'.

Input : arr[] = [6, 3, 9, 8, 10, 2, 1, 15, 7]
Output :  7 6 10 9 15 3 2 -10000000 8Explanation: Here, at index 7, 15 is the greatest value in given array and no other array element is greater from 15. So at index 7 we fill '-10000000'.
