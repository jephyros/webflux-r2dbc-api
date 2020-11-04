package kr.chis.webfluxr2dbcapi;

import kr.chis.webfluxr2dbcapi.book.entity.Book;
import kr.chis.webfluxr2dbcapi.book.service.BookService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

/**
 * @author InSeok
 * Date : 2020/11/04
 * Remark :
 */
@RestController
@AllArgsConstructor
public class HomeController {

    private final BookService bookService;

    @RequestMapping("/")
    public Flux<Book> index(){
        return bookService.findAll();
    }

}
