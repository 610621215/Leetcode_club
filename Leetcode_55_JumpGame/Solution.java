//memo: ctrl + alt + k 大範圍修改
import java.util.*;
//1.0.0 
//bug:Move to zero trap by max jump count;
class Solution {

	static ArrayList<Boolean> re=new ArrayList<Boolean>();
	
	public static void main(String[]args){//teinstg sphere
		int[] nums=new int[]{2,3,1,1,4};
		Solution_55_testing_data go_testing=new Solution_55_testing_data();
		ArrayList<Object> testing_data=go_testing.return_data_set();
		
		for(Object list_element:testing_data) {
			
			nums=(int[])list_element;
			System.out.println(nums.length);
			go_testing.show_testing_data(nums);
			new Solution_55().canJump(nums);
			
		}
	}

  boolean go_result=false;
  public boolean canJump(int[] nums) {
		int origin =0;
		 doWork(origin,nums);
		boolean result =go_result;
		System.out.println(result);
		return result;
	}
	public void doWork(int index,int[] nums){
		//每個位置一個狀態
		if(nums.length==1)
		{
			go_result=true;
			return;
		}	
		while(true) {
			int max_jump=0;
			int max_index=-1;
			for(int i=1;i<=nums[index];i++){
//				System.out.println(nums[index+i]);
//				System.out.println(nums.length);
				if((index+i)+1>=nums.length) {
					max_jump=i;
					go_result=true;
					return;
//					break;
				}
				//誘導陷阱無解
				if(nums[index+i]>=max_jump){ //最佳跳法 
					//後跳覆蓋前跳
					max_jump=nums[index+i];
					max_index=index+i;
					System.out.println(index+","+max_jump);
				}
			} // searching best jump;
			index=max_index; //移動到發生最大值的地方
			System.out.println("move"+index);
			if(index>=nums.length){
				go_result=true;
				break;
			}
			if(max_jump==0) {
				go_result=false;
				break;
			}
		}
		System.out.println("out  of range");
		//return false;
	}


}