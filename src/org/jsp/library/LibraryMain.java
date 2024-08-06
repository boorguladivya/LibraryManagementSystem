package org.jsp.library;

import java.util.Scanner;

public class LibraryMain 
{
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	HyderabadLibrary h=new HyderabadLibrary();
	boolean start =true;
	while(start)
	{
		System.out.println("-=-=-=-=-Hyderabad Library-=-=--=-=-");
		System.out.println("\n > Press 1 to add book \n > Press 2 retrieve a particular  book \n > Press 3 remove particular book \n > Press 4 to update a particular book \n > Press 5 to view book summary \n > Press 6 to exit ");
		System.out.println("\n Enter your choice ");
		int n=sc.nextInt();
		switch(n)
		{
		case 1:{
		System.out.println("Enter book id of the book");
		int id=sc.nextInt();
		System.out.println("Enter title of the book");
		String t=sc.next();
		System.out.println("Enter author name of the book");
		String a=sc.next();
		System.out.println("Enter genre of the book");
		String g=sc.next();
		h.addBook(new Book(id,t,a,g));
		}
		break;
		case 2:{
			System.out.println("Enter author name of the book");
			String author=sc.next();
			h.displayBookDetails(author);
		}
		break;
		case 3:{
			System.out.println("Enter book id");
			h.removeBook(sc.nextInt());
		}
		break;
		case 4:{
			System.out.println("Enter book id");
			h.updateBookDetails(sc.nextInt());
		}
		break;
		case 5:{
			h.bookSummary();
		}
		break;
		case 6:{
			start=false;
			System.out.println("---Thank you---");
		}
		break;
		default:{
			System.err.println("Enter valid input");
		}
		}
	}
	
		
	
}
}