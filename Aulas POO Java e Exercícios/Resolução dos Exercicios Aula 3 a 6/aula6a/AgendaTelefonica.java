import java.util.ArrayList;

public class AgendaTelefonica {
    public ArrayList<String> contatos = new ArrayList<>();

    public void adicionarContato(String contato) {
        contatos.add(contato);
    }

    public void removerContato(String contato) {
        contatos.remove(contato);
    }

    public void listarContatos() {
        for (String contato : contatos) {
            System.out.println(contato);
        }
    }
}

