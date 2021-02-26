package exercicios25a27;

public class ConsultaConta {
    public static void main(String[] args){
        ContaCorrente luan = new ContaCorrente();
        luan.saque = false;
        luan.saldo = 0;
        luan.limite = 200;
        luan.numero = "21315";
        luan.clienteEspecial = true;

        luan.habilitarSaque();
        System.out.println("Saldo Atual = "+ luan.depositarDinheiro(300));
    }
}
