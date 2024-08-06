package org.jsp.library;

public class Book {
private int bookid;
private String title;
private String authorName;
private String genre;
public Book()
{
	
}
public Book(int bookid,String title, String authorName, String genre) {
    this.bookid=bookid;
	this.title = title;
	this.authorName = authorName;
	this.genre = genre;
	System.out.println("Book added successfully");
	System.out.println("----------------------------------");
}

public int getBookid() {
	return bookid;
}
public void setBookid(int bookid) {
	this.bookid = bookid;
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public String getAuthorName() {
	return authorName;
}
public void setAuthorName(String authorName) {
	this.authorName = authorName;
}
public String getGenre() {
	return genre;
}
public void setGenre(String genre) {
	this.genre = genre;
}
@Override
public String toString() {
	return "\n Book Id: "+bookid+"\n Book Title: " + title + "\n Book authorName: " + authorName + "\n Book genre: " + genre ;
}

}