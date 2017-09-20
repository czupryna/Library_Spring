package pl.coderslab.book;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class MemoryBookService {

	private List<Book> list;

	public MemoryBookService() {

		list = new ArrayList<>();
		list.add(new Book(1L, "9788324631766", "Thiniking in Java", "Bruce Eckel", "helion", "docum"));
		list.add(new Book(2L, "9788324627738", "Rusz glowa Java.", "Sierra Kathy, Bates Bert", "empic", "docum"));
		list.add(new Book(3L, "9780130819338", "Java 2. Podstawy", "Cay Horstmann, Gary Cornell", "sowa", "docum"));

	}

	public List<Book> getList() {
		return list;
	}

	public void setList(List<Book> list) {
		this.list = list;
	}
	
//	Klasa ta powinna posiadać metody:
//
//		Pobieranie listy dancyh.
//		Pobieranie obiektu po wskazanym
//		identyfikatorze.
//		Edycje obiektu.
//		Usuwanie obiektu.
	
	public String showAllBooks(){
		for(Book bl: list){
			return bl;
		}	
	}
	
	
	public String showThisBook(){
		for(Book bl: list){
			if(Book.this.id = id){
				
			}
		}
	}
	
}
