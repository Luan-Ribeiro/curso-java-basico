package heranca.exercicio01;

public class ContaEspecial extends  ContaBancaria{

    private double limite;

    @Override
    public String toString() {
        return "ContaEspecial{" +
                "limite=" + limite +
                super.toString()+
                '}';
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public boolean sacar(double valor){
            double saldoComLimite = this.getSaldo() + limite;
            if((saldoComLimite - valor) >=0){
                this.setSaldo(this.getSaldo() - valor);
                System.out.println("Saque concluido com sucesso!");
                System.out.println("Saldo Atual = " + this.getSaldo());
                return true;
        }
        System.out.println("Saldo insuficiente para saquel de "+ valor + " reais");
        System.out.println("Saldo = " + this.getSaldo());
        return  false;
    }
}
