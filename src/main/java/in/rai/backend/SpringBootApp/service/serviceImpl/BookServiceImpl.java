package in.rai.backend.SpringBootApp.service.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.rai.backend.SpringBootApp.model.Book;
import in.rai.backend.SpringBootApp.repository.BookRepository;
import in.rai.backend.SpringBootApp.service.BookService;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class BookServiceImpl implements BookService{

	@Autowired
	private BookRepository repository;
	
	public void saveByBook(Book book) {
		repository.save(book);
	}
	
	public List<Book> findAllBooks(){
		return repository.findAll();
	}
	
	public Optional<Book> findBookByID(Integer id) {
		return repository.findById(id);
	}
	
	public void deleteBookByID(Integer id) {
		repository.deleteById(id);
	}
}
