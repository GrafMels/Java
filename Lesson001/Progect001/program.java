
import java.util.Scanner;

public class program {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("int a: ");
        boolean flag = iScanner.hasNextInt();
        if (flag == true) {
            int z = iScanner.nextInt();
            int x = --z - z--;// z = z - 2
            int y = --z;// z = z - 1
            System.out.println(z--);// z = z - 1 // z = z - 3
            System.out.println(--z);// z = z - 1 // z = z - 2
            System.out.println(x);
            System.out.println(y);
            System.out.println();
            String s = "123";
            for (int i = 0; i < 100; i++) {
                z--;
                s = s + z;
                System.out.println(s);
            }
        } else {
            System.out.println("Неверное значение");
        }
        iScanner.close();
    }

}