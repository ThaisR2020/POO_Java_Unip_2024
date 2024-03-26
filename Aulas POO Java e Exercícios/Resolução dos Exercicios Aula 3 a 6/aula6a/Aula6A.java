public class Aula6A {

    public static void main(String[] args) {
        // Exercício 1: Conta Bancária
        ContaBancaria conta = new ContaBancaria();
        conta.numeroConta = 123456;
        conta.saldo = 1000.0;
        conta.depositar(500);
        conta.sacar(200);
        System.out.println("Saldo atual: " + conta.saldo);

        // Exercício 2: Produto
        Produto produto = new Produto();
        produto.codigo = 1;
        produto.descricao = "Cafeteira";
        produto.preco = 100.0;
        produto.aplicarDesconto(10); // Aplicando desconto de 10%
        System.out.println("Preço com desconto: " + produto.preco);

        // Exercício 3: Estudante
        Estudante estudante = new Estudante();
        estudante.matricula = "2021001";
        estudante.nome = "João";
        estudante.notaFinal = 7.5;
        System.out.println("Estudante aprovado: " + estudante.aprovado());

        // Exercício 4: Calculadora Simples
        System.out.println("Soma: " + CalculadoraSimples.somar(10, 5));
        System.out.println("Subtração: " + CalculadoraSimples.subtrair(10, 5));
        System.out.println("Multiplicação: " + CalculadoraSimples.multiplicar(10, 5));
        System.out.println("Divisão: " + CalculadoraSimples.dividir(10, 2));

        // Exercício 5: Agenda Telefônica
        AgendaTelefonica agenda = new AgendaTelefonica();
        agenda.adicionarContato("Maria");
        agenda.adicionarContato("João");
        agenda.removerContato("João");
        System.out.println("Contatos na agenda:");
        agenda.listarContatos();
    }
}
