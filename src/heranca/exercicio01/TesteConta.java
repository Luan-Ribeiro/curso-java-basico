package heranca.exercicio01;

public class TesteConta {

    public static void main(String[] args) {
        System.out.println("*** Teste ContaBancaria ***");

        ContaBancaria contaSimples = new ContaBancaria();
        contaSimples.setNomeCliente("Luan conta simples");
        contaSimples.setNumConta("432256621");

        contaSimples.depositar(100);

        contaSimples.sacar(50);

        contaSimples.sacar(20);

        System.out.println(contaSimples);

        System.out.println("*** Teste ContaPoupanca ***");

        ContaPoupanca contaPoupanca = new ContaPoupanca();
        contaPoupanca.setNomeCliente("Luan conta simples");
        contaPoupanca.setNumConta("432256621");
        contaPoupanca.setDiaRendimento(25);

        contaPoupanca.depositar(100);

        if(contaPoupanca.calcularSaldoRendimento(0.5)){
            System.out.println("Rendimento aplicado, novo saldo =" + contaPoupanca.getSaldo());
        }

        contaPoupanca.sacar(50);

        contaPoupanca.sacar(20);

        System.out.println(contaPoupanca);

        System.out.println("*** Teste ContaEspecial ***");

        ContaEspecial contaEspecial = new ContaEspecial();
        contaEspecial.setNomeCliente("Luan conta simples");
        contaEspecial.setNumConta("432256621");
        contaEspecial.setLimite(100);

        contaEspecial.depositar(100);

        /*if(contaEspecial.calcularSaldoRendimento(0.5)){
            System.out.println("Rendimento aplicado, novo saldo =" + contaPoupanca.getSaldo());
        }*/

        contaEspecial.sacar(50);

        contaEspecial.sacar(100);

        System.out.println(contaEspecial);

    }
}
