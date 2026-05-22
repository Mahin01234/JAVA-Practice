public class DataTypesComplete {
    public static void main(String[] args) {
        System.out.println("=== Java Data Types Demonstration ===\n");

        // ---------- NUMBERS ----------
        System.out.println("--- Numbers (Primitive Numeric Types) ---");

        // byte: 8-bit integer
        byte smallNumber = 100;
        System.out.println("byte (8-bit, -128 to 127): " + smallNumber);

        // short: 16-bit integer
        short mediumNumber = 30000;
        System.out.println("short (16-bit, -32,768 to 32,767): " + mediumNumber);

        // int: 32-bit integer (most common)
        int standardNumber = 2000000;
        System.out.println("int (32-bit, -2B to 2B): " + standardNumber);

        // long: 64-bit integer (requires 'L' suffix)
        long bigNumber = 9000000000L;
        System.out.println("long (64-bit, use L suffix): " + bigNumber);

        // float: 32-bit floating point (requires 'f' suffix)
        float decimalNumber = 3.14159f;
        System.out.println("float (32-bit decimal, use f suffix): " + decimalNumber);

        // double: 64-bit floating point (default for decimals)
        double preciseNumber = 99.999;
        System.out.println("double (64-bit decimal, default): " + preciseNumber);

        // ---------- BOOLEANS ----------
        System.out.println("\n--- Booleans (true/false) ---");

        boolean isJavaFun = true;
        boolean isLearningHard = false;
        System.out.println("isJavaFun? " + isJavaFun);
        System.out.println("isLearningHard? " + isLearningHard);

        // ---------- CHARACTERS ----------
        System.out.println("\n--- Characters (char) ---");

        char grade = 'A';
        char unicodeChar = '\u0041'; // 'A' in Unicode
        System.out.println("Grade: " + grade);
        System.out.println("Unicode char: " + unicodeChar);

        // ---------- REAL-LIFE EXAMPLE ----------
        System.out.println("\n--- Real-Life Example: Shopping Cart ---");

        String itemName = "Laptop";
        int quantity = 2;
        double pricePerUnit = 799.99;
        double taxRate = 0.08;  // 8% tax
        boolean inStock = true;

        double subtotal = quantity * pricePerUnit;
        double tax = subtotal * taxRate;
        double total = subtotal + tax;

        System.out.println("Item: " + itemName);
        System.out.println("Quantity: " + quantity);
        System.out.println("Price per unit: $" + pricePerUnit);
        System.out.println("In stock: " + inStock);
        System.out.println("Subtotal: $" + subtotal);
        System.out.println("Tax (8%): $" + tax);
        System.out.println("Total: $" + total);

        // ---------- NON-PRIMITIVE TYPES (Reference Types) ----------
        System.out.println("\n--- Non-Primitive Types ---");

        // String (sequence of characters)
        String greeting = "Hello, Java!";
        System.out.println("String: " + greeting);

        // Array (collection of same-type elements)
        int[] scores = {95, 87, 92, 78, 88};
        System.out.print("Array (scores): ");
        for (int score : scores) {
            System.out.print(score + " ");
        }
        System.out.println();

        // ---------- THE var KEYWORD (Java 10+) ----------
        System.out.println("\n--- The var Keyword (Type Inference) ---");

        var name = "Alice";           // Inferred as String
        var age = 25;                 // Inferred as int
        var price = 19.99;            // Inferred as double
        var isActive = true;          // Inferred as boolean

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Price: " + price);
        System.out.println("Active: " + isActive);

        // var with arrays and collections
        var numbers = new int[]{1, 2, 3, 4, 5};
        System.out.print("Numbers array: ");
        for (var num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}