

public class Student_Information
{



    int id ;
    String name ;
    String department_name ;
    float cgpa ;


    static int NumberofStudent = 0 ;


    static String university_name = "ULAB" ;


    Student_Information ( int id , String name , String department_name ,  float cgpa )
    {
        this.id = id ;
        this.name = name ;
        this.department_name = department_name ;
        this.cgpa = cgpa ;



        NumberofStudent++ ;
    }






}
