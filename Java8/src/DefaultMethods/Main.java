package DefaultMethods;

interface Animal{
    void eating();
    void sleeping();

    // an interface can have more than 1 default methods
    // default method CANNOT be abstract. The implementation must be given.
    // default method CANNOT be static.
    // we CANNOT use default keyword to ovveride methods from java.lang.Object class
    // CANNOT make default method as "protected"
    // if an interface extends another interface then it can override default methods of the parent interface
    // regular java methods cannot be marked as default. default can only be used in interface


    default void running(){
        System.out.println("Animal is running!!");
    }

    default void thinking(){
        System.out.println("Animal is thinking!!");
    }
}

class Dog implements Animal{

    @Override
    public void eating() {
        System.out.println("Dog is eating!!");
    }

    @Override
    public void sleeping() {
        System.out.println("Dog is sleeping!!");
    }

    // while overriding a default method, it must be public
    @Override
    public void running() {
        System.out.println("Dog is running!!");
    }
}

class cat implements Animal{

    @Override
    public void eating() {
        System.out.println("Cat is eating!!");
    }

    @Override
    public void sleeping() {
        System.out.println("Cat is sleeping!!");
    }

    @Override
    public void thinking() {
        System.out.println("Cat is thinking!!");
    }
}


public class Main {
    public static void main(String[] args) {
        Animal ani = new Dog();
        ani.eating();
        ani.running();
        // if default method is not implemented in the subclass then it will take
        // call the method from the interface (Animal.super.thinking())
        ani.thinking();

        Animal animal = null;
        animal = new cat();
        animal.eating();
        animal.thinking();
        animal.sleeping();
        animal.running();
    }
}
