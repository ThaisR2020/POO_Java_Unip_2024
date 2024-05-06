// Exemplo de uso
class Teste {
    public static void main(String[] args) {
        Funcionario f = new Funcionario("João", 3000);
        Assistente a = new Assistente("Maria", 2000, 1234);
        Tecnico t = new Tecnico("Carlos", 2500, 5678, 300);
        Administrativo ad = new Administrativo("Ana", 2200, 4321, "noite", 200);

        f.exibeDados();
        a.exibeDados();
        t.exibeDados();
        ad.exibeDados();
    }
}

