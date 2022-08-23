import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class Principal {

	public static void main(String[] args) {
		
		
		Aluno aluno1 = new Aluno(111, "João da silva");
		Aluno aluno2 = new Aluno(222, "Maria da silva");
		Aluno aluno3 = new Aluno(333, "Roberto da silva");
		Aluno aluno4 = new Aluno(3241, "Ana clara");
		Aluno aluno5 = new Aluno(112, "Regis Lopes");
		
		Map<Integer, Aluno> alunos = new TreeMap<>();
		
		
		alunos.put(aluno1.getMatricula(), aluno1);
		alunos.put(aluno2.getMatricula(), aluno2);
		alunos.put(aluno3.getMatricula(), aluno3);
		alunos.put(aluno4.getMatricula(), aluno4);
		alunos.put(aluno5.getMatricula(), aluno5);
		
		System.out.println(alunos);
		System.out.println("==================");
	
	
		
		alunos.
		List<Aluno> listAlunos = alunos.values().stream().collect(Collectors.toList());
		
		System.out.println(listAlunos);
		
		
	}

}
