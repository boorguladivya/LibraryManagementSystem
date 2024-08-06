package org.jsp.library;

import java.util.Scanner;

public class MainLibrary 
{
   public static void main(String[] args) 
   {
	   Scanner scan =new Scanner(System.in);
	   System.out.println("------Hyderabad Library-----");
	   
	   System.out.println("Press 1 for adding book");
	   System.out.println("Press 2 for display Book details");
	   System.out.println("press 3 for remove book");
	   System.out.println("press 4 for update book");
	   System.out.println("press 5 for Book summary");
	   int inp = scan.nextInt();
	   
	   HyderabadLibrary h = new HyderabadLibrary();
	  
	  
	   switch (inp)
	   {
	       case 1: 
	       {
	    	   System.out.println("Enter Author Name");
	    	   String authorN= scan.next();
	    	   System.out.println("Enter Book Name");
	    	   String tit = scan.next();
	    	   System.out.println("Enter genre");
	    	   String genre = scan.next();
	    	   System.out.println("Enter Book ID");
	    	   int id = scan.nextInt();
	    	   h.addBook(new Book(id, tit, genre, authorN));  
	    	   break;
	       }
	       case 2:
	       {
	    	   System.out.println("Enter author Name");
	    	   String authorN=scan.next();
	    	   h.displayBookDetails(authorN);
	    	   break;
	       }
	       case 3:
	       {
	    	   System.out.println("Enter Book Id");
	    	   int id = scan.nextInt();
	    	   h.removeBook(id);
	    	   break;
	       }
	       case 4:
	       {
	    	   System.out.println("Enter Book Id");
	    	   int id = scan.nextInt();
	    	   h.updateBookDetails(id);
	    	   break;
	       }
	       case 5:
	       {
	    	   h.bookSummary();
	    	   
	    	   break;
	       }
	       case 6:
	       {
	    	   
	       }

	   }
	   
	  
	  
   }
}
