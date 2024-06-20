package com.api.tarefas.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.api.tarefas.entity.TarefaEntity;
import com.api.tarefas.service.TarefaService;

@RestController
@RequestMapping("/tarefas")
public class TarefaController {
	
	@Autowired
	private TarefaService tarefaService;
	
	@GetMapping("/listagem")
	public ResponseEntity<List<TarefaEntity>> listagem() {
		return ResponseEntity.ok().body(tarefaService.listagem());
	}
	
	@PostMapping("/salvar")
	public ResponseEntity<TarefaEntity> salvar(@RequestBody TarefaEntity _tarefaEntity) {
		tarefaService.salvar(_tarefaEntity);
		return ResponseEntity.ok().build();
	}

	@GetMapping("/buscar/{_id}")
	public ResponseEntity<Optional<TarefaEntity>> buscar(@PathVariable Long _id) {
		return ResponseEntity.ok().body(tarefaService.buscarID(_id));
	}
	
	@DeleteMapping("/deletarTudo")
	public ResponseEntity<TarefaEntity> deletarTudo() {
		tarefaService.deletarTudo();
		return ResponseEntity.noContent().build();
	}
	
	@DeleteMapping("/deletar/{_id}")
	public ResponseEntity<TarefaEntity> deletarID(@PathVariable Long _id) {
		tarefaService.deletarID(_id);
		return ResponseEntity.noContent().build();
	}
	
	@PutMapping("/atualizar/{_id}")
	public ResponseEntity<TarefaEntity> atualizar(@PathVariable Long _id, @RequestBody TarefaEntity _tarefaEntity) {
		TarefaEntity tarefaAtualizada = tarefaService.atualizar(_id, _tarefaEntity);
		return ResponseEntity.ok(tarefaAtualizada);
	}

	@PatchMapping("/atualizarParcial/{_id}")
	public ResponseEntity<TarefaEntity> atualizarParcial(@PathVariable Long _id, @RequestBody TarefaEntity _tarefaEntity) {
		TarefaEntity tarefaAtualizada = tarefaService.atualizarParcial(_id, _tarefaEntity);
		return ResponseEntity.ok(tarefaAtualizada);
	}

}

















