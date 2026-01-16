package LambdaExp;

@FunctionalInterface
interface I1{

    // A functional interface can have only one abstract method.
    // But it can have multiple other methods

    // abstract method
    void m1();

    // default method
    default void m2(){
        System.out.println("default method m2 in I1");
    }

    // static method
    static void m3(){
        System.out.println("static method m3 in I1");
    }
}

// An empty interface is called as Marker interface or Tagging Interface
interface ABC{

}

public class Lambda {
    public static void main(String[] args) {
        I1 i1 = ()->{
            System.out.println("m1 method called via lambda i1!!");
        };

        I1 i2 = ()->{
            System.out.println("m1 method called via lambda i2!!");
        };

        i1.m1();
        i2.m1();

        //calling static method in interface
        I1.m3();
    }
}
