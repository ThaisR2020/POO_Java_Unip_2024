public class Produto {
    public int codigo;
    public String descricao;
    public double preco;

    public void aplicarDesconto(double percentual) {
        preco -= preco * (percentual / 100);
    }
}
