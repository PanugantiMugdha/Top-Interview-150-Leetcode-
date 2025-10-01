class Solution {
    // public static void main(String[] args)
    // {
    //     int nums[]={1,1,1,2,2,3};
    //     System.out.println(removeDuplicates(nums));
    // }
    public int removeDuplicates(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length;i++)
        {
            if(count < 2 || nums[i]!=nums[count-2])
            {
                nums[count]=nums[i];
                count++;
            }
        }
        return count;
    }
}
