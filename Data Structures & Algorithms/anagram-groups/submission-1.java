class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> h=new HashMap<>();
        for(String str:strs)
        {
            int[] co=new int[26];
            for(char ch:str.toCharArray())
            {
                co[ch-'a']++;

            }
            StringBuilder key=new StringBuilder();
            for(int c:co)
            {
                key.append('#').append(c);
            }

            h.computeIfAbsent(key.toString(),k->new ArrayList<>()).add(str);


        }
        return new ArrayList<>(h.values());
    }
}
