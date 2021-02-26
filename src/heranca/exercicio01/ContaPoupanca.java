package heranca.exercicio01;

import java.util.Calendar;

public class ContaPoupanca extends ContaBancaria{

    private  int diaRendimento;

    public int getDiaRendimento(){
        return diaRendimento;
    }

    public void setDiaRendimento(int diaRendimento){
        this.diaRendimento = diaRendimento;
    }

    @Override
    public String toString() {
        return "ContaPoupanca{" +
                "diaRendimento='" + diaRendimento + '\'' +
                super.toString()+
                ", saldo= " + this.getSaldo() +
                '}';
    }

    public boolean calcularSaldoRendimento(double taxaRendimento){

        Calendar hoje = Calendar.getInstance();

        if(diaRendimento == hoje.get(Calendar.DAY_OF_MONTH)){
            this.setSaldo(this.getSaldo() + (this.getSaldo() * taxaRendimento));
            return true;
        }
        return false;
    }
}