package academy.devdojo.maratonajava.introducaoclasses.classesExercicios.SobrecargaMetodos.Conversor.test;

import academy.devdojo.maratonajava.introducaoclasses.classesExercicios.SobrecargaMetodos.Conversor.dominio.Conversor;

public class ConversorTest {

	public static void main(String[] args) {
//		Descrição: Crie uma classe Conversor que tenha três métodos sobrecarregados converterTempo().
//		Um método deve converter horas para minutos (int), 
//		outro deve converter horas e minutos para segundos (int, int), 
//		e o terceiro deve converter dias para horas (int).
//		No método main, teste todos os métodos.

		Conversor conversor = new Conversor();
		System.out.println(conversor.converterTempo(2) + " minutos.");
		System.out.println(conversor.converterTempo(2, 30) + " segundos.");
		System.out.println(conversor.converterTempoDiasParaHoras(7) + " horas.");
	}

}
