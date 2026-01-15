package DefaultMethods;

interface I1{
    default void show(){
        System.out.println("Show in interface I1 !!");
    }
}

interface I2{
    default void show(){
        System.out.println("Show in interface I2 !!");
    }
}

class Hello implements I1, I2 {

    @Override
    public void show() {
        System.out.println("Show in class Hello !!");
    }

    void showAll(){
        System.out.println("ShowAll in class Hello !!");
        show();

        // this is how show method from I1 can be called using super
        I1.super.show();
        // this is how show method from I2 can be called using super
        I2.super.show();
    }
}

public class Main2 {
    public static void main(String[] args) {
        Hello hello = new Hello();
        hello.showAll();
    }
}
