package br.com.matheus.desafiotodolist.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.matheus.desafiotodolist.entity.Todo;

public interface TodoRepository extends JpaRepository<Todo, Long> {


    
}