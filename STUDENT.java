public class STUDENT
{



    int id;
    String name;
    String department;
    double cgpa;




    // Class variables
    static String university = "ULAB";
    static int totalStudents = 0;




    // Parameterized constructor
    STUDENT (int id, String name, String department, double cgpa)
    {
        this.id = id;
        this.name = name;
        this.department = department;
        this.cgpa = cgpa;

        totalStudents++;
    }




    // Object method
    void display()
    {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("CGPA: " + cgpa);
        System.out.println("University: " + university);
        System.out.println();
    }




    // Class method
    static void displayTotalStudents()
    {
        System.out.println("Total number of students: " + totalStudents);
    }





}
