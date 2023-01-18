import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class View {
    public static int range = 200;
    public static String[] phoneNumber = new String[range];
    public static String[] fullName = new String[range];
    public static String[] birth = new String[range];
    public static String[] fullInform = new String[range];
    Scanner iScane;

    public void scaneClose() {
        Scanner iScane = new Scanner(System.in);
        iScane.close();
    }

    public static void readFirst() {
        int count = 0;
        try (FileReader reader = new FileReader("Import/UserPhoneNumbers.txt")) {
            Scanner iScane = new Scanner(reader);
            while (iScane.hasNext()) {
                phoneNumber[count++] = iScane.nextLine();
            }
            iScane.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        count = 0;
        try (FileReader reader = new FileReader("Import/UserFullName.txt")) {
            Scanner iScane = new Scanner(reader);
            while (iScane.hasNext()) {
                fullName[count++] = iScane.nextLine();
            }
            iScane.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        count = 0;
        try (FileReader reader = new FileReader("Import/UserBirth.txt")) {
            Scanner iScane = new Scanner(reader);
            while (iScane.hasNext()) {
                birth[count++] = iScane.nextLine();
            }
            iScane.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void readSubsequent() {
        System.out.println("Выберете с какого файла считать: \n1. XML\n2. MD\n3. TXT");
        Scanner iScane = new Scanner(System.in);
        boolean check = true;
        int number = 0;
        while (check == true) {
            if (iScane.hasNextInt()) {
                number = iScane.nextInt();
                if (number > 0 && number < 4) {
                    check = false;

                } else {
                    System.out.print("Вы ввели неверное число введите ещё раз: ");
                }
            } else {
                System.out.println("Извините, но это явно не число. Перезапустите программу и попробуйте снова!");
            }
        }

        int count = 0;
        if (number == 1 && Model.open[0]) {
            try (FileReader reader = new FileReader("File/File.xml")) {
                Scanner Scane = new Scanner(reader);
                while (Scane.hasNext()) {
                    fullInform[count++] = Scane.nextLine();
                }
                Scane.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else if (number == 2 && Model.open[1]) {
            try (FileReader reader = new FileReader("File/File.md")) {
                Scanner Scane = new Scanner(reader);
                if (Scane.hasNext()) {
                    Scane.nextLine();
                }
                while (Scane.hasNext()) {
                    fullInform[count++] = Scane.nextLine();
                }
                Scane.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else if (number == 3 && Model.open[2]) {
            try (FileReader reader = new FileReader("File/File.txt")) {
                Scanner Scane = new Scanner(reader);
                while (Scane.hasNext()) {
                    fullInform[count++] = Scane.nextLine();
                }
                Scane.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        iScane.close();
    }

    public static void writeTXT() {
        System.out.println("Выберете формат сохранения: \n1. XML\n2. MD\n3. TXT");
        Scanner iScane = new Scanner(System.in);
        boolean check = true;
        int number = 0;
        while (check == true) {
            if (iScane.hasNextInt()) {
                number = iScane.nextInt();
                if (number > 0 && number < 4) {
                    check = false;

                } else {
                    System.out.print("Вы ввели неверное число введите ещё раз: ");
                }
            } else {
                System.out.println("Извините, но это явно не число. Перезапустите программу и попробуйте снова!");
            }
        }
        Word document = new Word();
        document.setModel(new StringFormat());
        document.appendData(Controller.Users);
        if (number == 1) {
            document.setFormat(new XmlFormat());
            document.click();
        } else if (number == 2) {
            document.setFormat(new MdFormat());
            document.click();
        } else if (number == 3) {
            document.setFormat(new TxtFormat());
            document.click();
        }
        iScane.close();
    }
}
