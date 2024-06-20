package com.api.tarefas.service;

import java.util.List;
import java.util.Optional;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import com.api.tarefas.entity.TarefaEntity;
import com.api.tarefas.repository.TarefaRepository;

@Service
public class TarefaService {
	
	@Autowired
	private TarefaRepository tarefaRepository;

	public List<TarefaEntity> listagem() {
		return tarefaRepository.findAll();
	}

	@Transactional
	public TarefaEntity salvar(@RequestParam TarefaEntity _tarefaEntity) {
		return tarefaRepository.save(_tarefaEntity);
	}

	public Optional<TarefaEntity> buscarID(@PathVariable Long _id) {
		return tarefaRepository.findById(_id);
	}

	@Transactional
	public void deletarTudo() {
		tarefaRepository.deleteAll();
	}

	@Transactional
	public void deletarID(@PathVariable Long _id) {
		tarefaRepository.deleteById(_id);
	}

	@Transactional
	public TarefaEntity atualizar(Long _id, TarefaEntity _tarefaEntity) {
		Optional<TarefaEntity> tarefaOptional = tarefaRepository.findById(_id);
		
		if (!tarefaOptional.isPresent()) throw new RuntimeException("Tarefa com ID "+ _id+ " não encontrada!");

		TarefaEntity tarefaAtualizada = tarefaOptional.get();
		if (_tarefaEntity.getTitulo() != null) tarefaAtualizada.setTitulo(_tarefaEntity.getTitulo());
		if (_tarefaEntity.getDescricao() != null) tarefaAtualizada.setDescricao(_tarefaEntity.getDescricao());
		if (_tarefaEntity.getStatus() != null) tarefaAtualizada.setStatus(_tarefaEntity.getStatus());
		if (_tarefaEntity.getPrevisao_termino() != null) tarefaAtualizada.setPrevisao_termino(_tarefaEntity.getPrevisao_termino());
		if (_tarefaEntity.getInicio_tarefa() != null) tarefaAtualizada.setInicio_tarefa(_tarefaEntity.getInicio_tarefa());
		if (_tarefaEntity.getEntrega_tarefa() != null) tarefaAtualizada.setEntrega_tarefa(_tarefaEntity.getEntrega_tarefa());
		
		return tarefaRepository.save(tarefaAtualizada);
	}

	@Transactional
	public TarefaEntity atualizarParcial(Long _id, TarefaEntity _tarefaEntity) {
		Optional<TarefaEntity> tarefaOptional = tarefaRepository.findById(_id);
		if (tarefaOptional.isPresent()) {
			TarefaEntity tarefaAtualizada = tarefaOptional.get();
			if (_tarefaEntity != null) tarefaAtualizada.setTitulo(_tarefaEntity.getTitulo());
			if (_tarefaEntity != null) tarefaAtualizada.setDescricao(_tarefaEntity.getDescricao());
			if (_tarefaEntity != null) tarefaAtualizada.setStatus(_tarefaEntity.getStatus());
			if (_tarefaEntity != null) tarefaAtualizada.setPrevisao_termino(_tarefaEntity.getPrevisao_termino());
			if (_tarefaEntity != null) tarefaAtualizada.setInicio_tarefa(_tarefaEntity.getInicio_tarefa());
			if (_tarefaEntity != null) tarefaAtualizada.setEntrega_tarefa(_tarefaEntity.getEntrega_tarefa());

			try {
				return tarefaRepository.save(tarefaAtualizada);
			}
			catch (Exception e) {
				e.printStackTrace();
				throw new RuntimeException("Erro ao atualizar a tarefa de ID: "+ _id);
			}
		}
		else {
			throw new RuntimeException("Tarefa de ID "+ _id+ " não encontrada!");
		}
	}

}



















