import java.util.* ;

public class User_Input 
{
    

    public static void main (String[] args) 
    {

        Scanner sc  = new Scanner (System.in) ; 

        System.out.print("Enter your name : ") ; 

        String name = sc.nextLine() ; 

        System.out.println (name) ; 

        System.out.println("Hello, " + name) ;


        sc.close() ; 

    } 
}
