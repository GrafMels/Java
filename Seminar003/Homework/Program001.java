import java.util.Scanner;

public class Program001 {
    public static int a = 1;
    public static int b = 22202;
    public static int c = 2;
    public static int d = 1;
    public static int codeSize = 1000000;//Изменяя это число можно увеличивать или уменьшат проходов по вариантам строк
    public static String[] code = new String[codeSize];
    public static Scanner iScanner = new Scanner(System.in);

    public static void main(String[] args) {
        String examination = "N";
        for(;examination.equals("Y");){
            a = Scan("a");
            b = Scan("b");
            c = Scan("c");
            d = Scan("d");
            if(a<b){
                examination = "N";
            }else{
                System.out.println("\nНеверные значения чисел! Измените их!\n");
            }
        }

        fillCode();
        printArray();
        iScanner.close();
    }
        

    public static int Scan(String name) {
        int g = 0;
        System.out.printf("Введите число %s:", name);
        boolean flag = iScanner.hasNextInt();
            if (flag == true){
                g = iScanner.nextInt();
            }
           
         return g;
    }   
// заполняет массив не повторяющимися строками
    public static void fillCode() {
        int counterErrors = 0;
        for (int i = 0; i < codeSize & counterErrors < (codeSize/10); i++) {
            String element = codeDo(a, b, c, d);
            if (element.equals("Error 404")) {
                counterErrors++;
                i--;
            } else {
                String mark = existA(element);
             
                if(mark.equals("Y")){
                    code[i] = element;
                }else{
                    counterErrors++;
                    i--;
                }
            }
        }
    }
//рандомно создаёт строку и либо сохраняет её либо нет
    public static String codeDo(int a, int b, int c, int d) {
        String code = "";
        for (; a < b;) {
            double random = Math.random();
            if (a < b) {
                if (random < 0.5) {
                    a = a + d;
                    code = code + "1";
                } else {
                    a = a * c;
                    code = code + "0";
                }
            }
        }
        if (a == b) {
            return code;
        } else {
            return "Error 404";
        }

    }

    //Метод проверяющий наличие элемента в массиве
    private static String existA(String a) {
        for (String s : code) {
            if (a.equals(s)) {
                return "N";
            }
        }
        return "Y";
    }
    //Метод печати массивa
    private static void printArray() {  
        int shortestLenght = 0;  
        try {
            shortestLenght = code[0].length();
        } catch (Exception e) {
            shortestLenght = 0;
        }
        if(shortestLenght != 0){
            int f = 0;
            String[] shortestString = new String[100];
            for (int i = 0; code[i] != null; i++) {
                if(shortestLenght > code[i].length()){
                    shortestLenght = code[i].length();
                }
            }

            for (int i = 0; code[i] != null; i++) {
                if(code[i].length() == shortestLenght){
                    shortestString[f] = code[i];
                    f++;
                }
            }
            for (int i = 0; code[i] != null; i++) {
                String[] words = code[i].split("");
                String resultString = a + "";
                for (int j = 0; j < code[i].length(); j++) {
                    if(words[j].equals("1")){
                        resultString += " + " + d;
                    }else{
                        resultString += " * " + c;
                    }
                }
                resultString += " = " + b;
                code[i] = resultString;
            }
            int maxAmount = 0;
            for (int i = 0; code[i] != null; i++) {
                System.out.println(i+1 + ": " + code[i]);
                maxAmount = i+1;
            }
            System.out.printf("\nКолличество найденных вхождений: %d", maxAmount);
            System.out.println("\nСамые короткие строки: ");
            for (int i = 0; shortestString[i] != null; i++) {
                System.out.println(i+1 + ": " + code[i]);
                
            }
        }else{
            System.out.println("\nВарианты не найдены!");
        }
    }
}