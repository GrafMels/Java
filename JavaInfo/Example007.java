/**
 * Example007
 */
public class Example007 {
    public static void main(String[] args) {

        /*
         * Это создание экземпляров класса
         */
        Worker[] ws = new Worker[111];
        /*
         * Это инициализация экземпляров класса
         */
        for (int i = 0; i < ws.length; i++) {
            int[] arr = { 1, 2, 3, 4, 5 };
            ws[i] = new Worker();
            ws[i].name = String.format("%s", i);
            System.out.println(ws[i].Bar(arr));
        }

        System.out.println(ws[99].name);

    }
}

/*
 * Класс
 */
class Worker {
    protected int age;
    protected int salary;
    protected String name;

    String Bar(int[] arr) {

        return InnerWorker.tmp(arr, name);
    }
}

/*
 * Обьект
 */
class InnerWorker {
    static String tmp(int tarr[], String str) {
        return String.format("+++" + str);
    }
}