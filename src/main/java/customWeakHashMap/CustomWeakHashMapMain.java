package customWeakHashMap;

import java.util.Random;

public class CustomWeakHashMapMain {
    public static void main(String[] args) {
        CustomWeakHashMap<String, String> weakStrings = new CustomWeakHashMap<>();
        while (true) {
            for (int i = 0; i < 200; i++) {
                weakStrings.insert(" " + new Random().nextInt(100000), " " + new Random().nextDouble());

            }
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
