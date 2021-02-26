package heranca.aula05;

public class Teste5 {

    public static void main(String[] args){

        /*Pessoa pessoa = new Pessoa();*/
        Pessoa aluno = new Aluno();
        Pessoa professor = new Professor();

        /*pessoa.setEndereco("Rua 0, num 0");*/
        aluno.setEndereco("Rua 1, num 1");
        professor.setEndereco("Rua 2, num 2");

        /*System.out.println(pessoa.obterEtiquetaEndereco());
        System.out.println(aluno.obterEtiquetaEndereco());
        System.out.println(professor.obterEtiquetaEndereco());*/

        aluno.imprimirEtiquetaEndereco();
        professor.imprimirEtiquetaEndereco();
    }
}
