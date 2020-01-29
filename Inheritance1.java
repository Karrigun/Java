class A{
    int x;
    void square(){
        System.out.println(x*x);
    }
}

class B extends A{
    int y;
    void multiply(){
        System.out.println(x*y);
    }
}
public class Inheritance1{
    public static void main(String[] args) {
        A a1=new A();
        a1.x=4;
        a1.square();

        B b1=new B();
        b1.x=5;
        b1.y=3;
        b1.square();
        b1.multiply();
    }
}