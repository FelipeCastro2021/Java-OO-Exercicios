package academy.devdojo.maratonajava.introducaoclasses.classesExercicios.Encapsulamento.Carro.test;

import academy.devdojo.maratonajava.introducaoclasses.classesExercicios.Encapsulamento.Carro.dominio.Carro;

public class CarroTest {

	public static void main(String[] args) {
//		Descrição: Crie uma classe chamada Carro com o atributo privado velocidade. 
//		Forneça métodos públicos acelerar(int incremento), frear(int decremento), e getVelocidade() para aumentar, 
//		diminuir e acessar a velocidade. Garanta que a velocidade não seja negativa. 
//		Teste a classe no método main.

		Carro carro = new Carro();
		System.out.println(carro.getVelocidade());
		
		carro.acelerar(200);
		System.out.println(carro.getVelocidade());
		
		carro.frear(50);
		System.out.println(carro.getVelocidade());
		
		carro.frear(200);
		System.out.println(carro.getVelocidade());
	}

}
