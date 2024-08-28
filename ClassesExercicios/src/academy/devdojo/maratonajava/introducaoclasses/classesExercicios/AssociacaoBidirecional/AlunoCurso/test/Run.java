package academy.devdojo.maratonajava.introducaoclasses.classesExercicios.AssociacaoBidirecional.AlunoCurso.test;

import academy.devdojo.maratonajava.introducaoclasses.classesExercicios.AssociacaoBidirecional.AlunoCurso.dominio.Aluno;
import academy.devdojo.maratonajava.introducaoclasses.classesExercicios.AssociacaoBidirecional.AlunoCurso.dominio.Curso;

public class Run {
	public static void main(String[] args) {
		Aluno aluno = new Aluno("Juvenal");
		Curso curso = new Curso("Informática Básica");
		Aluno aluno2 = new Aluno("Toninho");
		Curso curso2 = new Curso("Introução à Algoritmos");
		
		aluno.setCursos(new Curso[]{curso, curso2});
		aluno2.setCursos(new Curso[]{curso2});
		
		curso.setAlunos(new Aluno[] {aluno});
		curso2.setAlunos(new Aluno[] {aluno, aluno2});
	}
}
