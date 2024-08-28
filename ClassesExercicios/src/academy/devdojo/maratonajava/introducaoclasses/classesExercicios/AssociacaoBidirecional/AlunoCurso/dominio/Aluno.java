package academy.devdojo.maratonajava.introducaoclasses.classesExercicios.AssociacaoBidirecional.AlunoCurso.dominio;

public class Aluno {
	private Curso[] cursos;
	public String nome;
	
	public Aluno(String nome) {
		this.nome = nome;
	}
	
	public void setCursos(Curso[] cursos) {
		this.cursos = cursos;
	}
	
	public Curso[] getCursos() {
		return this.cursos;
	}
}
