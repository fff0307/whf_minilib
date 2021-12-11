package minilib.vo;

public class Title {
	private String codeid;
	private String isbn;
	private String title;
	private String authors;
	private String pressid;
	private String typeid;
	private String codename;
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
	public String getCodeid() {
		return codeid;
	}
	public void setCodeid(String codeid) {
		this.codeid = codeid;
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
	public String getTypeid() {
		return typeid;
	}
	public void setTypeid(String typeid) {
		this.typeid = typeid;
	}
	public String getCodename() {
		return codename;
	}
	public void setCodename(String codename) {
		this.codename = codename;
	}
}
