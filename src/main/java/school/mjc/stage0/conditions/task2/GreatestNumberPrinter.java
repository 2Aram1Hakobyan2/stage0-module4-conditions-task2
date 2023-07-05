package school.mjc.stage0.conditions.task2;

public class GreatestNumberPrinter {
    public void printGreatest(int first, int second) {
        boolean greatest1 = first > second;
        if (greatest1) {
            System.out.println(first);
        } else if (!greatest1) {
            System.out.println(second);
        } else {
            System.out.println(first);
        }
    }
}
