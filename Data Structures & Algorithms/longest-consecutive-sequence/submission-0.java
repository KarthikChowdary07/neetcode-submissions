class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0)
            return 0;
        Arrays.sort(nums);    
        int l=1;
        int cl=1;
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]==nums[i-1]){
                continue;
            }
            if(nums[i]==nums[i-1]+1){
                cl++;
            }
            else{
                cl=1;
            }
            
            l=Math.max(l,cl);
        }
        return l;
    }
}
