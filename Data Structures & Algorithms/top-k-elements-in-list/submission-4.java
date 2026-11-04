class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // HashMap<Integer, Integer> map = new HashMap<>();
        // int[] result = new int[k];
        // List<Integer> temp = new ArrayList<>();
        // Set<Integer> used = new HashSet<>();

        // for (int n : nums) {
        //     map.put(n, map.getOrDefault(n, 0) + 1);
        // }


        // for(int i : map.keySet()){
        //     temp.add(map.get(i));
        // }

        // temp.sort(Collections.reverseOrder());

        // for (int j = 0; j < k; j++) {
        //     for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
        //         if (entry.getValue().equals(temp.get(j)) &&
        //             !used.contains(entry.getKey())) {

        //             int key = entry.getKey();
        //             result[j] = key;
        //             used.add(key);
        //             break;
        //         }
        //     }
        // }

        // return result;







        HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer>[] bucket = new List[nums.length+1];
        int[] result = new int[k];

        for(int n : nums){
            map.put(n, map.getOrDefault(n, 0) +1);
        }

        for(int i : map.keySet()){
            int freq = map.get(i);
            if(bucket[freq] == null){
                bucket[freq] = new ArrayList<>();
            }

            bucket[freq].add(i);
        }

        int counter = 0;

        for(int j=bucket.length-1; j>=0; j--){
            if(bucket[j] != null){
                for(int v : bucket[j] ){
                    result[counter] = v;
                    counter++;
                }
                if(counter == k){
                    return result;
                }
            }
        }
        return result;
        
    }
}
