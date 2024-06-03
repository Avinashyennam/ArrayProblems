import java.util.ArrayList;
import java.util.List;

public class GenerateSubsets {

    public static List<List<Integer>> generate(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        ArrayList<Integer> li = new ArrayList<>();
        total(nums, li, 0, ans);
        return ans;
    }

    public static void total(int nums[], ArrayList<Integer> li, int idx, List<List<Integer>> ans)
    {
        if(idx == nums.length)
        {
            ans.add(new ArrayList(li));
            return;
        }
        li.add(nums[idx]);
        total(nums, li, idx+1, ans);
        li.remove(li.size()-1);
        total(nums, li, idx+1, ans);
    }
    public static void main(String[] args) {
        int nums[] = {1,2,3};
        System.out.println(generate(nums));
    }
}
