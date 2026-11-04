class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] result = new int[k];
        List<Integer> temp = new ArrayList<>();
        Set<Integer> used = new HashSet<>();

        // for(int n : nums){
        //     if(map.getOrDefault(n, 0) == 0){
        //         map.put(n, 1);
        //     }else{
        //         map.put(n, map.get(n)+1);
        //     }
        // }

        for (int n : nums) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }


        for(int i : map.keySet()){
            temp.add(map.get(i));
        }

        temp.sort(Collections.reverseOrder());

        for (int j = 0; j < k; j++) {
            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                if (entry.getValue().equals(temp.get(j)) &&
                    !used.contains(entry.getKey())) {

                    int key = entry.getKey();
                    result[j] = key;
                    used.add(key);
                    break;
                }
            }
        }

        return result;

    }
}
