package exerciciosAula24;

public class LivroDeLivraria {
    public static void main(String[] args) {
        Livro ceu = new Livro();
        ceu.nome = "ceu";
        ceu.autor = "luluzera";
        ceu.cor = "azul";
        ceu.editora = "alto astral";
        ceu.numeroPaginas = 100;

        System.out.println(ceu.autor);
        System.out.println(ceu.nome);
        System.out.println(ceu.cor);
        System.out.println(ceu.editora);
        System.out.println(ceu.numeroPaginas);
    }
}
