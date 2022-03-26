package Recursion;

public class Factorial {

    public static int recursiveFactorial(int num){
        if(num == 0){
            return 1;
        }
        return num * recursiveFactorial(num - 1);
    }

    public static void main(String[] args){
        int num = 5;

        int factorial = recursiveFactorial(num);
        System.out.println(factorial);
    }

}
