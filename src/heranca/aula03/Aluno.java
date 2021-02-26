package heranca.aula03;

public class Aluno extends Pessoa {
    private String curso;
    private double[] notas;

    String nomeVisibilidade;

    public void verificarAcesso(){
        super.setNome("Luan");
    }

    public Aluno(){
        super();
    }

    public Aluno(String nome, String endereco, String telefone) {
        super(nome, endereco, telefone);
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

    public void metodoQualquer(){
        super.setCpf("5428523842394");
    }
}
