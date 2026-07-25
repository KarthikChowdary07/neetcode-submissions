class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0)
            return 0;
        Set<Integer> hs=new HashSet<>();
        for(int num:nums)
        {
            hs.add(num);
        }
        int longest=0;
        for(int num:hs)
        {
            if(num!=Integer.MIN_VALUE&&hs.contains(num-1))
            {
                continue;
            }
            int current=num;
            int length=1;
            while(current!=Integer.MIN_VALUE&&hs.contains(current+1))
            {
                current++;
                length++;
            }
            longest=Math.max(longest,length);
        }
        return longest;
    }
}
