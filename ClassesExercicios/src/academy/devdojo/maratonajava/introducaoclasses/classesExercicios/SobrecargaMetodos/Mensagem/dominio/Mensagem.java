package academy.devdojo.maratonajava.introducaoclasses.classesExercicios.SobrecargaMetodos.Mensagem.dominio;

public class Mensagem {
	public void exibir() {
		System.out.println("Método sem parâmetros!");
	}
	
	public void exibir(String mensagem) {
		System.out.print("Método com 1 parâmetro!");
		System.out.println(" " + mensagem);
	}
	
	public void exibir(String mensagem, int number) {
		System.out.print("Método com 2 parâmetros!");
		System.out.print(" " + mensagem);
		System.out.println(" (" + number + " vezes)");
	}
}
