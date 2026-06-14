


public class wrapper
{
    public static void main (String[] args   )
    {
        int x = 50 ;

        System.out.println("Convert the Primitive into Object : ") ;

        // Primitive -> Object
        Integer Y = Integer.valueOf (x) ;


        // OR
        Integer Z = x ;

        System.out.println("Y : " + x ) ;

        System.out.println("Z : " + x ) ;



        System.out.println("\n") ;



        System.out.println("Convert the Object into Primitive : ") ;

        Double d = new Double(10.77) ;
        System.out.println("D : " +d) ;



        double e = d  ;

        System.out.println("E : " + e ) ;



    }
}