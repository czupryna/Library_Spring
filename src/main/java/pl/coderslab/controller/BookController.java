package pl.coderslab.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pl.coderslab.book.Book;
import pl.coderslab.book.MemoryBookService;

@RestController
@RequestMapping("/books")
public class BookController {
	
	@Autowired
	MemoryBookService memoryBookService;
	
	@RequestMapping("/hello")
	public String hello() {
		return "{hello: World}";
	}

	@RequestMapping("/helloBook")
	public Book helloBook(){
		return new Book(1L,"9788324631766","Thiniking in Java","Bruce Eckel","Helion", "document");
	}

		
	
	
	
}