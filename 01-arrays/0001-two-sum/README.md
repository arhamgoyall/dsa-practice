# 1. Two Sum

**LeetCode:** https://leetcode.com/problems/two-sum/
**Difficulty:** Easy
**Pattern:** Arrays + Hashing (store-what-you've-seen)
**Date:** 2026-06-20
**Time taken:** Worked example (taught), then re-solved cold in 15 min

## Problem
Given an array of integers and a target, return the indices of the two numbers that add up to the target.

## Approach

**Brute force:** check every pair with nested loops.
- Time: O(n²) — every i paired with every j
- Space: O(1)

**Optimized:** walk through once. For each number, check whether its "complement" (target - num) has already been seen, using a HashMap for O(1) lookup. If not seen yet, store the current number and its index.
- Time: O(n) — single pass
- Space: O(n) — the map can hold up to n entries

## What this taught me
The "have I seen what I need already?" pattern — trading O(n) extra space for a drop from O(n²) to O(n) time using a HashMap. This pattern recurs constantly (duplicates, complements, frequency counts).
