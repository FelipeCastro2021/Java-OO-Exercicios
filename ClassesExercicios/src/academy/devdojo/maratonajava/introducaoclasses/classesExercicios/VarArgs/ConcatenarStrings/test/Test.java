package academy.devdojo.maratonajava.introducaoclasses.classesExercicios.VarArgs.ConcatenarStrings.test;

public class Test {

	public static void main(String[] args) {
//		Descrição: Crie um método chamado concatenarStrings(String... strings) que recebe um número variável de strings 
//		e retorna a concatenação de todas elas. 
//		Teste o método com diferentes quantidades de argumentos e exiba os resultados.
		System.out.println(concatenarStrings("Thiago", "Robson", "Arthur"));
		System.out.println("===============================");
		System.out.println(concatenarStrings("Michelle", "Juliane", "Ingrid", "Luciana"));
		System.out.println("===============================");
		System.out.println(concatenarStrings("Pedro", "Juan", "Bryan", "Eduardo", "Paulo"));
	}

	public static String concatenarStrings(String... strings) {
		String concatenacao = "";
		
		for (String value : strings) {
			concatenacao += value;
		}
		
		return concatenacao;
	}
}
