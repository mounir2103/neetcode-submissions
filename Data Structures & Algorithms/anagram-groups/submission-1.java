class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        List<List<String>> result = new ArrayList<>();

        for(String str : strs){
            char[] strChar = str.toCharArray();
            Arrays.sort(strChar);
            String key = new String(strChar);
            map.putIfAbsent(key, new ArrayList<>());
            map.get(key).add(str);

        }

        for(String k : map.keySet()){
            result.add(map.get(k));
        }
        
        return result;
    }
}
