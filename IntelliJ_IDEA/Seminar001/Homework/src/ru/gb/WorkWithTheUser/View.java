package ru.gb.WorkWithTheUser;

import java.util.Scanner;

/**
 * Class for communication with user
 * Have 1 field with scanner
 */
public class View {
    static Scanner sc = new Scanner(System.in);
    /**
     * Method for give navigation Menu
     * @return The answer to our question to the user
     */
    public static int mainMenu(){
        System.out.println("Выберите пункт меню и введите нужную цифру: ");
        System.out.println("1. Добавить записку");
        System.out.println("2. Посмотреть список записок");
        System.out.println("3. Посмотреть записку");
        System.out.println("0. Для выхода");
        int answer = 0;
        if (sc.hasNextInt()){
            answer = sc.nextInt();
        }
        return answer;
    }

    /**
     * Method for input title
     * @return title
     */
    public static String inputTitle(){
        System.out.println("Введите заголовок записки: ");
        sc.nextLine();
        return sc.nextLine();
    }

    /**
     * Method for input what's inside Note
     * @return text
     */
    public static String inputNote(){
        System.out.println("Введите то что хотите записать в записку: ");
        return sc.nextLine();
    }

    /**
     * Method to close scanner
     */
    public static void scannerClose(){
        sc.close();
    }

    /**
     * Method for choice Note
     * @param max - LinkedList size
     * @return answer with the correct value
     */
    public static int choiceNote(int max){
        int answer = 0;
        if (sc.hasNextInt()){
            answer = sc.nextInt();
        }
        if (answer < 1 || answer > max){
            answer = 0;
        }
        return answer-1;
    }
}
