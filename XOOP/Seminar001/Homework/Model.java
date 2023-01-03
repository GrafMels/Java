
// package Homework;
import java.util.LinkedList;

/**
 * Model
 */
public class Model {
    public static void WorkPrint() {
        for (int index = 0; index < View.count; index++) {
            System.out.println(View.fullInform.get(index));
        }
    }

    public static void WorkPrint(LinkedList<Integer> Class) {
        Integer num = PrintMe.whatPrint();
        for (int index = 0; index < View.count; index++) {
            if (num.compareTo(Class.get(index)) == 0) {
                System.out.println(View.fullInform.get(index));
            }

        }
    }

    public static void WorkPrint(LinkedList<String> surname, String x) {
        String num = PrintMe.whatPrint(x);
        for (int index = 0; index < View.count; index++) {
            if (num.equals(surname.get(index))) {

                System.out.println(View.fullInform.get(index));
            }

        }
    }

    public static void WorkPrint(LinkedList<String> surname, LinkedList<String> firstName) {
        String lastName = PrintMe.whatPrint("Фамилию");
        String name = PrintMe.whatPrint("Имя");
        for (int index = 0; index < View.count; index++) {
            if (lastName.equals(surname.get(index))) {
                if (name.equals(firstName.get(index))) {
                    System.out.println(View.fullInform.get(index));
                }
            }

        }
    }

    public static void WorkPrint(LinkedList<String> surname, LinkedList<String> firstName,
            LinkedList<String> patronymic) {
        String lastName = PrintMe.whatPrint("Фамилию");
        String name = PrintMe.whatPrint("Имя");
        String otchestvo = PrintMe.whatPrint("Имя");
        for (int index = 0; index < View.count; index++) {
            if (lastName.equals(surname.get(index))) {
                if (name.equals(firstName.get(index))) {
                    if (otchestvo.equals(patronymic.get(index))) {
                        System.out.println(View.fullInform.get(index));
                    }
                }
            }

        }
    }

    public static void WorkPrint(LinkedList<Integer> dayOfBirth, LinkedList<Integer> monthOfBirth,
            LinkedList<Integer> yearOfBirth, String x) {
        String num = String.valueOf(PrintMe.whatPrint(0));

        for (int index = 0; index < View.count; index++) {
            String num2 = String.valueOf(dayOfBirth.get(index)) + " " + String.valueOf(monthOfBirth.get(index))
                    + " " + String.valueOf(yearOfBirth.get(index));
            if (num.equals(num2)) {
                System.out.println(View.fullInform.get(index));
            }

        }
    }

    public static void Delete() {
        int num = PrintMe.whatPrint(true);
        num -= 1;
        View.dayOfBirth.remove(num);
        View.monthOfBirth.remove(num);
        View.yearOfBirth.remove(num);
        View.patronymic.remove(num);
        View.firstName.remove(num);
        View.surname.remove(num);
        View.classNumber.remove(num);
        View.classLetter.remove(num);
        View.fullInform.clear();
        for (int i = 0; i < View.count - 1; i++) {

            View.fullInform
                    .add(String.format("%s %s %s %s %s %s %s %s %s", i + 1, View.surname.get(i), View.firstName.get(i),
                            View.patronymic.get(i), View.dayOfBirth.get(i), View.monthOfBirth.get(i),
                            View.yearOfBirth.get(i), View.classNumber.get(i),
                            View.classLetter.get(i)));
        }
    }
}
