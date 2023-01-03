import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * View
 */
public class View {
    public static Scanner scan = new Scanner(System.in);
    public static LinkedList<Integer> dayOfBirth;
    public static LinkedList<Integer> monthOfBirth;
    public static LinkedList<Integer> yearOfBirth;
    public static LinkedList<String> patronymic;
    public static LinkedList<String> firstName;
    public static LinkedList<String> surname;
    public static LinkedList<Integer> classNumber;
    public static LinkedList<String> classLetter;
    public static LinkedList<String> fullInform;

    public static String scanString = "";

    public static int count = 0;

    public static void read() {
        numberOfLines("Homework/DatabaseClass.txt");
        classNumber = new LinkedList<>();
        classLetter = new LinkedList<>();
        initial("Homework/DatabaseClass.txt");
        count = 0;

        numberOfLines("Homework/DatabaseDate.txt");
        dayOfBirth = new LinkedList<>();
        monthOfBirth = new LinkedList<>();
        yearOfBirth = new LinkedList<>();
        initial("Homework/DatabaseDate.txt");
        count = 0;

        numberOfLines("Homework/DatabaseName.txt");
        patronymic = new LinkedList<>();
        firstName = new LinkedList<>();
        surname = new LinkedList<>();
        initial("Homework/DatabaseName.txt");

        fullInform = new LinkedList<>();
        stack();
        // printt(fullInform);

    }

    public static void numberOfLines(String fileName) {
        try (FileReader reader = new FileReader(fileName)) {
            Scanner iScane = new Scanner(reader);
            while (iScane.hasNext()) {
                count++;
                iScane.nextLine();
                reader.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void initial(String fileName) {
        try (FileReader reader = new FileReader(fileName)) {
            Scanner iScane = new Scanner(reader);

            for (; iScane.hasNext();) {
                View.scanString = iScane.nextLine();
                if (fileName.equals("Homework/DatabaseClass.txt")) {
                    String[] words = View.scanString.split(" ");
                    classNumber.add(Integer.valueOf(words[0]));
                    classLetter.add(words[1]);
                } else if (fileName.equals("Homework/DatabaseDate.txt")) {
                    String[] words = View.scanString.split(" ");
                    dayOfBirth.add(Integer.valueOf(words[0]));
                    monthOfBirth.add(Integer.valueOf(words[1]));
                    yearOfBirth.add(Integer.valueOf(words[2]));
                } else {
                    String[] words = View.scanString.split(" ");
                    surname.add(words[0]);
                    firstName.add(words[1]);
                    patronymic.add(words[2]);
                }
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void printt(LinkedList dataString) {
        for (int index = 0; index < 200; index++) {
            System.out.println(dataString.get(index));
        }
    }

    public static void stack() {
        for (int i = 0; i < 200; i++) {
            fullInform.add(String.format("%s %s %s %s %s %s %s %s %s", i + 1, surname.get(i), firstName.get(i),
                    patronymic.get(i), dayOfBirth.get(i), monthOfBirth.get(i), yearOfBirth.get(i), classNumber.get(i),
                    classLetter.get(i)));
        }
    }

    public static String whatWork() {
        System.out.println("\n\nОтвет ввестти одной цифрой.");
        System.out.println("Выберете действия для продолжения: \n0. Показать всех учеников\n1. Найти информацию по номеру класса\n2. Найти информацию по номеру класса и литере\n3. Найти учеников по Фамилии\n4. Найти учеников по Фамилии и Имени\n5. Найти учеников по ФИО\n6. Найти учеников по Дате рождения\n7. Удалить ученика по номеру в БД\n8. Добавить ученика по номеру в БД\n9. Сохранить БД в файлы и выйти");
        if(scan.hasNextLine()){
            String answer = scan.nextLine();
            return answer;
        } 
        return "";  
        
    }
}
/**
 * InnerView
 */
class PrintMe {
    public static Scanner scan = new Scanner(System.in);

    public static Integer whatPrint() {
        System.out.println("\n\nОтвет ввестти одной цифрой.");
        System.out.println("Какой класс вы хотите найти");
            if(scan.hasNextInt()){
                Integer answer = scan.nextInt();
                System.out.println("\n\n");
                return answer;
            } 
        return 0;
    }

    public static String whatPrint(String x) {
        System.out.println("\n\nОтвет ввести одной Буквой");
        System.out.println("Какой класс вы хотите найти");
            if(scan.hasNextLine()){
                String answer = scan.nextLine();
                System.out.println("\n\n");
                return answer;
            } 
        return "";
    }
    
}
