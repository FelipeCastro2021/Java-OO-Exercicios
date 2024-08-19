package academy.devdojo.maratonajava.introducaoclasses.classesExercicios.Encapsulamento.Pessoa.test;

import academy.devdojo.maratonajava.introducaoclasses.classesExercicios.Encapsulamento.Pessoa.dominio.Pessoa;

public class PessoaTest {

	public static void main(String[] args) {
//		Descrição: Crie uma classe chamada Pessoa com os atributos nome e idade, ambos privados. 
//		Forneça métodos públicos getNome(), setNome(String nome), getIdade(), e setIdade(int idade) 
//		para acessar e modificar esses atributos. 
//		No método main, crie uma instância da classe, defina valores para nome e idade e exiba-os.
		
		Pessoa pessoa = new Pessoa();
		
		pessoa.setNome("Toninho");
		pessoa.setIdade(21);
		
		System.out.println("Nome: " + pessoa.getNome());
		System.out.println("Idade: " + pessoa.getIdade());
	}

}
