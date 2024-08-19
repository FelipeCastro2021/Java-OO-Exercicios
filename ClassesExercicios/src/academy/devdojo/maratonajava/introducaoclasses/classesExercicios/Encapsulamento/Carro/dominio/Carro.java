package academy.devdojo.maratonajava.introducaoclasses.classesExercicios.Encapsulamento.Carro.dominio;

public class Carro {
	private int velocidade;
	
	public void acelerar(int incremento) {
		this.velocidade += incremento;
	}
	
	public void frear(int decremento) {
		if ((this.velocidade - decremento) > 0) {
			this.velocidade -= decremento;
			return;
		} 
		
		this.velocidade = 0;
	}
	
	public int getVelocidade() {
		return this.velocidade;
	}
}
