package aulas.loiane;

public class TesteContato {

    public static void main(String[] agrs){

        Contato contato = new Contato();
        contato.setNome("Luan");
        //contato.setEndereco("Rua das cebolas");
        //contato.setTelefone("15988034056");

        //criar objeto endereco
        ContatoEndereco end = new ContatoEndereco();
        end.setNomeRua("Rua teste");
        end.setNumero("1-24");
        end.setComplemento("-");
        end.setCidade("Cacilds");
        end.setEstado("Maschuts");
        end.setCep("17569466");

        contato.setEndereco(end);

        //relaciomento tem um telefone
        ContatoTelefone telefone = new ContatoTelefone();
        telefone.setTipo("celular");
        telefone.setDdd("14");
        telefone.setNumero("6966963311");

        ContatoTelefone telefone2 = new ContatoTelefone();
        telefone2.setTipo("celular");
        telefone2.setDdd("14");
        telefone2.setNumero("6966963311456");

        ContatoTelefone[] telefones = new ContatoTelefone[2];
        telefones[0] = telefone;
        telefones[1] = telefone2;

        contato.setTelefones(telefones);

        //teste saida no console
        System.out.println(contato.getNome());

        if(contato != null && contato.getEndereco() != null){
            System.out.println(contato.getEndereco().getCidade());
        }

        if(contato != null && contato.getTelefones() != null){
            for(ContatoTelefone t : contato.getTelefones()) {
                System.out.println(t.getDdd() + "" + t.getNumero());
            }
        }
    }
}
