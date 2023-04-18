public class Main {
	public static void main(String[] args) {
		// Criando objeto Professor com dados mocados
		Professor professor = new Professor("João da Silva", "joao.silva@gmail.com", "123456", 50.0, 20);

		// Chamando o método mostraProfessor()
		System.out.println(professor.mostraProfessor());

		// Criando objeto Aluno com dados mocados
		Aluno aluno = new Aluno("Maria Oliveira", "maria.oliveira@gmail.com", "654321", 3, "A1");

		// Chamando o método mostraAluno()
		System.out.println(aluno.mostraAluno());
	}
}
