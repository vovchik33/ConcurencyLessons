import java.util.Arrays;

/**
 * Created by admin on 16.06.15.
 */
public class Main {
    private static int[] numbers={0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
    public static void main(String[] args) {
        System.out.println("Hello, world!");
        NumbersProcessor processor1 = new NumbersProcessor(1);
        NumbersProcessor processor2 = new NumbersProcessor(2);
        processor1.setName("Processor#1");
        processor2.setName("Processor#2");

        processor1.start();
        processor2.start();

    }

    static class NumbersProcessor extends Thread {
        private int value;

        public NumbersProcessor(int value) {
            this.value = value;
        }

        @Override
        public void run() {
            synchronized (numbers) {
                for (int i = 0; i < numbers.length; i++) {
                    numbers[i] = value;
                }
                System.out.println(this.getName() + ":" + Arrays.toString(numbers));
            }
        }
    }
}
