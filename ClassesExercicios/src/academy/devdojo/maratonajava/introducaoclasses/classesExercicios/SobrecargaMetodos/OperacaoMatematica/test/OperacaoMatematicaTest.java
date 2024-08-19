package academy.devdojo.maratonajava.introducaoclasses.classesExercicios.SobrecargaMetodos.OperacaoMatematica.test;

import academy.devdojo.maratonajava.introducaoclasses.classesExercicios.SobrecargaMetodos.OperacaoMatematica.dominio.OperacaoMatematica;

public class OperacaoMatematicaTest {

	public static void main(String[] args) {
//		Descrição: Crie uma classe OperacaoMatematica com quatro métodos sobrecarregados calcular(). 
//		Um método deve calcular a potência de um número (int base, int expoente), 
//		outro deve calcular a raiz quadrada de um número (double valor), 
//		outro deve calcular a média de dois números (int, int), 
//		e o último deve calcular a média de três números (int, int, int). 
//		No método main, teste todos os métodos.

		OperacaoMatematica mat = new OperacaoMatematica();
		
		System.out.println("Potência: " + mat.calcular(2, 3));
		System.out.println("Raiz Quadrada: " + mat.calcular(25.0));
		System.out.println("Média de dois números: " + mat.calcular(10D, 20D));
		System.out.println("Média de três números: " + mat.calcular(10, 20, 30));
	}

}
