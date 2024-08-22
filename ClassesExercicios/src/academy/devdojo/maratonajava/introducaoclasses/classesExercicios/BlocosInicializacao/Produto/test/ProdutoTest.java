package academy.devdojo.maratonajava.introducaoclasses.classesExercicios.BlocosInicializacao.Produto.test;

import academy.devdojo.maratonajava.introducaoclasses.classesExercicios.BlocosInicializacao.Produto.dominio.Produto;

public class ProdutoTest {
	public static void main(String[] args) {
		Produto produto = new Produto(150);
		produto.exibirDesconto();
		
		Produto produto2 = new Produto(80);
		produto2.exibirDesconto();
	}
}
