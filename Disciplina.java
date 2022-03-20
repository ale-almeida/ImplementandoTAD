package tads;

public class Disciplina implements InterfaceTad2{
//	Implemente um TAD do tipo Disciplina em que contenha as operações:
//		-Consulta
//		-Inclusão
//		-Remoção
//		-Retorno da quantidade de professores
//		-Limpar lista
	private String [] nomeProfessor;
	
	public Disciplina(String[] nomeProfessor) {
		this.nomeProfessor = nomeProfessor;
	}
	public String addProfessor(String nomeProfessor) {
		return nomeProfessor;
	}
	public String[] getNomeProfessor() {
		return nomeProfessor;
	}
	public void setNomeProfessor(String[] nomeProfessor) {
		this.nomeProfessor = nomeProfessor;
	}
	public void limpaListaProfessor(String[] nomeProfessor) {
		
	}
	public void removerProfessor(String[] nomeProfessor) {
	
	}

	
	}
