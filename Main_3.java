import java.util.Scanner;

class Product {

    public static void main(String[] args) {

        // Create Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Declare variables
        int id;
        String title;
        double price;
        String description;
        String category;

        // Get user input
        System.out.print("Enter Product ID: ");
        id = input.nextInt();
        input.nextLine(); // consume newline

        System.out.print("Enter Product Title: ");
        title = input.nextLine();

        System.out.print("Enter Product Price: ");
        price = input.nextDouble();
        input.nextLine(); // consume newline

        System.out.print("Enter Product Description: ");
        description = input.nextLine();

        System.out.print("Enter Product Category: ");
        category = input.nextLine();

        // Print the variables
        System.out.println("\n--- Product Details ---");
        System.out.println("ID: " + id);
        System.out.println("Title: " + title);
        System.out.println("Price: " + price);
        System.out.println("Description: " + description);
        System.out.println("Category: " + category);

        input.close();
    }
}
