package MethodPackage;

/**
 * Накладывает на результат декорации.
 */
public class Decorator {
    /**
     * Метод декорирования числа для вывода в консоль
     * @param answer - Число в интовом представлении требующее декорации
     * @return - Ответ в строковом представлении
     */
    public static String decorate(int answer){
        return String.format("Here is your answer: %d", answer);
    }
}
