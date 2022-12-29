import java.util.Scanner;
import java.util.Random;

/**
 * 282 строки жести.
 */
public class Program001 {
    public static String[][] array = null;
    public static int[] usedPoints = null;
    public static int[] usedPointsTemporary = null;
    public static int[] ruler = null;
    public static Scanner Scan = new Scanner(System.in);
    public static int squareLength = 0;
    public static int[] start = new int[2];
    public static int[] finish = new int[2];
    public static int[] temporaryAdres = new int[2];
    public static int[] temporaryStorage = new int[2];

    /**
         * Нули это пустые клетки по которые нельзя ходить
         * 99 Это наикратчайщий путь.
     */

    public static void main(String[] args) {
        inputArray();
        fillZeroArray();
        randomHoles();
        inputStartFinish();
        fillmatrix();

        fillZeroArrayNow();
        findingAWay();
        outputArray(); 
    }

    /**
     * Функция ввода длинны матрицы на который мы будем искать путь
     */
    public static void inputArray() {
        System.out.print("Длину стороны квадрата: ");
        if (Scan.hasNextInt()) {
            squareLength = Scan.nextInt();

        }
        array = new String[squareLength][squareLength];// Инициализация массива карты и линейки
        ruler = new int[squareLength];
        usedPoints = new int[squareLength * 8];
        usedPointsTemporary = new int[squareLength * 8];
        ;

    }

    /**
     * Заполнение матрицы строковыми нулями
     */
    public static void fillZeroArray() {
        for (int i = 0; i < squareLength; i++) {
            for (int j = 0; j < squareLength; j++) {
                array[i][j] = "0";
            }

        }

    }
    /**
     * Косыль заполнения пустых ячеек нулями, нужен для работы
     */
    public static void fillZeroArrayNow() {
        for (int i = 0; i < squareLength; i++) {
            for (int j = 0; j < squareLength; j++) {
                if(array[i][j].equals(" "))
                array[i][j] = "0";
            }

        }

    }

    /**
     * Вывод матрицы в консоль
     */
    public static void outputArray() {
        System.out.print("   ");
        for (int j = 0; j < squareLength; j++) {
            ruler[j] = j;
            if (j < 10) {
                System.out.print(ruler[j] + "  ");
            } else if (j >= 10) {
                System.out.print(ruler[j] + " ");
            }
        }
        System.out.println();
        for (int i = 0; i < squareLength; i++) {
            if (i < 10) {
                System.out.print(" " + ruler[i] + " ");
            } else if (i >= 10) {
                System.out.print(ruler[i] + " ");
            }

            for (int j = 0; j < squareLength; j++) {
                try {
                    if (Integer.parseInt(array[i][j]) == 0) {
                        System.out.print("   ");
                    }else if (Integer.parseInt(array[i][j]) < 10) {
                        System.out.print(array[i][j] + "  ");
                    } else if (Integer.parseInt(array[i][j]) >= 10) {
                        System.out.print(array[i][j] + " ");
                    }
                } catch (Exception e) {
                    System.out.print(array[i][j] + "  ");
                }

            }

            System.out.println();
        }
    }

    /**
     * Создание тех самы пусты мест
     */
    public static void randomHoles() {
        for (int i = 0; i < squareLength * 4; i++) {
            int height = new Random().nextInt((squareLength - 2) + 1) + 1;
            int weight = new Random().nextInt((squareLength - 2) + 1) + 1;
            array[height][weight] = " ";
        }

    }

    /**
     * Функция ввода расположения старта и финиша.
     */
    public static void inputStartFinish() {
        System.out.println("Введите точку старта по X: ");
        if (Scan.hasNextInt()) {
            start[1] = Scan.nextInt();

        }
        System.out.println("Введите точку старта по Y: ");
        if (Scan.hasNextInt()) {
            start[0] = Scan.nextInt();

        }
        System.out.println("Введите точку финиша по X: ");
        if (Scan.hasNextInt()) {
            finish[1] = Scan.nextInt();

        }
        System.out.println("Введите точку финиша по Y: ");
        if (Scan.hasNextInt()) {
            finish[0] = Scan.nextInt();

        }
        array[start[0]][start[1]] = "X";
        array[finish[0]][finish[1]] = "Y";

        usedPoints[0] = start[0];
        usedPoints[1] = start[1];
    }

    /**
     * Заполнения матрицы начиная от старта волновой функцией
     */
    public static int fillmatrix() {
        int c = 1;
        for (int i = 0; i < squareLength * squareLength; i++) {
            int temporary = 0;
            String cString = Integer.toString(c);
            for (int j = 0; j < squareLength * 8; j = j + 2) {
                if(usedPoints[j + 1] - 1 > 0){
                    if (array[usedPoints[j]][usedPoints[j + 1] - 1].equals("0")) {
                        array[usedPoints[j]][usedPoints[j + 1] - 1] = cString;
                        usedPointsTemporary[temporary++] = usedPoints[j];
                        usedPointsTemporary[temporary++] = usedPoints[j + 1] - 1;
                    } 
                }
                if (usedPoints[j + 1] + 1 < squareLength) {
                    if (array[usedPoints[j]][usedPoints[j + 1] + 1].equals("0")) {
                        array[usedPoints[j]][usedPoints[j + 1] + 1] = cString;
                        usedPointsTemporary[temporary++] = usedPoints[j];
                        usedPointsTemporary[temporary++] = usedPoints[j + 1] + 1;
                    } 
                }
                if (usedPoints[j] - 1 > 0) {
                    if (array[usedPoints[j] - 1][usedPoints[j + 1]].equals("0")) {
                        array[usedPoints[j] - 1][usedPoints[j + 1]] = cString;
                        usedPointsTemporary[temporary++] = usedPoints[j] - 1;
                        usedPointsTemporary[temporary++] = usedPoints[j + 1];
                    }
                }
                if (usedPoints[j] + 1 < squareLength) {
                    if (array[usedPoints[j] + 1][usedPoints[j + 1]].equals("0")) {
                        array[usedPoints[j] + 1][usedPoints[j + 1]] = cString;
                        usedPointsTemporary[temporary++] = usedPoints[j] + 1;
                        usedPointsTemporary[temporary++] = usedPoints[j + 1];
                    }
                }
            }
            for (int j = 0; j < usedPoints.length; j++) {
                usedPoints[j] = usedPointsTemporary[j];
            }

            c++;
        }
        return 0;

    }

    /**
     * Нахождение и закрашивание пути
     */
    public static int findingAWay() {
            temporaryStorage[0] = finish[0];
            temporaryStorage[1] = finish[1];
            for (int j = 0; j < squareLength * 8; j++) {
                
                if(temporaryStorage[0]-1 > 0){
                    if(!array[temporaryStorage[0]-1][temporaryStorage[1]].equals("0")){
                        if(isDigit(array[temporaryStorage[0]-1][temporaryStorage[1]])){
                            temporaryAdres[0] = temporaryStorage[0]-1;
                            temporaryAdres[1] = temporaryStorage[1];
                        }else if(array[temporaryStorage[0]-1][temporaryStorage[1]].equals("X")){
                            return 0;
                        }
                    }
                }
                if (temporaryStorage[1]-1 > 0) {
                    if(!array[temporaryStorage[0]][temporaryStorage[1]-1].equals("0")){
                    
                        if(isDigit(array[temporaryStorage[0]][temporaryStorage[1]-1])){
                            if(Integer.parseInt(array[temporaryStorage[0]][temporaryStorage[1]-1]) < Integer.parseInt(array[temporaryAdres[0]][temporaryAdres[1]])){
                                temporaryAdres[0] = temporaryStorage[0];
                                temporaryAdres[1] = temporaryStorage[1]-1;
                            } 
                        }else if(array[temporaryStorage[0]][temporaryStorage[1]-1].equals("X")){
                            return 0;
                        }
                    }
                }
                if (temporaryStorage[0]+1 < squareLength) {
                    if(!array[temporaryStorage[0]+1][temporaryStorage[1]].equals("0")){
                    
                        if(isDigit(array[temporaryStorage[0]+1][temporaryStorage[1]])){
                            if(Integer.parseInt(array[temporaryStorage[0]+1][temporaryStorage[1]]) < Integer.parseInt(array[temporaryAdres[0]][temporaryAdres[1]])){
                                temporaryAdres[0] = temporaryStorage[0]+1;
                                temporaryAdres[1] = temporaryStorage[1];
                            } 
                        }else if(array[temporaryStorage[0]+1][temporaryStorage[1]].equals("X")){
                            return 0;
                        }
                    }
                }
                if (temporaryStorage[1]+1 < squareLength) {
                    if(!array[temporaryStorage[0]][temporaryStorage[1]+1].equals("0")){
                    
                        if(isDigit(array[temporaryStorage[0]][temporaryStorage[1]+1])){
                            if(Integer.parseInt(array[temporaryStorage[0]][temporaryStorage[1]+1]) < Integer.parseInt(array[temporaryAdres[0]][temporaryAdres[1]])){
                                temporaryAdres[0] = temporaryStorage[0];
                                temporaryAdres[1] = temporaryStorage[1]+1;
                            } 
                        }else if(array[temporaryStorage[0]][temporaryStorage[1]+1].equals("X")){
                            return 0;
                        }
                    }
                }
                temporaryStorage[0] = temporaryAdres[0];
                temporaryStorage[1] = temporaryAdres[1];
                array[temporaryStorage[0]][temporaryStorage[1]]="99";
            }
           
            return 0;
    }
    /**
     * Функция которая используется в функции findingAWay и находит является ли элемнет массива Array целочисленным числом.
     */
    private static boolean isDigit(String s) throws NumberFormatException {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}