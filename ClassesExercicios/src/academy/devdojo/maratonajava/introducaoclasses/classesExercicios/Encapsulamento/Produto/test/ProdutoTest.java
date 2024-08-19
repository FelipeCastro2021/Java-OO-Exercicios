package academy.devdojo.maratonajava.introducaoclasses.classesExercicios.Encapsulamento.Produto.test;

import academy.devdojo.maratonajava.introducaoclasses.classesExercicios.Encapsulamento.Produto.dominio.Produto;

public class ProdutoTest {

	public static void main(String[] args) {
//		Descrição: Crie uma classe Produto com os atributos privados nome, preco e quantidadeEmEstoque. 
//		Forneça métodos públicos para definir e acessar esses atributos, 
//		garantindo que o preço não seja negativo e que a quantidade em estoque seja atualizada corretamente após uma venda. 
//		Inclua um método vender(int quantidade) que diminui a quantidade em estoque, desde que a quantidade vendida seja válida.
//		Se a quantidade solicitada for maior do que a disponível em estoque, exiba uma mensagem de erro. 
//		No método main, crie uma instância de Produto, simule vendas e exiba o estado final do estoque.

		Produto produto = new Produto();
        produto.setNome("Notebook");
        produto.setPreco(2000);
        produto.setQuantidadeEstoque(10);

        produto.vender(5);
        System.out.println("Quantidade em estoque: " + produto.getQuantidadeEstoque()); // Quantidade em estoque: 5

        produto.vender(6);
        System.out.println("Quantidade em estoque: " + produto.getQuantidadeEstoque());
	}

}
