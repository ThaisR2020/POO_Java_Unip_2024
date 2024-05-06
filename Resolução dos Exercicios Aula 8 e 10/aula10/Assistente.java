// Classe Assistente que também é um funcionário
class Assistente extends Funcionario {
    private int numeroMatricula;

    public Assistente(String nome, double salario, int numeroMatricula) {
        super(nome, salario);
        this.numeroMatricula = numeroMatricula;
    }

    public int getNumeroMatricula() {
        return numeroMatricula;
    }

    public void setNumeroMatricula(int numeroMatricula) {
        this.numeroMatricula = numeroMatricula;
    }

    @Override
    public void exibeDados() {
        super.exibeDados();
        System.out.println("Número de Matrícula: " + numeroMatricula);
    }
}