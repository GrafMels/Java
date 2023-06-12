package MethodPackage;

/**
 * Класс с методами
 */
public class OtherClass {
    /**
     *
     * @param firstComponent - 1 слагаемое
     * @param secondComponent - 2 слагаемое
     * @return - Суммa
     */
    public static int add(int firstComponent, int secondComponent){
        return firstComponent + secondComponent;
    }

    /**
     *
     * @param firstComponent - Делимое
     * @param secondComponent - Делитель
     * @return  - Частное
     */
    public static int division(int firstComponent, int secondComponent){

        return firstComponent / secondComponent;
    }

    /**
     *
     * @param firstComponent - 1 Множитель
     * @param secondComponent - 2 Множитель
     * @return - 1 Произведение
     */
    public static int multiplication(int firstComponent, int secondComponent){
        return firstComponent * secondComponent;
    }

    /**
     *
     * @param firstComponent - Уменьшаемое
     * @param secondComponent - Вычитаемое
     * @return - Разница
     */
    public static int subtraction(int firstComponent, int secondComponent){

        return firstComponent - secondComponent;
    }

}
