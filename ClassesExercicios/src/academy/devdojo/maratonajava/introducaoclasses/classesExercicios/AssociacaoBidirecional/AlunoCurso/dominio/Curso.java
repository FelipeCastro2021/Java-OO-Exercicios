package academy.devdojo.maratonajava.introducaoclasses.classesExercicios.AssociacaoBidirecional.AlunoCurso.dominio;

import java.util.List;

public class Curso {
	private List<Aluno> alunos;
	public String nome;

	public Curso(String nome) {
		this.nome = nome;
	}
	
	public List<Aluno> getAlunos() {
		return alunos;
	}

	public void adicionarAluno(Aluno aluno) {
        if (!alunos.contains(aluno)) {
            alunos.add(aluno);
            aluno.adicionarCurso(this);
        }
    }
}
