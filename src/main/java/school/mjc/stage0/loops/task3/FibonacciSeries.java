package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    public void printFibonacci(int lastFibonacci) {
        int on1=0,sec=1;
        int nex=on1+sec;
        System.out.println(on1);
        System.out.println(sec);
        for(int i =3;i<=lastFibonacci;i++){
            System.out.println(nex);
            on1=sec;
            sec=nex;
            nex=on1+sec;

        }
    }
}
