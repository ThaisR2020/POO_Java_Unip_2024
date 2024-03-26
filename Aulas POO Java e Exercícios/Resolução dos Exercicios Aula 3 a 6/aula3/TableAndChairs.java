public class TableAndChairs {
    public static void main(String[] args) {
        // Imprimindo a cadeira com 'X'
        imprimirCadeira();
    }
    
    public static void imprimirCadeira() {
        // Strings que representam a cadeira
        String[] cadeira = {
            "  X                     X",
            "  X                     X",
			"  X     XXXXXXXXXX      X",
            "  XXXXX X        X  XXXXX",
            "  X   X X        X  X   X",
			"  X   X X        X  X   X"
        };
        
        // Imprimindo a cadeira linha por linha
        for (String linha : cadeira) {
            System.out.println(linha);
        }
    }
}