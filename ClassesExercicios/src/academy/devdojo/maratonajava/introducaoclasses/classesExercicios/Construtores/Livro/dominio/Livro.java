package academy.devdojo.maratonajava.introducaoclasses.classesExercicios.Construtores.Livro.dominio;

public class Livro {
	public String titulo;
	public String autor;
	public int paginas;
	
	public Livro(String titulo) {
		this.titulo = titulo;
	}
	
	public Livro(String titulo, String autor) {
		this(titulo);
		this.autor = autor;
	}
	
	public Livro(String titulo, String autor, int paginas) {
		this(titulo, autor);
		this.paginas = paginas;
	}
	
	public void imprimirLivro() {
		System.out.println("Título: " + this.titulo + "\nAutor: " + this.autor + "\nPáginas: " + this.paginas);
		System.out.println("================================");
	}
}
