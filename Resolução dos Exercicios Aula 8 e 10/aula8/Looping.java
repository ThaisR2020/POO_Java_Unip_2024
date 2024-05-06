public class Looping {

    public void exibeNumerosSequencial(int inicio, int fim) {
		
		System.out.println("Vamos exibir o numero sequencial entre:" + inicio + " " + fim);
		
        for (int i = inicio; i <= fim; i++) {
            System.out.print(i + " ");
        }
        System.out.println(); // Para mover para a próxima linha após terminar a sequência.
    }
    
}


