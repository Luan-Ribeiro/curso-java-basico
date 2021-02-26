package exerciciosAula24;

public class TesteLampada {
    public static void main(String[] args){
        Lampada led = new Lampada();
            led.marca = "Toshiba";
            led.fabricante = "Haska";
            led.potencia = 20;
            led.consumoHora = 1;
        System.out.println(led.marca);
        System.out.println(led.fabricante);
        System.out.println(led.potencia);
        System.out.println(led.consumoHora);
    }
}
