class Solution {
    public void sortColors(int[] nums) {

        int low = 0;
        int mid = 0;
        int high = nums.length - 1;

        while(mid <= high){

            switch (nums[mid]) {
                case 0 -> {
                    int temp0 = nums[low];
                    nums[low] = nums[mid];
                    nums[mid] = temp0;

                    low++;
                    mid++;
                }

                case 1 -> mid++;

                default -> {
                    int temp2 = nums[mid];
                    nums[mid] = nums[high];
                    nums[high] = temp2;

                    high--;
                }
            }
        }
    }
}