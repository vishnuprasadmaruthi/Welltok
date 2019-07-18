package com.example.services;

import java.util.List;
import java.util.Optional;

import com.example.model.Book;

public interface BookService {
	
	List<Book> listAll();
	
	void delete(int id);
	
	void deleteAll();
	
	Optional<Book> getById(int id);

	Book save(Book book);

	Book updateBook(Book book, int id);
	
}
