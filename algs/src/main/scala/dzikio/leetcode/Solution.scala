package dzikio.leetcode

import scala.annotation.tailrec
import scala.collection.mutable
import scala.util.{Failure, Success, Try}

import LeetCodeApi.ListNode
import dzikio.leetcode.LeetCodeApi.ListNode
import dzikio.leetcode.utils.Exceptions

object Solution extends App {

  /** Title: 1. Two Sum
    *
    * Difficulty: Easy
    *
    * Link: https://leetcode.com/problems/two-sum/
    */

  /** Title: 2. Add Two Numbers
    *
    * Difficulty: Medium
    *
    * Link: https://leetcode.com/problems/add-two-numbers/
    */

  /** Title: 3. Longest Substring Without Repeating Characters
    *
    * Difficulty: Medium
    *
    * Link:
    * https://leetcode.com/problems/longest-substring-without-repeating-characters/
    */

  /** Title: 5. Longest Palindromic Substring
    *
    * Difficulty: Medium
    *
    * Link: https://leetcode.com/problems/longest-palindromic-substring/
    */

  /** Title: 6. ZigZag Conversion
    *
    * Link: https://leetcode.com/problems/zigzag-conversion/
    *
    * Difficulty: Medium
    */

  /** Title: 7. Reverse Integer
    *
    * Difficulty: Easy
    *
    * Link: https://leetcode.com/problems/reverse-integer/
    */

  /** Title: 9. Palindrome Number
    *
    * Link: https://leetcode.com/problems/palindrome-number/
    *
    * Difficulty: Easy
    */

  /** Title: 11. Container With Most Water
    *
    * Link: https://leetcode.com/problems/container-with-most-water/
    *
    * Difficulty: Medium
    */

  /** Title: 12. Integer to Roman
    *
    * Link: https://leetcode.com/problems/integer-to-roman/
    *
    * Difficulty: Medium
    */

  /** Title: 13. Roman to Integer
    *
    * Link: https://leetcode.com/problems/roman-to-integer/
    *
    * Difficulty: Easy
    */

  /** Title: 14. Longest Common Prefix
    *
    * Link: https://leetcode.com/problems/longest-common-prefix/
    *
    * Difficulty: Easy
    */

  /** Title: 15. 3Sum
    *
    * Link: https://leetcode.com/problems/3sum/
    *
    * Difficulty: Medium
    */

  /** Title: 16. 3Sum Closest
    *
    * Link: https://leetcode.com/problems/3sum-closest/
    *
    * Difficulty: Medium
    */

  /** Title: 17. Letter Combinations of a Phone Number
    *
    * Link: https://leetcode.com/problems/letter-combinations-of-a-phone-number/
    *
    * Difficulty: Medium
    */

  /** Title: 20. Valid Parentheses
    *
    * Link: https://leetcode.com/problems/valid-parentheses/
    *
    * Difficulty: Easy
    */

  /** Title: 21. Merge Two Sorted Lists
    *
    * Link: https://leetcode.com/problems/merge-two-sorted-lists/
    *
    * Difficulty: Easy
    */

  /** Title: 22. Generate Parentheses
    *
    * Link: https://leetcode.com/problems/generate-parentheses/
    *
    * Difficulty: Medium
    */

  /** Title: 26. Remove Duplicates from Sorted Array
    *
    * Link: https://leetcode.com/problems/remove-duplicates-from-sorted-array/
    *
    * Difficulty: Easy
    */

  /** Title: 27. Remove Element
    *
    * Link: https://leetcode.com/problems/remove-element/
    *
    * Difficulty: Easy
    */

  /** Title: 28. Implement strStr()
    *
    * Link: https://leetcode.com/problems/implement-strstr/
    *
    * Difficulty: Easy
    */

  /** Title: 31. Next Permutation
    *
    * Link: https://leetcode.com/problems/next-permutation/
    *
    * Difficulty: Medium
    */

  /** Title: 33. Search in Rotated Sorted Array
    *
    * Link: https://leetcode.com/problems/search-in-rotated-sorted-array/
    *
    * Difficulty: Medium
    */

  /** Title: 34. Find First and Last Position of Element in Sorted Array
    *
    * Link:
    * https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
    *
    * Difficulty: Medium
    */

  /** Title: 35. Search Insert Position
    *
    * Link: https://leetcode.com/problems/search-insert-position/
    *
    * Difficulty: Easy
    */

  /** Title: 36. Valid Sudoku
    *
    * Link: https://leetcode.com/problems/valid-sudoku/
    *
    * Difficulty: Medium
    */

  /** Title: 38. Count and Say
    *
    * Link: https://leetcode.com/problems/count-and-say/
    *
    * Difficulty: Medium
    */

  /** Title: 39. Combination Sum
    *
    * Link: https://leetcode.com/problems/combination-sum/
    *
    * Difficulty: Medium
    */

  /** Title: 40. Combination Sum II
    *
    * Link: https://leetcode.com/problems/combination-sum-ii/
    *
    * Difficulty: Medium
    */

  /** Title: 42. Trapping Rain Water
    *
    * Link: https://leetcode.com/problems/trapping-rain-water/
    *
    * Difficulty: Hard
    */

  /** Title: 43. Multiply Strings
    *
    * Link: https://leetcode.com/problems/multiply-strings/
    *
    * Difficulty: Medium
    */

  /** Title: 45. Jump Game II
    *
    * Link: https://leetcode.com/problems/jump-game-ii/
    *
    * Difficulty: Medium
    */

  /** Title: 46. Permutations
    *
    * Link: https://leetcode.com/problems/permutations/
    *
    * Difficulty: Medium
    */

  /** Title: 47. Permutations II
    *
    * Link: https://leetcode.com/problems/permutations-ii/
    *
    * Difficulty: Medium
    */

  /** Title: 48. Rotate Image
    *
    * Link: https://leetcode.com/problems/rotate-image/
    *
    * Difficulty: Medium
    */

  /** Title: 49. Group Anagrams
    *
    * Link: https://leetcode.com/problems/group-anagrams/
    *
    * Difficulty: Medium
    */

  /** Title: 50. Pow(x, n)
    *
    * Link: https://leetcode.com/problems/powx-n/
    *
    * Difficulty: Medium
    */

  /** Title: 51. N-Queens
    *
    * Link: https://leetcode.com/problems/n-queens/
    *
    * Difficulty: Hard
    */

  /** Title: 52. N-Queens II
    *
    * Link: https://leetcode.com/problems/n-queens-ii/
    *
    * Difficulty: Hard
    */

  /** Title: 53. Maximum Subarray
    *
    * Link: https://leetcode.com/problems/maximum-subarray/
    *
    * Difficulty: Medium
    */

  /** Title: 54. Spiral Matrix
    *
    * Link: https://leetcode.com/problems/spiral-matrix/
    *
    * Difficulty: Medium
    */

  /** Title: 55. Jump Game
    *
    * Link: https://leetcode.com/problems/jump-game/
    *
    * Difficulty: Medium
    */

  /** Title: 56. Merge Intervals
    *
    * Link: https://leetcode.com/problems/merge-intervals/
    *
    * Difficulty: Medium
    */

  /** Title: 57. Insert Interval
    *
    * Link: https://leetcode.com/problems/insert-interval/
    *
    * Difficulty: Medium
    */

  /** Title: 58. Length of Last Word
    *
    * Link: https://leetcode.com/problems/length-of-last-word/
    *
    * Difficulty: Easy
    */
  def lengthOfLastWord(s: String): Int = {
    @tailrec
    def inner(i: Int, acc: Int): Int = {
      if (i < 0 || s(i) == ' ') acc
      else inner(i - 1, acc + 1)
    }

    for (i <- s.indices.reverse)
      if (s(i) != ' ')
        return inner(i, 0)

    throw new IllegalArgumentException
  }

  /** Title: 59. Spiral Matrix II
    *
    * Link: https://leetcode.com/problems/spiral-matrix-ii/
    *
    * Difficulty: Medium
    */
}
