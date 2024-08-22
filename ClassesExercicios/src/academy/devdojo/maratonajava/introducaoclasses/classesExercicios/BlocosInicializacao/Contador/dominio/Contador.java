package academy.devdojo.maratonajava.introducaoclasses.classesExercicios.BlocosInicializacao.Contador.dominio;

public class Contador {
	public static int contador;
	
	static {
		contador = 0;
	}
	
	{
		contador++;
	}
}
