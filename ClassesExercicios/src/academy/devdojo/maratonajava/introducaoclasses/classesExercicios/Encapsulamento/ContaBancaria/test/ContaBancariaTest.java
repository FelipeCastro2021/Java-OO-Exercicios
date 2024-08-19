package academy.devdojo.maratonajava.introducaoclasses.classesExercicios.Encapsulamento.ContaBancaria.test;

import academy.devdojo.maratonajava.introducaoclasses.classesExercicios.Encapsulamento.ContaBancaria.dominio.ContaBancaria;

public class ContaBancariaTest {

	public static void main(String[] args) {
//		Descrição: Crie uma classe ContaBancaria com os atributos privados saldo e limiteSaque. 
//		Forneça métodos públicos para depositar e sacar valores, com a restrição de que o valor do saque não pode exceder o limiteSaque. 
//		Inclua métodos para definir e acessar o limite de saque e o saldo. 
//		No método main, crie uma instância, faça depósitos e saques, e exiba o saldo final.
		
		ContaBancaria banco = new ContaBancaria();
		banco.depositar(200);
		banco.setLimiteSaque(500);
		banco.sacar(110);
		banco.sacar(700);
			
		System.out.println(banco.getSaldo());
		
		banco.depositar(520);
		banco.sacar(540);
		
		
		System.out.println(banco.getSaldo());
	}

}
