package academy.devdojo.maratonajava.introducaoclasses.classesExercicios.BlocosInicializacao.Contador.test;

import academy.devdojo.maratonajava.introducaoclasses.classesExercicios.BlocosInicializacao.Contador.dominio.Contador;

public class ContadorTest {
	public static void main(String[] args) {
		new Contador();
		new Contador();
		new Contador();
		new Contador();
		new Contador();
		new Contador();
		new Contador();
		
		System.out.println(Contador.contador);
	}
}
