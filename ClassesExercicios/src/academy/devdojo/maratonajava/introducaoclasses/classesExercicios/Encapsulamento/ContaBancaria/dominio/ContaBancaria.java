package academy.devdojo.maratonajava.introducaoclasses.classesExercicios.Encapsulamento.ContaBancaria.dominio;

public class ContaBancaria {
	private double saldo;
	private double limiteSaque;

	public void depositar(double deposito) {
		this.saldo += deposito;
	}

	public void sacar(double valor) {
		// Se o valor do saque for maior que o limite de saque, considere o limiteSaque
		// como o valor a ser sacado
		if (valor > limiteSaque) {
			valor = limiteSaque;
		}

		// Verifica se o valor ajustado é menor ou igual ao saldo
		if (valor <= saldo) {
			saldo -= valor;
			System.out.println("Saque realizado: " + valor);
		} else {
			this.saldo = 0;
			System.out.println("Saque não saiu como o planejado! Saldo insuficiente, então sacamos tudo que tinha.");
		}
	}

	public void setLimiteSaque(double limite) {
		this.limiteSaque = limite;
	}

	public double getSaldo() {
		return this.saldo;
	}
}
