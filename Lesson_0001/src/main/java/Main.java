/**
 * Created by vladimirkr on 6/15/2015.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Lesson_0001");
        for (int i=0; i<5; i++) {
            Thread thread = new Thread(new NewThread(i));
            thread.start();
        }
    }

    static class NewThread implements Runnable {

        private int j;

        public NewThread(int i) {
            j=i;
        }

        @Override
        public void run() {
            for (int i=0; i<2; i++) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(j);
            }
        }
    }
}
