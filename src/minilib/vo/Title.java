package minilib.vo;

public class Title {
	
	private String isbn;
	private String title;
	private String authors;
	private String pressid;
	private String lendtime;
	public String getLendtime() {
		return lendtime;
	}
	public void setLendtime(String lendtime) {
		this.lendtime = lendtime;
	}
	public String getAuthors() {
		return authors;
	}
	public void setAuthors(String authors) {
		this.authors = authors;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getPressid() {
		return pressid;
	}
	public void setPressid(String pressid) {
		this.pressid = pressid;
	}
}
