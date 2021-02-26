package heranca.aula08;

public abstract class Animal {

    private String nome;

    public abstract  void emitirSom();

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }
}
