class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<Integer> ls = new ArrayList<>();
        List<List<Integer>> result = new ArrayList<>();
        recursesum(0, candidates, target, ls, result);
        return result;
    }

    public static void recursesum(
        int index, int[] candidates, int target, List<Integer> ls, List<List<Integer>> result) {
        if (target == 0) {
            result.add(new ArrayList<>(ls));
            return;
        }

        if (index == candidates.length || target< 0) {
            return;
        }
        
            ls.add(candidates[index]);
            recursesum(index + 1, candidates, target - candidates[index], ls, result);
            ls.remove(ls.size() - 1);

            while (index + 1 < candidates.length && candidates[index] == candidates[index + 1]) {
            index++;
        }
        
        recursesum(index + 1, candidates, target, ls, result);
    }
}
