import java.util.Scanner;

public class IF_ELSE 
{

    public static void main ( String[] args) 
    {
        Scanner sc = new Scanner(System.in) ;


        System.out.print("Please your age : ") ; 

        int age = sc.nextInt() ; 


        if (age >= 18) 
        {
            System.out.println ("Your are Adult") ;  
        }

        else 
        {
            System.out.println( "Your are not Adult") ; 

        }


        sc.close() ; 

        
    }
    
}
