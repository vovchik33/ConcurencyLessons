import java.util.Date;

/**
 * Created by vladimirkr on 6/15/2015.
 */
public class Main {

    public static void main(String[] args) {
        NewThread thread1 = new NewThread();
        thread1.setName("thread1");
        NewThread thread2 = new NewThread();
        thread2.setName("thread2");
        thread1.start();
        thread2.start();
    }
    static class NewThread extends Thread {
        long timestamp;
        @Override
        public void run() {
            while(true) {
                long newtimestamp = new Date().getTime();
                System.out.println(this.getName()+" - "+(newtimestamp-timestamp)+" - "+"Hello, World!");
                timestamp = newtimestamp;
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
