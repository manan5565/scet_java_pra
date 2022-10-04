public class pra_6 {
    public static void main(String[] args) {
        StopWatch s = new StopWatch();
        s.start(10);
        s.end(30);
        System.out.println("Start Time is " + s.getStartTime() + " seconds");
        System.out.println("End Time is " + s.getEndTime() + " seconds");
        System.out.println("Elapsed Time is " + s.getElapsedTime() + " seconds");
    }
}

class StopWatch {
    private float startTime;
    private float endTime;

    public float getStartTime() {
        return startTime;
    }

    public float getEndTime() {
        return endTime;
    }

    // default con.
    StopWatch() {

    }

    public void start(float startTime) {
        this.startTime = startTime;
    }

    public void end(float endTime) {
        this.endTime = endTime;
    }

    public float getElapsedTime() {
        return ((endTime - startTime) * 1000);
    }
}