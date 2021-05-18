public class Sol {
    public int minSteps(int n) {
        int[] cost_map=new int[n+1];//成本地圖
        for(int i=2;i<=n;i++){
            cost_map[i]=i;
            for(int j=i-1;j>1;j--){
                if(j>1&&i%j==0){
                    cost_map[i]=cost_map[j]+i/j;
                    break;
                }
            }
        }
        return cost_map[n];
    }
}
