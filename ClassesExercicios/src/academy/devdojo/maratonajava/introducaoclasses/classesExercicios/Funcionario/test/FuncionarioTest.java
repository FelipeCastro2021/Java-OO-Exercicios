package academy.devdojo.maratonajava.introducaoclasses.classesExercicios.Funcionario.test;

import academy.devdojo.maratonajava.introducaoclasses.classesExercicios.Funcionario.dominio.Calculadora;
import academy.devdojo.maratonajava.introducaoclasses.classesExercicios.Funcionario.dominio.Funcionario;
import academy.devdojo.maratonajava.introducaoclasses.classesExercicios.Funcionario.dominio.Impressora;

public class FuncionarioTest {

	public static void main(String... args) {
		Funcionario funcionario = new Funcionario();
		Impressora imprimir = new Impressora();
		Calculadora calculadora = new Calculadora();
		
		funcionario.setNome("Toninho");
		funcionario.setIdade(21);

		imprimir.imprimirFuncionario(funcionario);
		calculadora.mediaSalarial(100, 500, 800, 2000);
	}

}
