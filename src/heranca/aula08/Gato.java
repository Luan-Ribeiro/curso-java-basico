package heranca.aula08;

public class Gato extends Mamifero implements AnimalEstimacao{
    private String raça;

    public String getRaça() {
        return raça;
    }

    public void setRaça(String raça) {
        this.raça = raça;
    }

    @Override
    public void emitirSom() {

    }

    @Override
    public void amamentar() {

    }

    @Override
    public void brincar() {

    }

    @Override
    public void levarPassear() {

    }

    @Override
    public void levarVeterinario() {

    }

    @Override
    public void alimentar() {

    }
}
