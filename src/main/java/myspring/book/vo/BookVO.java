package myspring.book.vo;

import java.sql.Date;

public class BookVO {
	private Long id;
    private String title;
    private String author;
    private  String isbn;
    private String genre;
    private Date created_at;
    public BookVO() {
		super();
	}
	public BookVO(Long id, String title, String author, String isbn, String genre, Date created_at) {
		super();
		this.id = id;
		this.title = title;
		this.author = author;
		this.isbn = isbn;
		this.genre = genre;
		this.created_at = created_at;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public Date getCreated_at() {
		return created_at;
	}
	public void setCreated_at(Date created_at) {
		this.created_at = created_at;
	}
	@Override
	public String toString() {
		return "BookVO [id=" + id + ", title=" + title + ", author=" + author + ", isbn=" + isbn + ", genre=" + genre
				+ ", created_at=" + created_at + "]";
	}
}
