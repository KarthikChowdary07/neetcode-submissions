class Solution {
    public boolean hasDuplicate(int[] nums) {
        int n=nums.length;
       Set<Integer> s=new HashSet<>();
       for(int num:nums)
       {
        if(s.contains(num))
        {
            return true;
        }
        s.add(num);
       }
       
            return false;
        
       
    }
}