# 1480. Running sum of 1D array

**LeetCode:** https://leetcode.com/problems/running-sum-of-1d-array/
**Difficulty:** Easy
**Pattern:** Arrays + Prefix sum
**Date:** 2026-06-23
**Time taken:** Solved in 10 min (revised prefix sum 2 days ago)

## Problem
Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).

Return the running sum of nums

## Approach

This was kind of a basic prefix sum problem. I just thought of making another array with the numbers summing using a loop. That was the first thought that came in my mind. Question was kind of easy.

- Time: o(n)
- Space: 0(n)

This question could also have been done using a single array and overwriting the numbers in the array. Time and space dimensions would have changed then. It would also have been easier in my opinion and lesser lines of code but it didn't click to me in the start for some reason. I realised after solving by my method.

- Time: o(n)
- Space: 0(1)

## What this taught me
It taught me the basic prefix sum question pattern of how to create a summing array as fast as possible consuming as less resources as possible. Also taught more about how to use time and space dimensions differently and efficiently.
