package school.mjc.stage0.conditions.task2;

public class CoinFlip {
    public void throwCoin(int from1UpTo1000) {
        boolean result = from1UpTo1000 < 500;
        if (result) {
            System.out.println("Eagle");
        } else {
            System.out.println("Tail");
        }
    }
}