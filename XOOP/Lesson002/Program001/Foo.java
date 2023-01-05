class Doo extends Foo {
    public void M() {
        Foo.count = 123;
    }

}

public class Foo {
    public Integer value;
    protected static Integer count;
    // public static Integer count = 0;//Так не надо
    static {
        count = 0;// Надо вот так
    }

    public static int getCount() {
        return count;
    }

    public Foo() {
        count++;
    }

    public void printCount() {
        System.out.println(count);
    }

    @Override
    public String toString() {
        return value.toString();
    }
}
