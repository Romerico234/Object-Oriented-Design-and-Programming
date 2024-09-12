import java.util.HashMap;
import java.util.Map;

public class E1_David_Mugwaneza {
    public static void main(String[] args) {
        /* Test Cases for Programming Task 1 */
        int[] arr1 = { 2, 7, 11, 15 };
        int[] res1 = sumOfTwoIndices(arr1, 9);
        System.out.println("(" + res1[0] + ", " + res1[1] + ")");

        /* Test Cases for Programming Task 2 */
        String[] arr2 = { "flower", "flow", "flight" };
        String res2 = longestCommonPrefix(arr2);
        System.out.println("Longest Common Prefix is: " + res2);
    }

    /*
     * 1. Given an array of integers, return indices of the two numbers such that
     * they add up to a specific target. You may assume that each input would have
     * exactly one solution, and you may not use the same element twice. Example:
     * Given nums = [2, 7, 11, 15], target = 9,
     * Because nums[0] + nums[1] = 2 + 7 = 9, return [0, 1].
     */

    public static int[] sumOfTwoIndices(int[] arr, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int diff = target - arr[i];
            if (map.containsKey(diff)) {
                return new int[] { map.get(diff), i };
            }
            map.put(arr[i], i);
        }
        return new int[] { -1, -1 };
    }

    /*
     * 2. Write a function to find the longest common prefix string amongst an array
     * of strings.
     * Input: ["flower", "flow", "flight"] Output: "fl"
     * 
     * Input: ["dog", "racecar", "car"] Output: ""
     * Explanation: There is no common prefix among the input strings.
     * 
     */

    public static String longestCommonPrefix(String[] arr) {
        String prefix = arr[0];

        for (int i = 1; i < arr.length; i++) {
            while (arr[i].indexOf(prefix) != 0)
                prefix = prefix.substring(0, prefix.length() - 1);
        }
        return prefix;
    }
}
