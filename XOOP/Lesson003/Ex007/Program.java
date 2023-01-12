package Ex007;

// три вода
public class Program {
    public static void main(String[] args) {
        Coffee latte = new Coffee();
        latte.addComponent(new Water("вода"));
        latte.addComponent(new Water("вода"));
        latte.addComponent(new Water("вода"));
        latte.addComponent(new Water("вода1"));
        latte.addComponent(new Water("вода2"));
        for (var ingredient : latte) {
            System.out.println(ingredient);
        }

        Coffee esprexo = new Coffee();
        esprexo.addComponent(new Milk("Moloko"));
        esprexo.addComponent(new Water("вода"));
        for (var ingredient : esprexo) {
            System.out.println(ingredient);
        }
    }
}
