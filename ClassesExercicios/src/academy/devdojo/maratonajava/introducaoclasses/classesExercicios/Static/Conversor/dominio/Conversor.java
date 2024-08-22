package academy.devdojo.maratonajava.introducaoclasses.classesExercicios.Static.Conversor.dominio;

public class Conversor {
	public static double metrosParaKilometros(double metros) {
		return metros / 1000;
	}

	public static double kilogramasParaGramas(double kilogramas) {
		return kilogramas * 1000;
	}

	public static double celsiusParaFahrenheit(double celsius) {
		return (celsius * 9/5) + 32;
	}
}
