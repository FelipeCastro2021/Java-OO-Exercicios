package academy.devdojo.maratonajava.introducaoclasses.classesExercicios.VarArgs.SomaInteiros.test;

public class Test {

	public static void main(String[] args) {
//		Descrição: Crie um método chamado soma(int... numeros) que recebe um número variável de inteiros
//		e retorna a soma de todos eles. 
//		Teste o método com diferentes quantidades de argumentos e exiba os resultados.
		System.out.println("A soma dos números é: " + soma(1, 2, 3, 4, 5, 6));
	}
	
	public static int soma(int... numeros) {
		int soma = 0;
		
		for (int numero : numeros) {
			soma += numero;
		}
		
		return soma;
	}

}
