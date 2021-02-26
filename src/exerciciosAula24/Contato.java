package exerciciosAula24;

public class Contato {
    String nome;
    String numero;
    String apelido;
    boolean whatsapp;

    void exibirContato(){
        System.out.println("O contato é: " +nome +" "+apelido+" "+ numero+" "+whatsapp);
    }
}
