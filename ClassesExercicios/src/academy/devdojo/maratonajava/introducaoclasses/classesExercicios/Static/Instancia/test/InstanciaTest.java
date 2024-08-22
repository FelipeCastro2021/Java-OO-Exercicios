package academy.devdojo.maratonajava.introducaoclasses.classesExercicios.Static.Instancia.test;

import academy.devdojo.maratonajava.introducaoclasses.classesExercicios.Static.Instancia.dominio.Instancia;

public class InstanciaTest {
	public static void main(String[] args) {
		new Instancia();
		new Instancia();
		new Instancia();
		new Instancia();
		
		Instancia.print();
		System.out.println(Instancia.getContador());
	}
}
