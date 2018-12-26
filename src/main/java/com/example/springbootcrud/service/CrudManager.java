package com.example.springbootcrud.service;

import java.util.List;



public interface CrudManager<T,Pk> {
	public T addNewTopic(T t);
	public List<T> getAllTopics();
	public T getById(Pk id);
	public T update(T t);
	public void delete(T t);
	public void deleteById(Pk id);

}
