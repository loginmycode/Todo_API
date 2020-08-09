package com.learn.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learn.bean.Todo;

public interface TodoRepo extends JpaRepository<Todo, Long> {

}
