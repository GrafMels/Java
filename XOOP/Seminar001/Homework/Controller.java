// package Homework;
/**
 * Controller
 */
public class Controller {
    public static void contr() {
        View.read();
        View.count = 0;
        View.numberOfLines("Homework/DatabaseClass.txt");

        String out = "N";
        for (; out.equals("N");) {
            String answer = View.whatWork();
            if (answer.equals("0")) {
                Model.WorkPrint();
            } else if (answer.equals("1")) {
                Model.WorkPrint(View.classNumber);
            } else if (answer.equals("2")) {
                Model.WorkPrint(View.surname, "Фамилию");
            } else if (answer.equals("3")) {
                Model.WorkPrint(View.surname, View.firstName);
            } else if (answer.equals("4")) {
                Model.WorkPrint(View.surname, View.firstName, View.patronymic);
            } else if (answer.equals("5")) {
                Model.WorkPrint(View.dayOfBirth, View.monthOfBirth, View.yearOfBirth, " ");
            } else if (answer.equals("6")) {
                Model.Delete();
                View.count -= 1;
            } else if (answer.equals("7")) {
                out = "Y";

                Save.clearFiles();
                Save.save();
            } else {
                System.out.println("Ошибка ввода");
            }
        }

    }

}
