import java.util.ArrayList;

/**
 * Program001
 */
public class Program001 {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Integer i = 10;
        Double d = 1.03;
        Number n = i;
        System.out.println(n);
        n = d;
        System.out.println(n);
        var<> numberOrNot = new ArrayList<>();
        numberOrNot.add(4);
        numberOrNot.add("4");
        numberOrNot.add("Privet");
        numberOrNot.add(1.213124);
        for (int j = 0; j < 4; j++) {
            System.out.println(numberOrNot.get(j));
        }

    }
}