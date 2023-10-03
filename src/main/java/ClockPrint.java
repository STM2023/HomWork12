public class ClockPrint extends Thread {
    @Override
    public void run() {
        Thread current = Thread.currentThread();

        while (!current.isInterrupted())
        {
            try {
                Thread.sleep(5000);

            } catch (InterruptedException e) {
                // System.out.println("Работа потока "+current.getName()+ "  была прервана");
                break;
            }
            System.out.println("Минуло 5 секунд" );

        }
    }
}


