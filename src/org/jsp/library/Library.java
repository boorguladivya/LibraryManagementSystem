package org.jsp.library;

public interface Library {
void addBook(Book b);
 void displayBookDetails(String a);
 void removeBook(int id );
 void updateBookDetails(int id);
 void bookSummary();
}