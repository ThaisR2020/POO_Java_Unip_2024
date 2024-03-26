public class Estudante {
    public String matricula;
    public String nome;
    public double notaFinal;

    public boolean aprovado() {
        return notaFinal >= 6.0;
    }
}
