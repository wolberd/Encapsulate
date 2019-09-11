package pack1;
import pack2.Foo;

// LilFoo is in a different package than Foo but extends it.
public class LilFoo extends Foo {
    int z;

    public static void main(String args[]) {
        LilFoo lilFoo = new LilFoo();
        // inheritance allows access to lilFoo and Foo data members
        lilFoo.z=55;
        lilFoo.f1=99;
        lilFoo.f2=88;
        lilFoo.f3=77;

    }
}
