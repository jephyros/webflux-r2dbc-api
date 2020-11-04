package kr.chis.webfluxr2dbcapi.book.entity;

import org.springframework.data.r2dbc.repository.R2dbcRepository;
import org.springframework.stereotype.Repository;

/**
 * @author InSeok
 * Date : 2020/11/04
 * Remark :
 */
@Repository
public interface BookRepository extends R2dbcRepository<Book,Long> {
}
