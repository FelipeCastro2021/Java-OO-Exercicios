package academy.devdojo.maratonajava.introducaoclasses.classesExercicios.Static.Instancia.dominio;

public class Instancia {
	private static int contador;
	
	public Instancia() {
		contador++;
	}
	
	public static void print() {
		System.out.println(Instancia.contador);
	}
	
	public static int getContador() {
		return Instancia.contador;
	}
}
