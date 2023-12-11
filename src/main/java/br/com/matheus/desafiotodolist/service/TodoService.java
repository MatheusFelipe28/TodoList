package br.com.matheus.desafiotodolist.service;

import java.util.List;

//import org.springframework.data.domain.Sort;
//import org.springframework.data.domain.ScrollPosition.Direction;
import org.springframework.stereotype.Service;
import br.com.matheus.desafiotodolist.entity.Todo;
import br.com.matheus.desafiotodolist.repository.TodoRepository;

@Service
public class TodoService {
    private TodoRepository todoRepository;


    public TodoService(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    public List<Todo> create(Todo todo) {
        todoRepository.save(todo);
        return list();

    }

    public List<Todo> list() {
      //  Sort sort = sort.by(Direction.DESC, "prioridade")
      //      .and(Sort.by(Direction.ASC, "id"));

        return todoRepository.findAll();

    }

    public List<Todo> update(Long id, Todo todo) {
       /* todoRepository.findById(id).ifPresentOrElse((existingTodo) -> {
            todo.setId(id);
            todoRepository.save(todo);
        }, () -> {
            throw new BadRequestException("Todo %d  não existe! ".formatted(id));
        });*/

        return list();

    }

    public List<Todo> delete(Long id) {
        return list();
    }

    public List<Todo> update(Todo todo) {
        return null;
    }

    

}
