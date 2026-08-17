class Solution {
    HashMap<String, List<String>> map = new HashMap<>();

    public String encode(List<String> strs) {
        String str = "";
        for(String s : strs){
            str = str + s;
        }

        map.put(str, strs);
        return str;

    }

    public List<String> decode(String str) {
        List<String> decoded = new ArrayList<>();
        decoded = map.get(str);
        return decoded;

    }
}
