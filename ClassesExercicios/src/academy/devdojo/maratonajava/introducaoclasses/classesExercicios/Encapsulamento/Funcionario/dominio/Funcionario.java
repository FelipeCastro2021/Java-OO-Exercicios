package academy.devdojo.maratonajava.introducaoclasses.classesExercicios.Encapsulamento.Funcionario.dominio;

public class Funcionario {
	private String nome;
	private double salario;
	private double bonus;
	
	public double calcularSalarioTotal() {
		return this.salario + this.bonus;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

}
