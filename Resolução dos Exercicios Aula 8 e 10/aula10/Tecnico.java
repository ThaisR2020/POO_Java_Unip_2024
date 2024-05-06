// Classe Tecnico com bônus salarial
class Tecnico extends Assistente {
    private double bonus;

    public Tecnico(String nome, double salario, int numeroMatricula, double bonus) {
        super(nome, salario, numeroMatricula);
        this.bonus = bonus;
    }

    @Override
    public double ganhoAnual() {
        return (super.ganhoAnual() + this.bonus*12);
    }
}
