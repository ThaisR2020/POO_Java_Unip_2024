// Classe Administrativo com turno e adicional noturno
class Administrativo extends Assistente {
    private String turno;
    private double adicionalNoturno;

    public Administrativo(String nome, double salario, int numeroMatricula, String turno, double adicionalNoturno) {
        super(nome, salario, numeroMatricula);
        this.turno = turno;
        this.adicionalNoturno = turno.equals("noite") ? adicionalNoturno : 0;
    }

    @Override
    public double ganhoAnual() {
        return super.ganhoAnual() + (this.adicionalNoturno * 12);
    }
}