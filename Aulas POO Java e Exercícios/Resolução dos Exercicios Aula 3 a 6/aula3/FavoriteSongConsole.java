public class FavoriteSongConsole {
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
        
        // Exibindo informações no console
        System.out.println("Título: " + titulo);
        System.out.println("Letra:");
        for (String linha : letra) {
            System.out.println(linha);
        }
        System.out.println("Autor: " + autor);
        System.out.println("Ano: " + ano);
    }
}


