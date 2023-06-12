package Ex004;

import java.io.FileWriter;
import java.io.IOException;

public class Program {
    public static void main(String[] args) throws IOException {
        FileWriter writer = new FileWriter("listResult.txt");
        long time = System.currentTimeMillis();
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.printf("Sum: %d\n", Sum());
            }
        }
        String endTime = String.format("%d ms\n", System.currentTimeMillis() - time);
        System.out.println();
        System.out.print(endTime);
        writer.write(endTime);
        writer.close();
    }

    public static int Sum() {
        System.out.print("a: ");
        int number1 = 0;
        number1 = (int) (Math.random() * 1000);
        System.out.println(number1);

        System.out.print("b: ");
        int number2 = 0;
        number2 = (int) (Math.random() * 1000);
        System.out.println(number2);

        return (number1 + number2);
    }
}
