package heranca.aula06;

public class Teste6 {

    public static void main(String[] args){

        Pessoa pessoa = new Pessoa();
        //Pessoa aluno = new Aluno();
        //Pessoa professor = new Professor();
        Aluno aluno = new Aluno();
        Professor professor = new Professor();

        /*aluno.imprimirEtiquetaEndereco();
        professor.imprimirEtiquetaEndereco();*/

        System.out.println(Constantes.URL_BLOG);
        Constantes.URL_BLOG = "teste";
        System.out.println(Constantes.URL_BLOG);
    }
}
