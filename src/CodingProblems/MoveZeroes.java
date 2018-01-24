package CodingProblems;

/**
 * LeetCode problem #283. Move Zeroes
 *
 */

public class MoveZeroes {
    static void moveZeroes(int[] nums) {
//        without mainataining the order
//        if (nums.length == 0 || nums.length==1){
//            return;
//        }
//        int count = 0;
//        for (int i=0; i<nums.length - count; i++){
//            if (nums[i] == 0){
//                int temp = nums[i];
//                if (nums[nums.length-1-count] != 0){
//                    nums[i] = nums[nums.length-1-count];
//                    nums[nums.length-1-count] = temp;
//                    count++;
//                } else {
//                    while (nums[nums.length-1-count] != 0){
//                        count++;
//                    }
//                    nums[i] = nums[nums.length-1-count];
//                    nums[nums.length-1-count] = temp;
//                }
//            }
//
//        }
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {

                nums[count] = nums[i];
                count++;
                System.out.println("count: " + count);
            }

            for (int j = 0; j < nums.length; j++){
                System.out.print(nums[j] + "\t");
            }
            System.out.println();
        }

        for (int j = count ; j < nums.length; j++){
            nums[j] = 0;
        }
        for (int j = 0; j < nums.length; j++){
            System.out.print(nums[j] + "\t");
        }
        System.out.println();

    }
}
