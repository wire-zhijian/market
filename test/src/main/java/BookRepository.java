package main.java;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Integer>{
//	public Integer saveOne(Book book);
//	public Book getById(Book book);
}
