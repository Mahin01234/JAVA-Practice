import java.util.Scanner ;



public class Student_Information_Details
{


    public static void main ( String[] args )
    {

        Scanner s1  = new Scanner( System.in ) ;



        System.out.println("Enter your id : ") ;
        int id = s1.nextInt() ;
        s1.nextLine() ;




        System.out.println("Enter your name : ") ;
        String name = s1.nextLine()  ;





        System.out.println("Enter your department name : ") ;
        String department_name = s1.nextLine() ;





        System.out.println("Enter your CGPA : ") ;
        float cgpa = s1.nextFloat()  ;





        Student_Information s2 = new Student_Information( id , name  , department_name , cgpa ) ;





        System.out.println("ID: " + id)   ;
        System.out.println("Name: " + name)   ;
        System.out.println("Department: " + department_name  )  ;
        System.out.println("CGPA: " + cgpa)  ;
        System.out.println("University: " + Student_Information.university_name) ;






        s1.close() ;



    }
}
