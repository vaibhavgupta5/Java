class A1{
    void m1(){
        System.out.println("Method m1 in class A1");
    }
}


class B2 extends A1{
    // @Override
    void m1(){
        System.out.println("Method m1 in class B2");
    }
}

public class DPoly {
        public static void main(String[] args) {
        System.out.println("Dynamic Polymorphism in Java");

        A1 obj1 = new B2();

        obj1.m1();
    }
}
