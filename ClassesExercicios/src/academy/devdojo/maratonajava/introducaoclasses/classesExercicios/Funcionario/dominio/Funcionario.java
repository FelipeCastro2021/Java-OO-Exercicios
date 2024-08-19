package academy.devdojo.maratonajava.introducaoclasses.classesExercicios.Funcionario.dominio;

public class Funcionario {
	private String nome;
	private int idade;
	private double[] salarios;
	private double media;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public double[] getSalarios() {
		return salarios;
	}

	public void setSalarios(double[] salarios) {
		this.salarios = salarios;
	}

	public double getMedia() {
		return media;
	}

}
