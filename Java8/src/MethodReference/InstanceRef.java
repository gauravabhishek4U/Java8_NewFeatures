package MethodReference;

@FunctionalInterface
interface Face1{
    void test(String str);
}

@FunctionalInterface
interface Face2{
    int cross(int a, int b);
}

class Fun{

    public int calculate(int a, int b){
        System.out.println("Inside calculate method of Fun class!!" + a*b);
        return a*b;
    }

}


public class InstanceRef {
    public static void main(String[] args) {

        Face1 face1 = System.out::println;
        face1.test("test from interface Face 1");

        // implementing cross method of interface via Instance method reference using
        // class Fun and passing value via cross method

        Fun fun = new Fun();
        Face2 face = fun::calculate;
        face.cross(8,9);


    }
}
