package CodingProblems;


/**
 * LeetCode problem #1 Two Sum
 */
public class TwoSum {

    public int[] twoSum(int[] nums, int target)
    {
        for(int i = 0; i < nums.length; i++)
        {
            for (int j = i + 1; j< nums.length; j++)
            {
                if(nums[i] + nums[j] == target)
                {
                    //int [] solution = {i, j};
                    return new int[] {i, j};
                }
            }
        }

        return new int [] {-1, -1};

    }
}
