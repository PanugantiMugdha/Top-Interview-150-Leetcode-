class Solution {
    // public static void main(String[] args)
    // {
    //     int nums[]={2,3,1,1,4};
    //     System.out.println(jump(nums));
    // }
    public int jump(int[] nums) {
        int jumps = 0;
        int currentEnd = 0;
        int farthest = 0;

        for (int i = 0; i < nums.length - 1; i++) { // don't need to jump from last index
            farthest = Math.max(farthest, i + nums[i]);

            if (i == currentEnd) {       // need to make a jump
                jumps++;
                currentEnd = farthest;
            }
        }
        return jumps;
    }
}
