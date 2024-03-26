import javax.swing.JOptionPane;

public class FavoriteSongWindow {
    public static void main(String[] args) {
        // Informações da música favorita
        String titulo = "Bohemian Rhapsody";
        String[] letra = {
            "Is this the real life?",
            "Is this just fantasy?",
            "Caught in a landslide,",
            "No escape from reality",
            "Open your eyes,",
            "Look up to the skies and see"
        };
        String autor = "Queen";
        int ano = 1975;
        
        // Construindo a mensagem a ser exibida na janela
        StringBuilder mensagem = new StringBuilder();
        mensagem.append("Título: ").append(titulo).append("\n");
        mensagem.append("Letra:\n");
        for (String linha : letra) {
            mensagem.append(linha).append("\n");
        }
        mensagem.append("Autor: ").append(autor).append("\n");
        mensagem.append("Ano: ").append(ano);
        
        // Exibindo as informações na janela
        JOptionPane.showMessageDialog(null, mensagem.toString());
    }
}
