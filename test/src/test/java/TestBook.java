package test.java;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import main.java.Book;
import main.java.BookRepository;
import main.java.SpringbootStarter;

@SpringBootTest(classes=SpringbootStarter.class)
@RunWith(SpringRunner.class)
public class TestBook {
	
	@Autowired
	private BookRepository bookRepository;
	
	public void setBookRepository(BookRepository bookRepository){
		this.bookRepository = bookRepository;
	}
	
	@Test
	public void test(){
		Book book = new Book();
		book.setName("zhijian");
		book.setPageSize(30);
		System.out.println(bookRepository.save(book));
	}
}
