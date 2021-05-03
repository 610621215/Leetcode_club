public class Sol {
    int min =1001;
    //int times=1;
    public int minSteps(int n) { //這個想法在 n<12的時候可以這樣解，但n=50時就不能這樣想
        int times=1;
        if(n==1){
            return 0;
        }
        int min_exteral_paste=n;

       for(int i=2;i<n;i++){

           times++;// paste
           int exteral_paste=1;

            for(int j=i;j<n;j+=i){//重複貼上的點

                if((n%j)==0){
                    if(min_exteral_paste>times+(n/j)+exteral_paste){
                        min_exteral_paste=times+(n/j)+exteral_paste;
                    }
                }

                exteral_paste++;
            }
            System.out.println(exteral_paste);

       }
       return min_exteral_paste;
    }
}
