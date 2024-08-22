package academy.devdojo.maratonajava.introducaoclasses.classesExercicios.Construtores.Pessoa.test;

import academy.devdojo.maratonajava.introducaoclasses.classesExercicios.Construtores.Pessoa.dominio.Pessoa;

public class PessoaTest {
	public static void main(String[] args) {
		Pessoa pessoa1 = new Pessoa("Ash");
		Pessoa pessoa2 = new Pessoa("Misty", 10);
		Pessoa pessoa3 = new Pessoa("Brooke");
		
		System.out.println("Nome: " + pessoa1.getNome()); 
		System.out.println("Idade: " + pessoa1.getIdade());
		System.out.println();
		
		System.out.println("Nome: " + pessoa2.getNome());
		System.out.println("Idade: " + pessoa2.getIdade());
		System.out.println();
		
		System.out.println("Nome: " + pessoa3.getNome());
		System.out.println("Idade: " + pessoa3.getIdade());
		System.out.println();
	}
}
