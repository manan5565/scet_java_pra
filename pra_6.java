public class pra_6 {
    public static void main(String[] args) throws Exception {
        StopWatch s = new StopWatch();
        s.start();
        for (int i = 0; i < 5; i++) {
            Thread.sleep(1750);
        }
        s.end();
        System.out.println("Start Time is " + s.getStartTime() + " seconds");
        System.out.println("End Time is " + s.getEndTime() + " seconds");
        System.out.println("Elapsed Time is " + s.getElapsedTime() + " seconds");
    }
}

class StopWatch {
    private long startTime;
    private long endTime;

    public float getStartTime() {
        return startTime;
    }

    public float getEndTime() {
        return endTime;
    }

    // default con.
    StopWatch() {

    }

    public void start() {
        this.startTime = System.currentTimeMillis();
    }

    public void end() {
        this.endTime = System.currentTimeMillis();
    }

    public float getElapsedTime() {
        return ((endTime - startTime) / 1000);
    }
}