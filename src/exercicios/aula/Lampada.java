package exercicios.aula;

public class Lampada {
    private String modelo;
    private String potencia;
    private double consumo;
    private boolean status;

    public Lampada(String modelo, String potencia, double consumo, boolean status) {
        this.modelo = modelo;
        this.potencia = potencia;
        this.consumo = consumo;
        this.status = status;
    }

    Lampada(){}

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPotencia() {
        return potencia;
    }

    public void setPotencia(String potencia) {
        this.potencia = potencia;
    }

    public double getConsumo() {
        return consumo;
    }

    public void setConsumo(double consumo) {
        this.consumo = consumo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public boolean ligarLampada(){
        status = true;
        System.out.println("Lampada ligada");
        return status;
    }

    public boolean desligarLampada(){
        status = false;
        System.out.println("Lampada desligada");
        return status;
    }
}
