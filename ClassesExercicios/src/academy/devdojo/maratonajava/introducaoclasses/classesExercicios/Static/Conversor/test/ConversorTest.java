package academy.devdojo.maratonajava.introducaoclasses.classesExercicios.Static.Conversor.test;

import academy.devdojo.maratonajava.introducaoclasses.classesExercicios.Static.Conversor.dominio.Conversor;

public class ConversorTest {
	public static void main(String[] args) {
		double km = Conversor.metrosParaKilometros(2000);
		System.out.println("Percorri " + km + "km hoje");
		
		double gramas = Conversor.kilogramasParaGramas(20);
		System.out.println("Consumi " + gramas + "g de comida hoje");
		
		double fahrenheit = Conversor.celsiusParaFahrenheit(25);
		System.out.println("Hoje na minha cidade a máxima foi de " + fahrenheit + "º fairenheit");
	}
}
