class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        List<List<String>> result = new ArrayList<>();
        
        for(int i=0; i<strs.length; i++){
            char[] chars = strs[i].toCharArray();
            Arrays.sort(chars);
            String sorted = String.valueOf(chars);
            map.putIfAbsent(sorted, new ArrayList<>());
            map.get(sorted).add(strs[i]);

        }

        return new ArrayList<>(map.values());
    }
}
