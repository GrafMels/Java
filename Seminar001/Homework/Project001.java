package Homework;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class Project001{
    public static String answer;
    public static int a;
    public static int b;
    public static long c;
    public static String inp;
    public static double c_double = 0;
    public static Scanner Scan = new Scanner(System.in);//Открыл сканер как глобальную переменную что бы закрыть по окончанию main
    public static void main(String[] args) {
        input();
        if (answer.equals("Y")){
            get_file_data();
            c = exponentiation(a, b);
            put_data();

        } else {
            get_a_b();
            c = exponentiation(a, b);
            String c_String = String.valueOf(c); 
            if(c_String.equals("-1")){
                System.out.print(a + " ^ " + b + " = " + c_double);
            }else if(c_String.equals("0")){
                System.out.print(a + " ^ " + b + " = Не определено");
            }else{
                System.out.print(a + " ^ " + b + " = " + c);
            }
        } 
        Scan.close();
    }
    static void input(){//Функция ввода ответа, с файла или в консоли вводить
        for (int index = 0; index != 1;) {
            System.out.print("Введите Y если хотите считать с файла, N если хотете ввести вручную: "); 
            if (Scan.hasNextLine()) {
                answer = Scan.nextLine();
            }
            if (answer.equals("N")) {
                index = 1;
            }else if(answer.equals("Y")){
                index = 1;
            }else{
                System.out.println("Вы ввели неверный символ!"); 
            }
        }
    }

    static void get_a_b(){//Функция ввода c консоли
            System.out.print("Введите основание степени: "); 
            if (Scan.hasNextInt()) {
                a = Scan.nextInt();
                
            }
            System.out.print("Введите показатель степени: "); 
            if (Scan.hasNextInt()) {
                b = Scan.nextInt();
            } 
    }

    static long exponentiation(int base,int exponent){//Вычисление степни через цикл(думал сделать через рекурсию но решил что так практичнее)
        long c_map = base;
        if(exponent==0 & base==0){
            return 0;
        }else if(exponent==0){
            return 1;
        }else if(exponent>0){
            for (int index = 0; index < exponent-1; index++) {
                c_map = c_map * base;
            }
                return c_map;
        }else if(exponent<0){
            for (int index = 0; index < Math.abs(exponent)-1; index++) {
                c_map = c_map * base;
            }
                c_double = 1.0/(c_map);
                return -1;
        }
        return 0;
    }

    static void get_file_data(){//Получение данных из файла и присваивание значиений глобальным переменным
    try(FileReader reader = new FileReader("input.txt")){
        Scanner iScane = new Scanner(reader);
        inp=iScane.nextLine();
        String inp1 = "" + inp.charAt(0); 
        if(inp1.equals("b")){
            inp = inp.substring(2);
            b = Integer.parseInt(inp);
        }else{
            inp = inp.substring(2);
            a = Integer.parseInt(inp);
        }
        inp=iScane.nextLine();
        inp1 = "" + inp.charAt(0); 
        if(inp1.equals("a")){
            inp = inp.substring(2);
            a = Integer.parseInt(inp);
        }else{
            inp = inp.substring(2);
            b = Integer.parseInt(inp);
        }
        
        reader.close();
        iScane.close();
    }catch (IOException e) {//Костыль дял IOException видел вариант через такую же весть только для всего класса, но не знаю что практичнее
        e.printStackTrace();
    }
    }

    static void put_data(){//Фунция вывода в файл output
        try(FileWriter writer = new FileWriter("output.txt")){
            String c_String = String.valueOf(c); 
            if(c_String.equals("-1")){
                writer.write(a + " ^ " + b + " = " + c_double);
            }else if(c_String.equals("0")){
                writer.write(a + " ^ " + b + " = Не определено");
            }else{
                writer.write(a + " ^ " + b + " = " + c);
            }
            
        }catch (IOException e) {//Костыль дял IOException видел вариант через такую же весть только для всего класса, но не знаю что практичнее
            e.printStackTrace();
        }
    }

    
}



