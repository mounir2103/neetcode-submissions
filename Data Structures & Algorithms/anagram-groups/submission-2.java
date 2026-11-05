class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // HashMap<String, List<String>> map = new HashMap<>();
        // List<List<String>> result = new ArrayList<>();

        // for(String str : strs){
        //     char[] strChar = str.toCharArray();
        //     Arrays.sort(strChar);
        //     String key = new String(strChar);
        //     map.putIfAbsent(key, new ArrayList<>());
        //     map.get(key).add(str);

        // }

        // for(String k : map.keySet()){
        //     result.add(map.get(k));
        // }
        
        // return result;


















        HashMap<String, List<String>> map = new HashMap<>();
        List<List<String>> result = new ArrayList<>();

        for(String s : strs){
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String sorted = new String(chars);
            if(!map.containsKey(sorted)){
                map.put(sorted, new ArrayList<>());
        
            }
            map.get(sorted).add(s);
            
        }

        for(String k : map.keySet()){
            result.add(map.get(k));
        }

        return result;
    }
}
