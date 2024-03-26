public class Main {

	public static void main(String[] args){
	
        Endereco endereco = new Endereco("Rua das Flores", "São Paulo", "SP", "01234-567");
        Pessoa pessoa = new Pessoa("Maria Silva", 30, endereco);
        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Idade: " + pessoa.getIdade());
        System.out.println("Endereço: " + pessoa.getEndereco().getRua() + ", " + pessoa.getEndereco().getCidade() + " - " + pessoa.getEndereco().getEstado() + " " + pessoa.getEndereco().getCep());
        
		
	}
	

}

