package aulas.loiane;

public class Calculadora {
    private int numero1;
    private int numero2;
    private static float resultado;

    public static float somar(int numero1, int numero2){
        resultado = numero1 + numero2;
        return resultado;
    }

    public static float subtrair(int numero1, int numero2){
        resultado = numero1 - numero2;
        return resultado;
    }

    public static float multiplicar(int numero1, int numero2){
        resultado = numero1 * numero2;
        return resultado;
    }

    public static float dividir(int numero1, int numero2){
        resultado = numero1 / numero2;
        return resultado;
    }
}
