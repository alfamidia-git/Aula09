package repository;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

import model.Aluno;

public class AlunoRepository {

	private Map<Integer, Aluno> alunosBD;
	
	
	public AlunoRepository() {
		this.alunosBD = new TreeMap<>();
	}
	
	
	public List<Aluno> buscarTodos() {
		return this.alunosBD.values().stream().collect(Collectors.toList());
	}
	
	public void salvar(Aluno aluno) {
		this.alunosBD.put(aluno.getMatricula(), aluno);
	}
	
	public void remover(Integer matricula) {
		this.alunosBD.remove(matricula);
	}
	
	public Aluno buscarPorMatricula(Integer matricula) {
		return this.alunosBD.get(matricula);
	}

}
