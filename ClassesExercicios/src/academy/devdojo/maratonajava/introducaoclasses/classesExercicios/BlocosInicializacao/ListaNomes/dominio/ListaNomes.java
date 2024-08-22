package academy.devdojo.maratonajava.introducaoclasses.classesExercicios.BlocosInicializacao.ListaNomes.dominio;

public class ListaNomes {
	public String[] nomes;
	
	{
		nomes = new String[3];
		nomes[0] = "Balmond";
		nomes[1] = "Alice";
		nomes[2] = "Nana";
	}
	
	public void exibirNomes() {
		for (String nome : nomes) {
			System.out.println(nome + " ");
		}
	}
}
