package kr.chis.webfluxr2dbcapi.book;

import kr.chis.webfluxr2dbcapi.book.entity.Book;
import kr.chis.webfluxr2dbcapi.book.service.BookService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.test.StepVerifier;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

/**
 * @author InSeok
 * Date : 2020/11/06
 * Remark :
 */
@SpringBootTest
public class BookServiceTest {

    @Autowired
    BookService bookService;

    @DisplayName("1. book 을 저장한다.")
    @Test
    public void test_1(){
        Book b1 = Book.builder()
                .book_id("BOOK-S0021")
                .book_name("죄와벌").build();
        StepVerifier.create(bookService.save(b1))
                .expectSubscription()

//                .assertNext(book->{
//                    assertThat(book.getBook_name()).as("Expect : ",b1.getBook_name()).isEqualTo(b1.getBook_name());
//                })
                //.expectNextCount(1)
                .verifyComplete();
    }

    @DisplayName("2. book 을 모두 조회한다.")
    @Test
    public void test_2(){
        StepVerifier.create(bookService.findAll())
                .expectSubscription()
                .expectNextCount(9)
                .verifyComplete();
    }


}
