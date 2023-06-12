package MainPackage;

import MethodPackage.Decorator;
import MethodPackage.OtherClass;

/**
 * Входной класс
 */
public class Main {
    /**
     * Входная функция
     * @param args - хз
     */
    public static void main(String[] args) {
        int firstComponent = 20;
        int secondComponent = 4;
        String answer;
        answer = Decorator.decorate(OtherClass.add(firstComponent, secondComponent));
        System.out.println(answer);
        answer = Decorator.decorate(OtherClass.division(firstComponent, secondComponent));
        System.out.println(answer);
        answer = Decorator.decorate(OtherClass.multiplication(firstComponent, secondComponent));
        System.out.println(answer);
        answer = Decorator.decorate(OtherClass.subtraction(firstComponent, secondComponent));
        System.out.println(answer);
    }
}