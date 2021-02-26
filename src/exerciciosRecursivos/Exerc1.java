package exerciciosRecursivos;

public class Exerc1 {
    public static int fibonacci(int num){
        if (num < 2){
            return 1;
        }
        return fibonacci(num - 2) + fibonacci(num - 1);
    }
}
