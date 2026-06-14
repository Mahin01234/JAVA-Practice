



public class Book
{

    String title , author ;
    int year ;

    static String genre = "Fiction" ;
    static int total_book = 0 ;



    Book (String T , String A , int Y )
    {
        title = T ;
        author = A ;
        year = Y ;


        this.author = author  ;
        this.title = title ;
        this.year = year ;



        total_book++ ;


    }



    void display()
    {
        System.out.println("The Title is : " + title ) ;

        System.out.println("The Author is : " + author ) ;

        System.out.println("The Genre is : " + genre ) ;

        System.out.println("Year is : " + year ) ;


        System.out.println() ;

    }




    static void book_display ()
    {

        System.out.println("Total number of books : " + total_book  ) ;
    }





}

