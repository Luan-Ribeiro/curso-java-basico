package heranca.aula07;

import java.util.Arrays;
import java.util.Objects;

public class Aluno {
    private String curso;
    private double[] notas;

    String nomeVisibilidade;

   /* public void verificarAcesso(){
        super.setNome("Luan");
    }*/

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aluno aluno = (Aluno) o;
        return Objects.equals(curso, aluno.curso) && Arrays.equals(notas, aluno.notas);
    }

    public Aluno(){
        super();
    }

    public Aluno(String nome, String endereco, String telefone) {
        //super(nome, endereco, telefone);
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    private double calcularMedia(){
        return 0;
    }

    public boolean verificarAprovado(){
        return true;
    }

    /*public String toString(){
        String s1 = getCurso() + "\n";
        for(double nota : getNotas()) {
            s1 += nota + " ";
        }
        return s1;
    }*/

    @Override
    public String toString() {
        return "Aluno{" +
                "curso='" + curso + '\'' +
                ", notas=" + Arrays.toString(notas) +
                '}';
    }
}
