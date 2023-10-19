package myspring.book.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import myspring.book.dao.BookDAO;
import myspring.book.dao.mapper.BookMapper;
import myspring.book.vo.BookVO;

@Service
public class BookServiceImpl implements BookService{
	
	@Autowired
	BookDAO bookDAO;

	@Override
	public List<BookVO> selectAllBook() {
		return bookDAO.selectAllBook();
	}

	@Override
	public BookVO selectBook(int id) {
		return bookDAO.selectBook(id);
	}

}
