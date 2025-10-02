class Solution {
    // public static void main(String[] args)
    // {
    //     int nums[]={2,3,1,1,4};
    //     System.out.println(canJump(nums));
    // }
    public boolean canJump(int[] nums) {
        int last_position=nums.length-1;
        for(int i=nums.length-2;i>=0;i--)
        {
            if((i+nums[i])>=last_position)
            {
                last_position=i;
            }
        }
        return last_position==0;
    }
}
