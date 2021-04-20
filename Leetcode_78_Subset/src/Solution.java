import java.util.*;

public class Solution {
    int[] table=null;
    public List<List<Integer>> subsets(int[] nums) {
        Arrays.sort(nums);
        table=new int[nums.length];
        List<Integer> list=new ArrayList<>();
        List<List<Integer>> result=new ArrayList<>();
        result.add(new ArrayList<>());
        doWork(nums,list,result);
        for(int i=0;i<nums.length;i++){
            list=new ArrayList<>();
            list.add(nums[i]);
            if (!result.contains(list)){
                result.add(list);
            }
        }

        return result;
    }

    public void doWork(int[] nums,List<Integer> list,List<List<Integer>>result){
        for(int i=0;i<nums.length;i++){
            if(table[i]==0) {
                table[i] = 1;
                list.add(nums[i]);
                doWork(nums, list,result);
                table[i] = 0;

                list.sort((Integer o1, Integer o2)-> o1-o2);
                if (!result.contains(list)){
                    result.add(list);
                }
                list=new ArrayList<>();
            }
        }
    }


}
