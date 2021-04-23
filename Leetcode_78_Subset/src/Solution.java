import java.util.*;
class Solution {
    int[] table=null;
    public List<List<Integer>> subsets(int[] nums) {
        // Arrays.sort(nums);
        table=new int[nums.length];
        List<Integer> list=new ArrayList<>();
        List<List<Integer>> result=new ArrayList<>();
        // result.add(new ArrayList<>());
        doWork(nums,0,list,result);
//        for(int i=0;i<nums.length;i++){
//            list=new ArrayList<>();
//            list.add(nums[i]);
//            if (!result.contains(list)){
//                result.add(list);
//            }
//        }

        return result;
    }
    public void doWork(int[] nums,int step,List<Integer> list,List<List<Integer>>result){
        ArrayList<Integer> cpy_list=new ArrayList<Integer>();
        cpy_list=(ArrayList<Integer>)((ArrayList<Integer>)list).clone();
        // cpy_list.sort((Integer o1 ,Integer o2)->o1-o2);
        // if (!result.contains(cpy_list)){
        result.add(cpy_list);
        // }

        for(int i=step;i<nums.length;i++){
            list.add(nums[i]);
            // System.out.println(list);
            doWork(nums, i+1,list,result);
            list.remove(list.size()-1);

        }
    }
}
