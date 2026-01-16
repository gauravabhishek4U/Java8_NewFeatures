package StaticMethods;
interface I1{

    // static method are public by default
    // static method cannot be protected but it can be private.
    // However, private static method cannot be called outside interface
    //static method cannot be abstract
    static void foo(){
        System.out.println("foo method in I1");
    }
}

interface I2{
    static void fun(){
        System.out.println("Fun method in I2");
    }
}

class Test implements I1, I2{

    void test(){
        System.out.println("test method in class Test");
        I1.foo();
        I2.fun();
    }
}


public class Run {
    public static void main(String[] args) {
        Test test = new Test();

        test.test();
    }
}
