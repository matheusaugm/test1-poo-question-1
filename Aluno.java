public class Aluno extends Pessoa {
	private int periodo;
	private String turma;

	public Aluno(String nome, String email, String senha, int periodo, String turma) {
		super(nome, email, senha);
		this.periodo = periodo;
		this.turma = turma;
	}

	public int getPeriodo() {
		return periodo;
	}

	public void setPeriodo(int periodo) {
		this.periodo = periodo;
	}

	public String getTurma() {
		return turma;
	}

	public void setTurma(String turma) {
		this.turma = turma;
	}

	public String mostraAluno() {
		return "Nome: " + getNome() + "\nEmail: " + getEmail() + "\nPeríodo: " + periodo + "\nTurma: " + turma;
	}
}