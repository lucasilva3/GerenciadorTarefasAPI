package com.api.tarefas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.tarefas.entity.TarefaEntity;

@Repository
public interface TarefaRepository extends JpaRepository<TarefaEntity, Long> {}


