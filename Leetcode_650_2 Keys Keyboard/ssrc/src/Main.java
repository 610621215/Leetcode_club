class Main {

    public static void main(String[]args){
        Sol Sol=new Sol();
        System.out.println("9):"+Sol.minSteps(9)+","+new answer().minSteps(9));
        System.out.println("3):"+Sol.minSteps(3)+","+new answer().minSteps(3));
        System.out.println("1):"+Sol.minSteps(1)+","+new answer().minSteps(1));
        System.out.println("2):"+Sol.minSteps(2)+","+new answer().minSteps(2));
        System.out.println("10:"+Sol.minSteps(10)+","+new answer().minSteps(10));
        System.out.println("11:"+Sol.minSteps(11)+","+new answer().minSteps(11));
        System.out.println("12:"+Sol.minSteps(12)+","+new answer().minSteps(12)); //計算為 10次 答案是7次
        System.out.println("13:"+Sol.minSteps(13)+","+new answer().minSteps(13));
        System.out.println("50:"+Sol.minSteps(50)+","+new answer().minSteps(50)); //計算為27次 答案為12次
        System.out.println("100:"+Sol.minSteps(100)+","+new answer().minSteps(100)); //計算為27次 答案為12次
        System.out.println("27:"+Sol.minSteps(27)+","+new answer().minSteps(27)); //計算為27次 答案為12次

    }
}
