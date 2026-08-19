class Solution {
    public int missingNumber(int[] nums) {
         int i = 0;

         while (i < nums.length) {
            int correct = nums[i];
            if (nums[i] < nums.length && nums[i] != nums[correct]) {
            swap(nums, i, correct);
            } else {
               i++;
           }
         }
    

         for(int index= 0; index < nums.length; index++){
            if (nums[index] != index){
                return index;
            }
         }

         return nums.length;
        
    }
    void swap(int[] nums, int num1, int num2){
            int temp = nums[num1];
            nums[num1] = nums[num2];
            nums[num2] = temp;
         }
}