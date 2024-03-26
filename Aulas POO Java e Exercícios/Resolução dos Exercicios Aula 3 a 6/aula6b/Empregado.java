public class Empregado {
    private String nome;
    private String cargo;
    private double salario;

    // Construtor
    public Empregado(String nome, String cargo, double salario) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
    }

    // Getter para o salário
    public double getSalario() {
        return salario;
    }

    // Setter para o salário
    public void setSalario(double salario) {
        this.salario = salario;
    }

    // Getters e Setters para nome e cargo para completude
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
	
    public static void main(String[] args){
	
        Empregado empregado = new Empregado("João", "Desenvolvedor", 5000.00);
        System.out.println("Salário inicial de " + empregado.getNome() + ": " + empregado.getSalario());
        empregado.setSalario(5500.00);
        System.out.println("Novo salário de " + empregado.getNome() + ": " + empregado.getSalario());        
      
    }	
}
