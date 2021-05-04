package StopWatch;

public class Main {
    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        stopWatch.end();
        System.out.println(stopWatch.getElapsedTime());
    }
}
