public class Clock extends Thread {
    public static long intermediateTime;
    @Override
    public void run() {
        Thread current = Thread.currentThread();

        while (!current.isInterrupted())
        {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                // System.out.println("Работа потока "+current.getName()+ " была прервана");
                break;
            }

            intermediateTime=(System.currentTimeMillis()- Task1.startTime) / 1000;
            System.out.println("- " + intermediateTime + " сек. ");
        }
    }

}
