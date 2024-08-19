package academy.devdojo.maratonajava.introducaoclasses.classesExercicios.VarArgs.MaiorNumeroInteiros.test;

public class Test {

	public static void main(String... args) {
//		Descrição: Crie um método chamado encontrarMaior(int... numeros) que recebe um número variável de inteiros 
//		e retorna o maior valor entre eles. O método deve funcionar mesmo se apenas um número for passado como argumento. 
//		Teste o método com diferentes listas de números e exiba os resultados.
		System.out.println(encontrarMaior(5, 8, 12, 22, 287));
		System.out.println(encontrarMaior(52, 38, 172, 252, 1287));
		System.out.println(encontrarMaior(25, 18, 912, 272, 2487));
	}
	
	public static int encontrarMaior(int... numeros) {
		int maior = numeros[0];
		
		for (int numero : numeros) {
			if(numero > maior) {
				maior = numero;
			}
		}
		
		return maior;
	}

}
