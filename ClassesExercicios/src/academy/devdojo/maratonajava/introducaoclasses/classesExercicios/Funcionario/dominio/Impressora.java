package academy.devdojo.maratonajava.introducaoclasses.classesExercicios.Funcionario.dominio;

public class Impressora {
	public void imprimirFuncionario(Funcionario funcionario) {
		System.out.println("Nome: " + funcionario.getNome());
		System.out.println("Idade: " + funcionario.getIdade());
		
		if (funcionario.getSalarios() != null) {
			for (int i = 0; i < funcionario.getSalarios().length; i++) {
				System.out.println(i+1 + "º Salário: " + funcionario.getSalarios()[i]);
			}
		}
	}
}
