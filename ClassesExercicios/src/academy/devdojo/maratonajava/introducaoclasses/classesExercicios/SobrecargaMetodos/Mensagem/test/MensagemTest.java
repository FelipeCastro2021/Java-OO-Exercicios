package academy.devdojo.maratonajava.introducaoclasses.classesExercicios.SobrecargaMetodos.Mensagem.test;

import academy.devdojo.maratonajava.introducaoclasses.classesExercicios.SobrecargaMetodos.Mensagem.dominio.Mensagem;

public class MensagemTest {

	public static void main(String[] args) {
//		Descrição: Crie uma classe Mensagem que tenha três métodos exibir(). 
//		Um deve exibir uma mensagem sem parâmetros, 
//		outro deve exibir uma mensagem com um String como parâmetro, e o terceiro deve exibir uma mensagem 
//		com dois parâmetros: um String e um int. 
//		No método main, chame os três métodos e observe os diferentes resultados.

		Mensagem mensagem = new Mensagem();
		mensagem.exibir();
		mensagem.exibir("Participando!!!");
		mensagem.exibir("Foda-se a Growth nesse sentido", 154);
	}

}
