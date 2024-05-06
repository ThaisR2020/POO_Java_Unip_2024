// Classe base Funcionario
//@Override em Java é uma anotação que indica que o método que a segue é uma implementação
// de um método declarado em uma interface ou uma redefinição de um método de uma superclasse.

// Funcionario implements IFuncionario {
class Funcionario {	
    protected String nome;
    protected double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    //@Override
    public void addAumento(double valor) {
        this.salario += valor;
    }

    //@Override
    public double ganhoAnual() {
        return this.salario * 12;
    }

    //@Override
    public void exibeDados() {
        System.out.println("Nome: " + nome + ", Salário: " + salario);
    }
}