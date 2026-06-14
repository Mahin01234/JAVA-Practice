public class Static

{

    //  Instance variables
    String  Name ;
    int  id ;

    // Static ba class variable
    static String universityName = "ULAB" ;



    // local variable
    Static(String N , int d)
    {
        Name = N ;

        id = d ;

    }

    void display()
    {

        System.out.println("Student Name is : " + Name) ;

        System.out.println("Student ID is : " + id) ;

        System.out.println("Student University name is : " + universityName )   ;


        System.out.println( );

    }
}
