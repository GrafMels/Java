
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class View {
    public static Scanner scan = new Scanner(System.in, "cp866");

    public static String inputNexusName() {
        System.out.print("Введите имя того чьих родителей хотите указать: ");
        if (scan.hasNextLine()) {
            String name = scan.nextLine();
            return name;
        }
        return "";
    }

    public static String inputMotherName() {
        System.out.print("Введите имя мамы: ");
        if (scan.hasNextLine()) {
            String name = scan.nextLine();
            return name;
        }
        return "";
    }

    public static String inputFatherName() {
        System.out.print("Введите имя папы: ");
        if (scan.hasNextLine()) {
            String name = scan.nextLine();
            return name;
        }
        return "";
    }

    public static Boolean inputSiblings() {
        System.out.print("Есть ли у него братья/сёстры?(Y/N): ");
        if (scan.hasNextLine()) {
            String condition = scan.nextLine();
            if (condition.equals("Y")) {
                return true;
            } else {
                return false;
            }
        }
        return false;

    }

    public static Boolean inputSibling() {
        System.out.print("Есть ли у него ещё братья/сёстры?: ");
        if (scan.hasNextLine()) {
            String condition = scan.nextLine();
            if (condition.equals("Y")) {
                return true;
            } else {
                return false;
            }
        }
        return false;

    }

    public static String inputSiblingName() {
        System.out.print("Как зовут брата/сёстру?: ");
        if (scan.hasNextLine()) {
            String name = scan.nextLine();
            return name;
        }
        return "";

    }

    public static Integer choice() {
        System.out.println("\nВведите индекст того с кого хотите продолжить(Введите 0 если хотите выйти): ");
        Nexus.getIndex();
        System.out.print(": ");
        if (scan.hasNextLine()) {
            String name = scan.nextLine();
            return Integer.valueOf(name);
        }
        return 0;
    }

    public static void saveInFile() {
        try (FileWriter writer = new FileWriter("DataFamily.txt")) {
            String data = "Член семьи (Мама ^ Папа)";
            writer.write(data);
            data = String.format("\n%s (%s ^ %s)", Controller.family.get(0), Nexus.kinship.get(0.1),
                    Nexus.kinship.get(0.2));
            writer.write(data);
            for (int i = 1; i < Controller.name.size(); i++) {
                data = String.format("\n%s (%s ^ %s)", Controller.family.get(i), Nexus.kinship.get(i + 0.1),
                        Nexus.kinship.get(i + 0.2));
                writer.write(data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
