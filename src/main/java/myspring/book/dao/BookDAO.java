package myspring.book.dao;

import java.util.List;

import myspring.book.vo.BookVO;

public interface BookDAO {
	List<BookVO> selectAllBook();
	BookVO selectBook(int id);
}
