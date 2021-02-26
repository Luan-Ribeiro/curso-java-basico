package exerciciosAula24;

public class MostrarContato {
    public static void main(String[] args){
        Contato luan = new Contato();
        luan.nome = "Luan";
        luan.apelido = "lulu";
        luan.numero = "1498820390";
        luan.whatsapp = true;

        System.out.println(luan.nome);
        System.out.println(luan.apelido);
        System.out.println(luan.numero);
        System.out.println(luan.whatsapp);

        luan.exibirContato();
    }
}
