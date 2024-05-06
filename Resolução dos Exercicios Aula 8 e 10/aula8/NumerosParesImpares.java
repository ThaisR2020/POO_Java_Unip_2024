import javax.swing.JOptionPane;

public class NumerosParesImpares {

    public void contarImpares() {
        int quantidadeImpares = 0;
		
		System.out.println("A) Vamos contar quantos numeros impares existem entre 0 e 100");
        for (int i = 0; i <= 100; i++) {
            if (i % 2 != 0) {
                quantidadeImpares++;
            }
        }
        System.out.println("Quantidade de números ímpares de 0 a 100: " + quantidadeImpares);
    }

    public void contarParesUsuario() {
        int quantidadePares = 0;
        int numero;
		
		System.out.println("B) Vamos contar quantos numeros pares voce vai informar");

        do {
            String input = JOptionPane.showInputDialog("Digite um número (ou -1 para finalizar):");
            numero = Integer.parseInt(input);
            if (numero != -1 && numero % 2 == 0) {
                quantidadePares++;
            }
        } while (numero != -1);

        JOptionPane.showMessageDialog(null, "Quantidade de números pares digitados: " + quantidadePares);
    }

    public static void main(String[] args) {
        NumerosParesImpares np = new NumerosParesImpares();
		
		System.out.println("Exercicio 1: ");
        
        np.contarImpares(); // Chama o método para contar ímpares.
        
		System.out.println(".............................................");
		
        np.contarParesUsuario(); // Chama o método para contar os pares digitados pelo usuário.
    }
}
