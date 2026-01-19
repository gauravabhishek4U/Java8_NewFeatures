package MethodReference;

import java.util.SortedMap;

@FunctionalInterface
interface Hello{
    int test(int a, int b);
}

class MyInteger{
    public static int findSum(int a, int b){
        System.out.println("findSum method in MyInteger class!!");
        return a+b;
    }
}
public class StaticRef {
    public static void main(String[] args) {
        // implemetation using lamda expression
        Hello h1 = (a,b) -> {
            System.out.println("Implementation using Lambda Exp!!!");
            return a+b;
        };

        int out = h1.test(20,30);
        System.out.println("result via lamda exp = "+out);


        // implemetation using static method reference
        Hello h2 = MyInteger::findSum;

        int out2 = h2.test(10, 20);
        System.out.println("result via method ref = "+out2);

    }
}
