package academy.devdojo.maratonajava.introducaoclasses.classesExercicios.BlocosInicializacao.Produto.dominio;

public class Produto {
	public double preco;
	public double desconto;

	public Produto(double preco) {
		this.preco = preco;
		
		if (this.preco > 100) {
			this.desconto = 0.1;
		} else {
			this.desconto = 0.05;
		}
	}

	public void exibirDesconto() {
		System.out.println("Preço: " + this.preco
				+ "\nDesconto: " + (this.preco * this.desconto
				+ "\nTotal: " + (this.preco - this.preco * this.desconto)));
		
		System.out.println("======================");
	}

}
