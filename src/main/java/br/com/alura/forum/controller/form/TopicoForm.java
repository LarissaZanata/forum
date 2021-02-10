package br.com.alura.forum.controller.form;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

import br.com.alura.forum.modelo.Curso;
import br.com.alura.forum.modelo.Topico;
import br.com.alura.forum.repository.CursoRepository;
import br.com.alura.forum.repository.TopicoRepository;

public class TopicoForm {
	
	@NotNull @NotEmpty @Length(min=5)
	private String titulo;
	
	@NotNull @NotEmpty @Length(min=10)
	private String mensagem;
	private String nomeCurso;
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getMensagem() {
		return mensagem;
	}
	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}
	public String getNomeCUrso() {
		return nomeCurso;
	}
	public void setNomeCUrso(String nomeCUrso) {
		this.nomeCurso = nomeCUrso;
	}
	public Topico converter(CursoRepository cursoRepository ) {
		Curso curso = cursoRepository.findByNome(nomeCurso);
		return new Topico(titulo, mensagem, curso);
	}
	
	
}
