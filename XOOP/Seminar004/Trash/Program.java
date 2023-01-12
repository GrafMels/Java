package Trash;

/**
 * Program
 */
public class Program {
    public static void main(String[] args) {
        In foo = new In();
        foo.doIt();

    }
}

class In implements Out {
    @Override
    public void doIt() {
        Out.super.doIt();
    }
}

interface Out {
    default void doIt() {
        System.out.println("+++");
    }
}