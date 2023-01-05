/**
 * Example006
 */
public class Example006 {

    public static void main(String[] args) {

        Example006 prog = new Example006();// Вызов нестатического метода в статическом может осуществляться только
                                           // через экземляр(prog) класса(Example006).
        prog.A();
    }

    void A() {
        System.out.println("AAA");
    }
}