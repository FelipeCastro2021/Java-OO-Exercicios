package academy.devdojo.maratonajava.introducaoclasses.classesExercicios.Static.Configuracao.test;

import academy.devdojo.maratonajava.introducaoclasses.classesExercicios.Static.Configuracao.dominio.Configuracao;

public class ConfiguracaoTest {
	public static void main(String[] args) {
		// Não pode ser acessado
//		Configuracao config = new Configuracao();
		
		Configuracao config = Configuracao.getInstancia();
		Configuracao config2 = Configuracao.getInstancia();
		
		System.out.println("As duas instância estão referenciando o mesmo objeto: " + (config == config2));
		
		config.print();
	}
}
