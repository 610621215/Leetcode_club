//memo: ctrl + alt + k 大範圍修改
import java.util.*;
import testing_data.Solution_55_testing_data;
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
//			new Solution().canJump(nums);
			System.out.println(new Solution().canJump(nums));
		}
	}
	public boolean canJump(int[] nums) {
		//能不能到成功的點

		//init win point
		int[] success_point=new int[nums.length];
		int success_flag= nums.length-1;//直接丟在終點
		for(int i=nums.length-1;i>=0;i--){
//			System.out.print("|"+nums[i]+"||"+(i+nums[i])+":"+nums.length+" ");

			//若該位置能夠直接到達終點
			if ((i+nums[i])>=nums.length-1) {
				success_point[i]=1;//表示為能夠走到終點
				success_flag=i;//記錄下來當前能夠到達終點最近的點
				//此flag的目的為將此能夠到達終點的索引值也視為終點
				//若較小的索引範圍內的點可以找到這個旗幟，那麼也表示成可以走到終點。
			}

			if(i+nums[i]<=nums.length-1){//若這個索引範圍到不了終點了
				if(i+nums[i]>=success_flag){//同樣視為終點的旗幟是否存於索引範圍中
					success_flag=i;//update success_flag
					success_point[i]=1;//成功的話也會將此位置視為能夠到終點的索引位置
				}
			}
		}

		for(int i=0;i<success_point.length;i++){
			System.out.print(success_point[i]+"\t");
		}
		if(success_point[0]>0){
			return true;
		}
		//直接問有沒有點能夠到這些位置
		return false;
	}

}