import  java.util.*;
import testing.*;
public class Main {
    public static void main(String[]args){
        testing_data Build_testing_data=new testing_data();
        for(Object element:Build_testing_data){
            int[] nums=(int[])element;
            Solution sol=new Solution();
            List<List<Integer>> result =sol.subsets(nums);
            System.out.println(result);
        }
    }
}
