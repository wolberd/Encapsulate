package pack1;
import pack2.Foo;

// Zoo is in different package than Foo and doesn't extend
public class Zoo {
    public static void main(String args[]) {

        Foo foo = new Foo();
        foo.f1 = 34;
        foo.f2 = 55;
        foo.f3 = 99;
    }
}
