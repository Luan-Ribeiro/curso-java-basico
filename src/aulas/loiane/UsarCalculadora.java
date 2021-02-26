package aulas.loiane;

public class UsarCalculadora {
    public static void main(String[] args){

        /*MinhaCalculadora calculadora = new MinhaCalculadora();*/
        float soma = Calculadora.somar(1,2);
        System.out.println(soma);
        float subtracao = Calculadora.subtrair(1,3);
        System.out.println(subtracao);
        float multiplicacao = Calculadora.multiplicar(1,3);
        System.out.println(multiplicacao);
        float dividisao = Calculadora.dividir(6,3);
        System.out.println(dividisao);
    }
}
