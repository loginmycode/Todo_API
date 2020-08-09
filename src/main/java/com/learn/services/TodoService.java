package com.learn.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learn.bean.Todo;
import com.learn.dao.TodoRepo;

@Service
public class TodoService implements TodoServices {

	@Autowired
	TodoRepo repo;
	
	public Todo createTodo(Todo todo) {
		
		return repo.save(todo);
	}

	
	public List<Todo> getTodos() {
		
		return repo.findAll();
	}

	
	public Todo getTodo(Long id) {
		
		if(!isExist(id))
			return null; 
		
		return repo.findById(id).get();
		
		//return repo.getOne(id); // Dont use this its giving error
	}

	
	public Todo updateTodo(Todo todo, Long id) {
				
		todo.setId(id);
		return repo.save(todo);
	}

	
	public boolean deleteTodo(Long id) {
		
		if(isExist(id))
		{
		 repo.deleteById(id);
		 return true;
		}
		return false;
		
	}

	
	public boolean isExist(Long id) {
		
		return repo.existsById(id);
	}


	

}
