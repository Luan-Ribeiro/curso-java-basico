package exercicios.aula;

public class TesteLampada {
    public static void main(String[] args){
        Lampada led = new Lampada("led","10W",10,false);
        led.setModelo("led");
        led.setPotencia("10W");
        led.setConsumo(10);
        led.setStatus(false);
        led.desligarLampada();
        System.out.println(led.getPotencia());
    }
}
