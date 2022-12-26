package Homework;
import java.util.Scanner;
public class Project001 {
    public static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        int n = input();
        int triangularNumber = logic(n);
        output(triangularNumber);
    }
    
    //Метод ввода
    public static int input(){
        System.out.print("Введите число n, а я выдам вычислю его треугольное чилсо: ");
        if(scan.hasNextInt()){
            int number = scan.nextInt();
            return number+1;
        }
        return 0;  
    }
    
    //Метод Логики
    public static int logic(int n){
        int number = 0;
        for (int i = 0; i < n; i++) {
            number += i;
        }
        return number;
    }

    //Метод вывода
    public static void output(int outputInp){
        System.out.println(outputInp);
    }

}
