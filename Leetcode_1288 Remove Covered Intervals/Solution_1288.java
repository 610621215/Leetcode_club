import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Solution_1288 {
	//���|������2�����p
	
	public static void main(String[]args) {
		 Solution_1288 sol=new Solution_1288();
	
		 int[][] intervals=new int[3][];
	
		 intervals[0]=new int[] {1,3};
		 intervals[1]=new int[] {1,6};
		 intervals[2]=new int[] {4,6};
//		 data[2]=new int[] {2,8};
//		 [[1,2],[1,3]]
//		 [[1,3],[1,8],[5,8]] //1 <--�o���޿���~�A�S�����Y�ɭP��
//		 [[1,6],[4,6],[4,8]] //2
		 List group=new ArrayList<int[]>() {
			   @Override
			public boolean contains(Object o) {
			// TODO Auto-generated method stub
				   int[] e =(int[])o;
					for(int i=0;i<this.size();i++) {
						//�Q�л\���H��add
						//28�л\3,6
						if(this.get(i)[0]==e[0]&&this.get(i)[1]<=e[1]) {//���Y
							this.remove(i);
							this.add(e);
							return false;
						}
						if(this.get(i)[0]<=e[0]&&this.get(i)[1]>=e[1]) { //�]��
							return false;
						}
					}
					return true;
			}
			
			};
		Arrays.sort(intervals,(a,b)->a[0]-b[0]);
//		for(int i=0;i<intervals.length;i++) {
//			System.out.print(intervals[i][0]+","+intervals[i][1]);
//			System.out.println();
//		}
		
		for(int i=0;i<intervals.length;i++) {
			if(group.contains(intervals[i])) {
				group.add(intervals[i]);
			}
		}
//		System.out.println(group.size());
	 }
	
	 public int removeCoveredIntervals(int[][] intervals) {
	        return 0;
	 }
}
