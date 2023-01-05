
public class Program001 {

    public static void main(String[] args) {
        Foo f1 = new Foo();
        f1.value = 111;
        // System.out.println(f1.value);
        f1.printCount();

        count = Foo.getCount();
        f1.printCount();

        Foo f2 = new Foo();
        // System.out.println(f2.value);
        f2.printCount();

        Foo f3 = new Foo();
        f3.value = 1234;
        // System.out.println(f3.value);
        f3.printCount();
    }
}
