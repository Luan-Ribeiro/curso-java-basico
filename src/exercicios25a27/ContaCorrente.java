package exercicios25a27;

public class ContaCorrente {
        String numero;
        double saldo;
        boolean clienteEspecial;
        double limite;
        boolean saque;

        boolean habilitarSaque(){
            double chequeEspecial = saldo+limite;
            if(saldo>0) {
                System.out.println("Saldo disponivel: "+saldo);
                saque = true;
            }else if(chequeEspecial>0){
                System.out.println("Saldo disponivel: "+saldo);
                System.out.println("Saldo disponivel com limite: "+chequeEspecial);
                saque = true;
                }else{
                    System.out.println("Saque indisponivel,saldo insuficiente ");
                    saque = false;
                }
            return saque;
        }

        double depositarDinheiro(double valor){
            System.out.println("Valor depositado = "+valor);
            double saldoAtual = valor+saldo+limite;
            return saldoAtual;
        }
}
