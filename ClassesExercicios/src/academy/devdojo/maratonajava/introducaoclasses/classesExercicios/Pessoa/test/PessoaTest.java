package academy.devdojo.maratonajava.introducaoclasses.classesExercicios.Pessoa.test;

import academy.devdojo.maratonajava.introducaoclasses.classesExercicios.Pessoa.dominio.Pessoa;

public class PessoaTest {

	public static void main(String... args) {
		Pessoa pessoa = new Pessoa();
		
		pessoa.setNome("Toninho");
		pessoa.setIdade(22);
		
		System.out.println("Nome: " + pessoa.getNome());
		System.out.println("Idade: " + pessoa.getIdade());
	}

}
