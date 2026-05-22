public class Data_type 

{


    public static void main(String[] args) {
        
        // ----- Primitive Data Types -----
        
        // 1. byte (8-bit, range: -128 to 127)
        byte myByte = 100;
        System.out.println("byte value: " + myByte);
        
        // 2. short (16-bit, range: -32,768 to 32,767)
        short myShort = 30000;
        System.out.println("short value: " + myShort);
        
        // 3. int (32-bit, most common for integers)
        int myInt = 2000000;
        System.out.println("int value: " + myInt);
        
        // 4. long (64-bit, use 'L' suffix)
        long myLong = 9000000000L;
        System.out.println("long value: " + myLong);
        
        // 5. float (32-bit floating point, use 'f' suffix)
        float myFloat = 3.14159f;
        System.out.println("float value: " + myFloat);
        
        // 6. double (64-bit floating point, default for decimals)
        double myDouble = 99.999;
        System.out.println("double value: " + myDouble);
        
        // 7. char (16-bit Unicode character)
        char myChar = 'A';
        System.out.println("char value: " + myChar);
        
        // 8. boolean (true or false)
        boolean myBoolean = true;
        System.out.println("boolean value: " + myBoolean);
        
        // ----- Reference Data Types -----
        
        // String (not a primitive, but widely used)
        String myString = "Hello, Java!";
        System.out.println("String value: " + myString);
        
        // Array (reference type)
        int[] numbers = {10, 20, 30};
        System.out.println("First array element: " + numbers[0]);
    }
}
    

