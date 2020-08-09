package com.learn.services;

import java.util.List;

import com.learn.bean.Todo;

public interface TodoServices {

	public Todo createTodo(Todo todo);
	public List<Todo> getTodos();
	public Todo getTodo(Long id);
	public Todo updateTodo(Todo todo, Long id);
	public boolean deleteTodo(Long id);
	public boolean isExist(Long id);
}
