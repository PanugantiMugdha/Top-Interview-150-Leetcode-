class Solution {
    // public static void main(String[] args)
    // {
    //     int nums[]={1,2,3,4};
    //     System.out.println(Arrays.toString(productExceptSelf(nums)));
    // }
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int ans[]=new int[n];
        int prodLeft=1;
        int prodRight=1;
        for(int i=n-1;i>=0;i--)
        {
            ans[i]=prodRight;
            prodRight=prodRight*nums[i];
        }
        for(int i=0;i<n;i++)
        {
            ans[i]=ans[i]*prodLeft;
            prodLeft=prodLeft*nums[i];
        }
        return ans;
    }
}
