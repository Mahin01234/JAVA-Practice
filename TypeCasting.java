public class TypeCasting 
{
    


    public static void main ( String[] args) 
    {


        int maxScore = 500;


        // The actual score of the user

        int userScore = 423;



        double percentage = (double) userScore / maxScore * 100.0d;


        System.out.println("User's percentage is " + percentage);
    }
}
