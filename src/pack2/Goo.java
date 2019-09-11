package pack2;

import pack2.Foo;
// Goo is in same package as Foo
public class Goo {

    public static void main(String args[]) {
        Foo foo = new Foo();
        foo.f1=45;
        foo.f2=55;
        foo.f3=77;
        System.out.println(foo.f);
    }
}
