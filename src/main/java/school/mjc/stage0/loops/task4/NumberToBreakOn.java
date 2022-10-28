package school.mjc.stage0.loops.task4;

public class NumberToBreakOn {
    public static void main(String[] args) {
        printNumbersUntilWithBreakOn(3, 10);
    }

    public static void printNumbersUntilWithBreakOn(int toBreakWith, int numberToGoUntil) {
        if (toBreakWith > numberToGoUntil) {
            System.out.println("iterating till the end");
        }
        for (int i = 1; i <= numberToGoUntil; i++) {
            if (i <= toBreakWith) {
                System.out.println(i);
            } else break;
        }
    }
}
