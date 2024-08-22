package academy.devdojo.maratonajava.introducaoclasses.classesExercicios.Construtores.Livro.test;

import academy.devdojo.maratonajava.introducaoclasses.classesExercicios.Construtores.Livro.dominio.Livro;

public class LivroTest {
	public static void main(String[] args) {
		Livro livro = new Livro("1984", "George Orwell", 328);
		Livro livro2 = new Livro("To Kill a Mockingbird", "Harper Lee");
		Livro livro3 = new Livro("The Great Gatsby");
		
		livro.imprimirLivro();
		livro2.imprimirLivro();
		livro3.imprimirLivro();
	}
}
