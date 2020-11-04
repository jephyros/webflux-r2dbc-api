package kr.chis.webfluxr2dbcapi.book.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;

/**
 * @author InSeok
 * Date : 2020/11/04
 * Remark :
 */


@Data
public class Book {
    private Long id;
    private String bookId;
    private String bookName;
}
