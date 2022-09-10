package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public void printDigitsSum(int t){
        String num=String.valueOf(t);
        int sum=0;
        int digit;
        t=t>0?t:-t;
        for(int i = 0;i<num.length();i++){
            digit=t%10;
            sum+=digit;
            t=t/10;
        }
        System.out.println(sum);

    }
}
