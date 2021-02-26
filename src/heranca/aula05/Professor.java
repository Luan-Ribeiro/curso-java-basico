package heranca.aula05;

public class Professor extends Pessoa {
    private String departamento;
    private double salario;
    private String nomeCurso;

    public Professor(String nome, String endereco, String telefone, String departamento, double salario, String nomeCurso) {
        super(nome, endereco, telefone);
    }

    public Professor() {}

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public double calcularSalarioLiquido(){
        return 0;
    }

    public String obterEtiquetaEndereco(){
        String s = "Endereço do Professor: ";
        s += this.getEndereco();

        return  s;
    }

    @Override
    public void imprimirEtiquetaEndereco() {
        System.out.println("Imprimindo endereço do Professor:");
        System.out.println(this.obterEtiquetaEndereco());
    }
}
