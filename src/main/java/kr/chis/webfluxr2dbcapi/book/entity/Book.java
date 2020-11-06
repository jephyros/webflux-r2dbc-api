package kr.chis.webfluxr2dbcapi.book.entity;

import lombok.*;
import org.springframework.data.annotation.Id;

/**
 * @author InSeok
 * Date : 2020/11/04
 * Remark :
 */


@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class Book {
    private Long id;
    private String book_id;
    private String book_name;
}
