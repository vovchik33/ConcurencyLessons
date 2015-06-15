/**
 * Created by vladimirkr on 6/15/2015.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Lesson_0001");
        Thread thread = new Thread(new NewThread());
        thread.run();
    }

    static class NewThread implements Runnable {

        @Override
        public void run() {
            System.out.println("NewThread");
        }
    }
}
