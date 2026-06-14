
import java.util.Scanner ;





public class Book_Details
{


    public static void main(String[] args )
    {


        Scanner input = new Scanner(System.in);





        System.out.println("Enter the details for book 1 : ") ;
        System.out.println ("Title1 : ") ;
        String title1 = input.nextLine() ;
        System.out.println ("Author1 : ") ;
        String author1 = input.nextLine() ;
        System.out.println ("Year1 : ") ;
        int year1 = input.nextInt() ;
        input.nextLine();


        Book b1 = new Book(title1, author1, year1);



        System.out.println("Enter the details for book 2 :") ;
        System.out.println ("Title2 : ") ;
        String title2 = input.nextLine();
        System.out.println ("Author2 : ") ;
        String author2 = input.nextLine();
        System.out.println ("Year2 : ") ;
        int year2 = input.nextInt() ;
        input.nextLine();


        Book b2 = new Book(title2, author2, year2) ;




        System.out.println("Enter the details for book 3 : ") ;
        System.out.println ("Title3 : ") ;
        String title3 = input.nextLine() ;
        System.out.println ("Author3 : ") ;
        String author3 = input.nextLine() ;
        System.out.println ("Year3 : ") ;
        int year3 = input.nextInt() ;


        Book b3 = new Book(title3, author3, year3) ;



        System.out.println("\nBook Details:");
        b1.display();
        b2.display();
        b3.display();


        Book.book_display () ;

        input.close() ;



    }
}














