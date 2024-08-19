package academy.devdojo.maratonajava.introducaoclasses.classesExercicios.SobrecargaMetodos.Calculadora.test;

import academy.devdojo.maratonajava.introducaoclasses.classesExercicios.SobrecargaMetodos.Calculadora.dominio.Calculadora;

public class CalculadoraTest {

	public static void main(String[] args) {
//		Descrição: Crie uma classe chamada Calculadora que tenha dois métodos somar(). 
//		Um dos métodos deve somar dois números inteiros (int),
//		e o outro deve somar dois números de ponto flutuante (double). 
//		No método main, crie instâncias da classe e teste ambos os métodos somar.

		Calculadora calc = new Calculadora();
		
		System.out.println(calc.somar(15.2F, 12.9F));
		System.out.println(calc.somar(10, 10));
	}

}
