package Bai_4_Class_OOP.Bai_tap;

public class StopWatch {
    private long startTime;
    private long endTime;
    public StopWatch(){
        this.startTime = System.currentTimeMillis(); // thời gian hiện tại
    }

    public StopWatch(long startTime, long endTime) {
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public long getStartTime() {
        return startTime;
    }

    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public void setEndTime(long endTime) {
        this.endTime = endTime;
    }
    public void start (){
        this.startTime = System.currentTimeMillis();
    }
    public void stop(){
        this.endTime = System.currentTimeMillis();
    }
    public long getElapsedTime(){
        return endTime - startTime;
    }
}
