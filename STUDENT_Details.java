// Student_Details.java
import java.util.Scanner;





public class STUDENT_Details
{



        public static void main(String[] args)
        {



            Scanner input = new Scanner(System.in);



            // Student 1
            System.out.println("Enter details for Student 1:");
            System.out.print("ID: ");
            int id1 = input.nextInt();
            input.nextLine();



            System.out.print("Name: ");
            String name1 = input.nextLine();

            System.out.print("Department: ");
            String department1 = input.nextLine();

            System.out.print("CGPA: ");
            double cgpa1 = input.nextDouble();
            input.nextLine();

            STUDENT s1 = new STUDENT  ( id1, name1, department1, cgpa1);





            // Student 2
            System.out.println("\nEnter details for Student 2:");
            System.out.print("ID: ");
            int id2 = input.nextInt();
            input.nextLine();

            System.out.print("Name: ");
            String name2 = input.nextLine();

            System.out.print("Department: ");
            String department2 = input.nextLine();

            System.out.print("CGPA: ");
            double cgpa2 = input.nextDouble();
            input.nextLine();

            STUDENT  s2 = new STUDENT   (id2, name2, department2, cgpa2);






            // Student 3
            System.out.println("\nEnter details for Student 3:");
            System.out.print("ID: ");
            int id3 = input.nextInt();
            input.nextLine();

            System.out.print("Name: ");
            String name3 = input.nextLine();

            System.out.print("Department: ");
            String department3 = input.nextLine();

            System.out.print("CGPA: ");
            double cgpa3 = input.nextDouble();

            STUDENT  s3 = new STUDENT  (id3, name3, department3, cgpa3);




            // Display student details
            System.out.println("\nStudent Details:");
            s1.display();
            s2.display();
            s3.display();





            // Display total students
            STUDENT.displayTotalStudents();




            input.close();
        }
}

