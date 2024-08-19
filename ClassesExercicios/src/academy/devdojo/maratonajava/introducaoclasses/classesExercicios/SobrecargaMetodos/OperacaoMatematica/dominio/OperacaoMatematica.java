package academy.devdojo.maratonajava.introducaoclasses.classesExercicios.SobrecargaMetodos.OperacaoMatematica.dominio;

public class OperacaoMatematica {
	public int calcular(int base, int expoente) {
        return (int) Math.pow(base, expoente);
    }

    public double calcular(double valor) {
        return Math.sqrt(valor);
    }

    public double calcular(double  a, double b) {
        return (a + b) / 2.0;
    }

	public double calcular(int a, int b, int c) {
		return (a + b + c) / 3.0;
	}
}
