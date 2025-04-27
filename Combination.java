import java.util.ArrayList;
import java.util.List;

public class Combination {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(candidates, target, 0, new ArrayList<>(), result);
        return result;
    }

    private void backtrack(int[] candidates, int target, int index, List<Integer> current, List<List<Integer>> result) {
        if (target == 0) {
            result.add(new ArrayList<>(current));
            return;
        }
        
        if (target < 0 || index >= candidates.length) {
            return;
        }
        
        current.add(candidates[index]);
        backtrack(candidates, target - candidates[index], index, current, result);
        
        current.remove(current.size() - 1);
        backtrack(candidates, target, index + 1, current, result);
    }

    public static void main(String[] args) {
        Combination cs = new Combination();
        int[] candidates = {2, 3, 6, 7};
        int target = 7;
        List<List<Integer>> result = cs.combinationSum(candidates, target);
        
        System.out.println(result);
    }
}
