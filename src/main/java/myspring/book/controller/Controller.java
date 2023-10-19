package myspring.book.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import myspring.book.service.BookService;
import myspring.book.vo.BookVO;


@org.springframework.stereotype.Controller
public class Controller {
	@Autowired
	BookService bookService;

	@RequestMapping(path = "/bookList.do")
	ModelAndView bookList() {
		List<BookVO> bookList = bookService.selectAllBook();
		return new ModelAndView("bookList","bookList",bookList);
	}
	
	@RequestMapping(path = "/getbook.do")
	ModelAndView getbook(@RequestParam int id) {
		BookVO bookInfo = bookService.selectBook(id);
		return new ModelAndView("bookInfo","bookInfo",bookInfo);
	}
}
