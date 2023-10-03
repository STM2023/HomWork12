public class Task1 {
    public static long startTime;


    public static void main(String[] args) throws InterruptedException {
        startTime = System.currentTimeMillis();
        //  System.out.println("  "+ startTime );
        System.out.println("З моменту запуску програми минуло:" );

        Clock clock = new Clock();
        clock.start();

        ClockPrint clockPrint = new ClockPrint();
        clockPrint.start();

        Thread.sleep(65000);//****

        clock.interrupt();
        clockPrint.interrupt();
    }
}
