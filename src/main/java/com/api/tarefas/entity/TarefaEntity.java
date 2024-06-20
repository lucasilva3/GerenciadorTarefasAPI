package com.api.tarefas.entity;

import java.time.LocalDateTime;

import com.api.tarefas.enuns.TarefaEnuns;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity(name = "gerenciador_tarefas")
@Table(name = "tarefas")
public class TarefaEntity {
	
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "titulo")
	private String titulo;
	
	@Column(name = "descricao")
	private String descricao;
	
	@Column(name = "status")
	private TarefaEnuns status;
	
	@Column(name = "previsao_termino")
	private LocalDateTime previsao_termino;
	
	@Column(name = "inicio_tarefa")
	private LocalDateTime inicio_tarefa;
	
	@Column(name = "entrega_tarefa")
	private LocalDateTime entrega_tarefa;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public TarefaEnuns getStatus() {
		return status;
	}

	public void setStatus(TarefaEnuns status) {
		this.status = status;
	}

	public LocalDateTime getPrevisao_termino() {
		return previsao_termino;
	}

	public void setPrevisao_termino(LocalDateTime previsao_termino) {
		this.previsao_termino = previsao_termino;
	}

	public LocalDateTime getInicio_tarefa() {
		return inicio_tarefa;
	}

	public void setInicio_tarefa(LocalDateTime inicio_tarefa) {
		this.inicio_tarefa = inicio_tarefa;
	}

	public LocalDateTime getEntrega_tarefa() {
		return entrega_tarefa;
	}

	public void setEntrega_tarefa(LocalDateTime entrega_tarefa) {
		this.entrega_tarefa = entrega_tarefa;
	}

}
