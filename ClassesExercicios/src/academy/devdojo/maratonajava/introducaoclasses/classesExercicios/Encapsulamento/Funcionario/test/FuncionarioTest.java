package academy.devdojo.maratonajava.introducaoclasses.classesExercicios.Encapsulamento.Funcionario.test;

import academy.devdojo.maratonajava.introducaoclasses.classesExercicios.Encapsulamento.Funcionario.dominio.Funcionario;

public class FuncionarioTest {

	public static void main(String[] args) {
//		Descrição: Crie uma classe Funcionario com os atributos privados nome, salario e bonus. 
//		Forneça métodos públicos para definir e acessar o salario e o bonus. 
//		Inclua um método calcularSalarioTotal() que retorna o salário mais o bônus. 
//		No método main, crie uma instância de Funcionario, defina o nome, salário e bônus, e exiba o salário total.
		
		Funcionario funcionario = new Funcionario();
		
		funcionario.setSalario(1500);
		funcionario.setBonus(300);
		System.out.println("Salário total: " + funcionario.calcularSalarioTotal());

	}

}
