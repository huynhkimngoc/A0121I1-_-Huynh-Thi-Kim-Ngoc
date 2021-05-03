package Bai_4_Class_OOP.Bai_tap;

import java.util.Arrays;

public class ClassMain2 {
    public static void main(String[] args) {
    int [] time = new int[1000000];
    for( int i =0; i<time.length; i++){
        time[i] = (int) (Math.random()*1000000);
    }
    StopWatch watch = new StopWatch();
        Arrays.sort(time);
        watch.stop();
        System.out.println(watch.getElapsedTime());
    }

}
