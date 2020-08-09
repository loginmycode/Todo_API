package com.learn.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.learn.bean.Todo;
import com.learn.services.TodoServices;

@RestController
@RequestMapping("/todos")
public class TodoController {

	@Autowired
	TodoServices service;
	
	@GetMapping(value = {"","/"}) 
	public List<Todo> getAll()
	{
		List<Todo> todos=service.getTodos();
		System.out.println(todos);
		return todos;
	}
	
	@GetMapping("/{id}")
	public Todo getOne(@PathVariable("id") Long id)
	{
		Todo todo= service.getTodo(id);
		System.out.println(todo);
		return todo;
	}
	
	@RequestMapping(value = {"","/"},method=RequestMethod.POST)
	public Todo adding(@RequestBody Todo todo)
	{
		Todo create= service.createTodo(todo);
		System.out.println(todo);
		return create;
		
	}
	
	@PutMapping("/{id}")
	public Todo updateTodo(@RequestBody Todo todo , @PathVariable Long id)
	{	
		Todo upd = service.updateTodo(todo, id);
		System.out.println(upd);
		return upd;
	}
	
	@DeleteMapping("/{id}")
	public boolean  deleteTodo(@PathVariable("id")  Long id)
	{
		boolean b= service.deleteTodo(id);
		System.out.println(b);
		return b;
	}
	
	
	
	
	
	
	
}
