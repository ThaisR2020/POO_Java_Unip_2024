public class Aula5 {
    
    public static void main(String[] args) {
        // ex.1 - Teste do método formatarNome
        formatarNome("João da Silva");

        // ex.2 - Teste do método calculaQtdeCaracteres
        calculaQtdeCaracteres("Olá, mundo!");

        // ex.3 - Teste do método calculaMedia
        double media = calculaMedia(7.5, 8.0, 9.2);
        System.out.println("A média é: " + media);

        // ex.4 - Teste do método exibeInformacoes
        exibeInformacoes("João Silva", 28, "São Paulo");

        // ex.5 - Teste do método imprimeCabecalho
        imprimeCabecalho();

        // ex.6 - Teste do método ehPositivo
        boolean resultado = ehPositivo(-10);
        System.out.println("O número é positivo? " + resultado);
        
        // ex.71 - Teste dos métodos sobrecarregados calculaArea
        System.out.println("Área do quadrado: " + calculaArea(5));
        System.out.println("Área do retângulo: " + calculaArea(4, 6));
        System.out.println("Área do círculo: " + calculaArea(3.0));        
    }

    public static void formatarNome(String nomeCompleto) {
        System.out.println(nomeCompleto.toUpperCase());
    }

    public static void calculaQtdeCaracteres(String frase) {
        System.out.println("A frase tem " + frase.length() + " caracteres.");
    }

    public static double calculaMedia(double nota1, double nota2, double nota3) {
        return (nota1 + nota2 + nota3) / 3;
    }

    public static void exibeInformacoes(String nome, int idade, String cidade) {
        System.out.println("Nome: " + nome + ", Idade: " + idade + ", Cidade: " + cidade);
    }

    public static void imprimeCabecalho() {
        System.out.println("========== RELATÓRIO DE VENDAS ==========");
        System.out.println("Este é um cabeçalho padrão para os relatórios.");
    }

    public static boolean ehPositivo(int numero) {
        return numero > 0;
    }
    
    //ex7
    public static int calculaArea(int lado) {
        return lado * lado;
    }    
    public static int calculaArea(int base, int altura) {
        return base * altura;
    }    
    public static double calculaArea(double raio) {
        return Math.PI * raio * raio;
    }    
}
