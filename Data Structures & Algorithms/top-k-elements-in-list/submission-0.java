class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        Map<Integer,Integer> frequencyMap = new HashMap<>();

        for(int n : nums){
            frequencyMap.put(n,frequencyMap.getOrDefault(n,0)+1);
        }

        // create buckets

        List<Integer>[] bucket = new List[nums.length+1];

        for(int key : frequencyMap.keySet()){
            int frequencyCount = frequencyMap.get(key);

            if(bucket[frequencyCount] == null){
                bucket[frequencyCount]  = new ArrayList<>();
            }
            bucket[frequencyCount].add(key);
        }
        List<Integer> result = new ArrayList<>();
        for(int i = bucket.length-1; i >=0; i-- ){
            if(k>0){
                if(bucket[i] != null){
                    result.addAll(bucket[i]);
                    k = k - bucket[i].size();
                }
            }
        }

        return result.stream().mapToInt(i-> i).toArray();
    }
}
