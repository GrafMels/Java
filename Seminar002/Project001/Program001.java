package Project001;

import java.util.Random;

public class Program001 {
    public static int[] rand_array = new int[12];
    public static int positive = 0;
    public static int negative = 0;

    public static void main(String[] args) {
        for (int i = 0; i < rand_array.length; i++) {
            rand_array[i] = rand();
            print1(i);
        }
        System.out.println("Положительные = " + positive);
        System.out.println("Отрицательные = " + negative);

    }

    public static int rand() {
        return new Random().nextInt(9 - (-9) + 1) + -9;
    }

    public static void print1(int i) {
        String Hoho = String.valueOf(rand_array[i]);
        String Hoho1 = String.valueOf(Hoho.charAt(0));
        if (Hoho1.equals("-")) {
            System.out.println(Hoho);
            negative += rand_array[i];
        } else {
            System.out.println(" " + Hoho);
            positive += rand_array[i];
        }
    }

}
