class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] result = new int[k];
        List<Integer> temp = new ArrayList<>();

        for(int n : nums){
            if(map.getOrDefault(n, 0) == 0){
                map.put(n, 1);
            }else{
                map.put(n, map.get(n)+1);
            }
        }


        for(int i : map.keySet()){
            temp.add(map.get(i));
        }

        Collections.sort(temp);
        temp.sort(Collections.reverseOrder());

        for(int j=0; j<k; j++){
            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                if (entry.getValue().equals(temp.get(j))) {
                    int key = entry.getKey();
                    result[j] = key;
                    break;
                }
            }
        }

        return result;

    }
}
