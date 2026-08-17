class Solution {
    HashMap<String, List<String>> map = new HashMap<>();

    public String encode(List<String> strs) {
        String str = "";
        for(String s : strs){
            char[] chars = s.toCharArray();
            int size = chars.length;
            str = str + size + "#" + s;
        }

        return str;
    }

    public List<String> decode(String str) {
    List<String> decoded_list = new ArrayList<>();
    int i = 0;
    while (i< str.length()) {
      int j = i;

      while (str.charAt(j) != '#') {
        j++;
      }

      int length = Integer.parseInt(str.substring(i, j));

      int start = j+1;

      String s = str.substring(start, start + length);

      decoded_list.add(s);

      i = start + length;
    }

        return decoded_list;
        
    }
}
