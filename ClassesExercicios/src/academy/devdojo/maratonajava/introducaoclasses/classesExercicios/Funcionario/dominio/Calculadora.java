package academy.devdojo.maratonajava.introducaoclasses.classesExercicios.Funcionario.dominio;

public class Calculadora {
	public void mediaSalarial(double... salarios) {
		if (salarios == null) {
			return;
		}
		
		double media = 0;
		
		for (double salario : salarios) {
			media += salario;
		}
		
		media /= salarios.length;
		
		System.out.println("Média salarial: " + media);
	}
}
