package classes;

import java.util.Date;

public class Aulas {
	private Integer id;
	private Date inicio;
	private Date termino;
	private Aluno [] alunos; //o array é utilizado em (alunos) porque trata-se de uma coleção de alunos.
	private Professor professor;
	private Curso curso;
	private Sala sala;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Date getInicio() {
		return inicio;
	}
	public void setInicio(Date inicio) {
		this.inicio = inicio;
	}
	public Date getTermino() {
		return termino;
	}
	public void setTermino(Date termino) {
		this.termino = termino;
	}
	public Aluno[] getAlunos() {
		return alunos;
	}
	public void setAlunos(Aluno[] alunos) {
		this.alunos = alunos;
	}
	public Professor getProfessor() {
		return professor;
	}
	public void setProfessor(Professor professor) {
		this.professor = professor;
	}
	public Curso getCurso() {
		return curso;
	}
	public void setCurso(Curso curso) {
		this.curso = curso;
	}
	public Sala getSala() {
		return sala;
	}
	public void setSala(Sala sala) {
		this.sala = sala;
	}

	public String cadastrar() {
		String msg = "As aulas foram cadastradas";
		return msg;
	}
}
