package exerciciosAula24;

public class MostrarSaldo {
    public static void main(String[] args) {
        Conta corrente = new Conta();
        corrente.saldo = 2200;
        corrente.limite = 3000;
        corrente.agencia = "3201";
        corrente.nome = "Lulu";
        corrente.numero = "00190302";
        corrente.status = true;

        System.out.println(corrente.agencia);
        System.out.println(corrente.numero);
        System.out.println(corrente.saldo);
        System.out.println(corrente.status);
        System.out.println(corrente.nome);
        System.out.println(corrente.limite);
    }
}
