package StaticMethods;

public class Code {
    void hello(){
        System.out.println("Hello from class Code!!");
    }

    // main() can be created inside interface as it is a static method
    public interface I1{
        public static void main(String[] args) {
            Code code = new Code();
            code.hello();
        }
    }
}
