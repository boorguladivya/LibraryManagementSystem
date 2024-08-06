package org.jsp.library;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class HyderabadLibrary implements Library {
    Scanner sc = new Scanner(System.in);
    private static ArrayList<Book> l = new ArrayList<Book>();

    @Override
    public void addBook(Book b) {
        l.add(b);
    }

    @Override
    public void displayBookDetails(String a) {
        boolean status = false;
        for (Book i : l) {
            if (i.getAuthorName().equalsIgnoreCase(a)) {
                status = true;
                System.out.println(i);
            }
        }
        if (!status) {
            throw new AuthorNotFoundException();
        }
    }

    @Override
    public void removeBook(int id) {
        Iterator<Book> iterator = l.iterator();
        boolean status = false;
        while (iterator.hasNext()) {
            Book x = iterator.next();
            if (x.getBookid() == id) {
                iterator.remove();
                status = true;
                System.out.println("Book removed successfully");
            }
        }
        if (!status) {
            System.err.println("No such record found");
        }
    }

    @Override
    public void updateBookDetails(int id) {
        for (Book x : l) {
            if (x.getBookid() == id) {
                boolean start = true;
                while (start) {
                    System.out.println("\n > Press a to update bookid \n > Press b to update book title \n > Press c to update book author name \n > Press d to update book genre");
                    char ch = sc.next().charAt(0);
                    switch (ch) {
                        case 'a': {
                            System.out.println("Enter new book id");
                            x.setBookid(sc.nextInt());
                            break;
                        }
                        case 'b': {
                            System.out.println("Enter new book title");
                            x.setTitle(sc.next());
                            break;
                        }
                        case 'c': {
                            System.out.println("Enter new Author name");
                            x.setAuthorName(sc.next());
                            break;
                        }
                        case 'd': {
                            System.out.println("Enter new book Genre");
                            x.setGenre(sc.next());
                            break;
                        }
                    }
                    System.out.println("> Enter 1 to return to main menu \n > Enter 2 to exit");
                    if (sc.nextInt() == 2) {
                        start = false;
                    }
                }
            }
        }
    }

    @Override
    public void bookSummary() {
        for (Book x : l) {
            System.out.println(x);
            System.out.println("-----------------------------------");
        }
    }
}
