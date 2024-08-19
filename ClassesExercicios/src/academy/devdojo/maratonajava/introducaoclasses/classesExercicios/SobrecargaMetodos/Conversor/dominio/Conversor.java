package academy.devdojo.maratonajava.introducaoclasses.classesExercicios.SobrecargaMetodos.Conversor.dominio;

public class Conversor {
	// Horas -> minutos
	public int converterTempo(int horas) {
		return horas * 60;
	}

	// Horas e minutos -> segundos
	public int converterTempo(int horas, int minutos) {
		horas = this.converterTempo(horas);
		return (horas + minutos) * 60;
	}

	// Dias -> horas
	public int converterTempoDiasParaHoras(int dias) {
		return dias * 24;
	}
}
