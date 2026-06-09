

import java.util.Scanner;

public class Book 



{

    // Object Variables
    String title;
    String author;
    int year;




    // Class Variables
    static String genre = "Fiction";
    static int totalBooks = 0;





    // Parameterized Constructor
    Book(String title, String author, int year) 
    
    
    {
        this.title = title;
        this.author = author;
        this.year = year;

        totalBooks++;
    }





    // Object Method
    void displayBookDetails() 
    
    
    {
        System.out.println("\nBook Details");
        System.out.println("-------------------");
        System.out.println("Title : " + title);
        System.out.println("Author : " + author);
        System.out.println("Year : " + year);
        System.out.println("Genre : " + genre);
    }





    // Class Method
    static void displayTotalBooks() 
    
    {
        System.out.println("\nTotal Number of Books : " + totalBooks);
    }





    public static void main(String[] args) 
    
    {

        Scanner s1 = new Scanner(System.in);




        // Book 1 Input
        System.out.println("Enter the 1st Book Information");




        System.out.print("Title : ");
        String title1 = s1.nextLine();




        System.out.print("Author : ");
        String author1 = s1.nextLine();




        System.out.print("Year : ");
        int year1 = s1.nextInt();
        s1.nextLine();




        Book book1 = new Book(title1, author1, year1);




        // Book 2 Input
        System.out.println("\nEnter the 2nd Book Information");




        System.out.print("Title : ");
        String title2 = s1.nextLine();




        System.out.print("Author : ");
        String author2 = s1.nextLine();




        System.out.print("Year : ");
        int year2 = s1.nextInt();
        s1.nextLine();




        Book book2 = new Book(title2, author2, year2);




        // Book 3 Input
        System.out.println("\nEnter the 3rd Book Information");



        System.out.print("Title : ");
        String title3 = s1.nextLine();




        System.out.print("Author : ");
        String author3 = s1.nextLine();




        System.out.print("Year : ");
        int year3 = s1.nextInt();




        Book book3 = new Book(title3, author3, year3);



        // Display Book Details
        System.out.println("\n===== Book 1 Information =====");
        book1.displayBookDetails();




        System.out.println("\n===== Book 2 Information =====");
        book2.displayBookDetails();




        System.out.println("\n===== Book 3 Information =====");
        book3.displayBookDetails();




        // Display Total Books
        Book.displayTotalBooks();



        s1.close();


        
    }
}