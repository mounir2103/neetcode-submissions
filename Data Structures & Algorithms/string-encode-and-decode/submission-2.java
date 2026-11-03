class Solution {

    public String encode(List<String> strs) {
        // StringBuilder encodedString = new StringBuilder();
        // for(String s: strs){
        //     int size = s.length();
        //     String strSize = Integer.toString(size);
        //     encodedString.append("#");
        //     encodedString.append(strSize);
        //     encodedString.append("/");
        //     encodedString.append(s);
        // }

        // return encodedString.toString();













        StringBuilder encoded = new StringBuilder();
        for(String str : strs){
            String size = Integer.toString(str.length());
            encoded.append("#");
            encoded.append(size);
            encoded.append("/");
            encoded.append(str);
        }

        return encoded.toString();

    }

    public List<String> decode(String str) {
        // List<String> result = new ArrayList<>();
        // for(int i=0; i<str.length(); i++){
        //     if(str.charAt(i)=='#' && i+1<str.length()){
        //         if(!Character.isDigit(str.charAt(i+1))){
        //             continue;
        //         }
        //         int k=i+1;
        //         while(k<str.length() && Character.isDigit(str.charAt(k))){
        //             k++;
        //         }
        //         int size = Integer.parseInt(str.substring(i+1, k));
        //         result.add(str.substring(k+1, k+1+size));
        //         i = k+size;
        //     }
        // }

        // return result;














        List<String> result = new ArrayList<>();

        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) == '#' && i+1<str.length()){
                if(!Character.isDigit(str.charAt(i+1))){
                    continue;
                }

                int k=i+1;
                while(k<str.length() && Character.isDigit(str.charAt(k))){
                    k++;
                }

                int size = Integer.parseInt(str.substring(i+1, k));
                result.add(str.substring(k+1, k+1+size));
                i = k+size;
            }

        }

        return result;


    }
}
