package academy.devdojo.maratonajava.introducaoclasses.classesExercicios.Encapsulamento.Produto.dominio;

public class Produto {
	private String nome;
	private double preco;
	private int quantidadeEstoque;
	
	public void vender(int quantidade) {
		if (quantidade > this.quantidadeEstoque) {
			System.err.println("Não temos essa quantidade no estoque!");
			System.out.println("Quantidade pedida: " + quantidade);
			System.out.println("Quantidade vendida: " + this.quantidadeEstoque);
			System.out.println("Quantidade faltante: " + (quantidade - this.quantidadeEstoque));
			
			this.quantidadeEstoque = 0;
			
			return;
		}
		
		this.quantidadeEstoque -= quantidade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		if (preco <= 0) {
			return;
		}
		
		this.preco = preco;
	}

	public int getQuantidadeEstoque() {
		return quantidadeEstoque;
	}

	public void setQuantidadeEstoque(int quantidadeEstoque) {
		if (quantidadeEstoque < 0) {
			return;
		}
		
		this.quantidadeEstoque = quantidadeEstoque;
	}

}
