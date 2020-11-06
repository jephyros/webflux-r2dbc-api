package kr.chis.webfluxr2dbcapi.book.service;

import kr.chis.webfluxr2dbcapi.book.entity.Book;
import kr.chis.webfluxr2dbcapi.book.entity.BookRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * @author InSeok
 * Date : 2020/11/04
 * Remark :
 */
@Service
@AllArgsConstructor
public class BookService {
    private final BookRepository bookRepository;

    public Flux<Book> findAll(){
        return bookRepository.findAll();
    }
    public Mono<Book> save(Book book){
        return bookRepository.save(book);
    }
}
