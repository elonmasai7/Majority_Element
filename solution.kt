class Solution {
    fun majorityElement(nums: IntArray): Int {
        var candidate = nums[0]
        var count = 0

        for  (num in nums) {
            if (count == 0) {
                candidate = num
            }
            count += if (num == candidate) 1 else -1

        }
        return candidate
        
    }
}
 
fun main() {
    val solution  = Solution()

    val nums1 = intArrayOf(3, 2, 3)
    val output1 = solution.majorityElement(nums1)
    println("Input: ${nums1.joinToString(", ")}")
    println("Output: $output1") 

    val nums2 = intArrayOf(2, 2, 1, 1, 1, 2, 2)
    val output2 = solution.majorityElement(nums2)
    println("Input: ${nums2.joinToString(", ")}")
    println("Output: $output2")
}
