package heranca.aula07;

public class Teste7 {

    public static void main(String[] args){
        Aluno aluno = new Aluno();

        aluno.setCurso("Ciência da Computação");
        double[] notas = {10,8,9,7};
        aluno.setNotas(notas);

        System.out.println(aluno);

        String s1 = "teste";
        String s2 = "teste";

        System.out.println(s1.equalsIgnoreCase(s2));

        Aluno aluno2 = new Aluno();
        aluno2.setCurso("Ciência da Computação");
        double[] notas2 = {10,8,9,7};
        aluno2.setNotas(notas2);

        System.out.println(aluno.equals(aluno2));
    }
}
