package Ex001Calc;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Program {
    public static void main(String[] args) throws IOException {
        FileWriter writer = new FileWriter("Example.txt");
        for (int i = 0; i < 1000; i++) {
            long time = System.currentTimeMillis();
            Presenter p = new Presenter(new SumModel(), new View());
            for (int j = 0; j < 10; j++) {
                p.buttonClick();
            }
            String endTime = String.format("%d ms\n", System.currentTimeMillis() - time);
            System.out.print(endTime);

            writer.write(endTime);

        }
        writer.close();

    }
}
