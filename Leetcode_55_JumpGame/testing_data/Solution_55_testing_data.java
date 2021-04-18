package testing_data;
import java.util.*;

public class Solution_55_testing_data{
//	int[] nums=null;
	ArrayList<Object> testing_data_list=new ArrayList<Object>();
	public Solution_55_testing_data() {
			
	}
	public ArrayList<Object> return_data_set(){
		testing_data_list.add(new int[]{2,3,1,1,4});
		testing_data_list.add(new int[]{3,2,1,0,4});
		testing_data_list.add(new int[]{3,0,8,2,0,0,1});
		testing_data_list.add(new int[]{0});
		testing_data_list.add(new int[]{1,2,2,6,3,6,1,8,9,4,7,6,5,6,8,2,6,1,3,6,6,6,3,2,4,9,4,5,9,8,2,2,1,6,1,6,2,2,6,1,8,6,8,3,2,8,5,8,0,1,4,8,7,9,0,3,9,4,8,0,2,2,5,5,8,6,3,1,0,2,4,9,8,4,4,2,3,2});
		testing_data_list.add(new int[]{1,1,2,2,0,1,1});
		testing_data_list.add(new int[]{2,5,0,0});
		testing_data_list.add(new int[]{1,1,1,17});
		testing_data_list.add(new int[]{2,0,0});
		testing_data_list.add(new int[]{1,2,0,1});
		testing_data_list.add(new int[] {5,9,3,2,1,0,2,3,3,1,0,0});
		testing_data_list.add(new int[] {4,2,0,0,1,1,4,4,4,0,4,0});
		testing_data_list.add(new int[] {4,1,12,0,2,0,0,4,4,0,4,0});
		testing_data_list.add(new int[] {4,8,0,0,1,0,4});
		testing_data_list.add(new int[] {1,2,3});
		return testing_data_list;
	}
	public void show_testing_data(int[] testing_data) {
		//showtesting_data;
		System.out.print("[");
		for(int i:testing_data) {
			System.out.print(i+",");
		}
		System.out.println("]");
	}
	
}
