
//1. Two Sum
//Given an array of integers, return indices of the two numbers such that they add up to a specific target.
//
//You may assume that each input would have exactly one solution, and you may not use the same element twice.
//
//Example:
//
//Given nums = [2, 7, 11, 15], target = 9,
//
//Because nums[0] + nums[1] = 2 + 7 = 9,
//return [0, 1].
//

class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {

        val arraySize = nums.size
        val emptySet = intArrayOf()


        if (nums.isEmpty()) {  // make sure that the string has content, otherwise move on.
            return emptySet
        } else {
            for (outerLoopIndex in 0..arraySize) {//match the range to the array offset
                for (innerLoopIndex in outerLoopIndex+1..arraySize) { // start where the outer Loop leaves off
                    println("checking ${nums[outerLoopIndex]} with ${nums[innerLoopIndex]}")
                    if (nums[outerLoopIndex] < target) {
                        // make sure the number is less than the target, otherwise move on.

                        if (nums[innerLoopIndex] < target) {
                            // make sure the number is less than the target, otherwise move on.

                            if ((nums[outerLoopIndex] + nums[innerLoopIndex]) == target) {

                                val answer = intArrayOf(outerLoopIndex, innerLoopIndex)
                                return answer
                            }

                        } else continue

                    } else continue


                }


            }

            return emptySet  //Made it through both loops without finding a solution
        }


    }
}

fun main(args: Array<String>) {

//    val testArray = intArrayOf(2,7,11,15)
//    val testTarget= 9
//    val testAnswer = Solution()
//
//    println("Testing the list of ${testArray.asList()} for two numbers that add up to $testTarget")
//    println(testAnswer.twoSum(testArray,testTarget).asList())

//    val testArray = intArrayOf(16,11,3,7)
//    val testTarget= 9
//    val testAnswer = Solution()
//
//    println("Testing the list of ${testArray.asList()} for two numbers that add up to $testTarget")
//    println(testAnswer.twoSum(testArray,testTarget).asList())

    val list2 = intArrayOf(2,1,3,2)
    val target2 = 4
    val answer2 = Solution()

    println("Testing the list of ${list2.asList()} for two numbers that add up to $target2")
    if (answer2.twoSum(list2,target2).isEmpty()) {
           println("No such solution, empty set.")
    } else {
        println(answer2.twoSum(list2, target2).asList())
    }
////
//    val list3 = intArrayOf()
//    val target3 = 3
//    val answer3 = Solution()
//
//    println("Testing the list of ${list3.asList()} for two numbers that add up to $target3")
//    println(answer3.twoSum(list3,target3).asList())






}