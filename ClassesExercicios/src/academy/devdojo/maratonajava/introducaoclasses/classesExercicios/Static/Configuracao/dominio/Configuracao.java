package academy.devdojo.maratonajava.introducaoclasses.classesExercicios.Static.Configuracao.dominio;

public class Configuracao {
	private static Configuracao instancia;

	private Configuracao() {

	}

	public static Configuracao getInstancia() {
		if (instancia == null) {
			instancia = new Configuracao();
		}
		
		return Configuracao.instancia;
	}
	
	public void print() {
		System.out.println("Singleton: Única instância acessada.");
	}
}
