package Ex000;

public class Progam {
    public void main(String[] args) {
        Foo foo1 = new Foo() {
            @Override
            public void m1() {

                System.out.println("m1");
            }

            @Override
            public void m2() {
                System.out.println("m2");
            }
        };

        Foo foo2 = new Foo() {
            @Override
            public void m1() {
                System.out.println("11m1");
            }

            @Override
            public void m2() {
                System.out.println("11m2");
            }
        };

        foo1.m1();
        foo2.m1();
    }
}
