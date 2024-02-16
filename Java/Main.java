package Java; // Java package for compilation

// Required libraries
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Declaration of main variables
        ArrayList<Shirt> shirt_list = new ArrayList<>(); // New instance of an ArrayList
        boolean loopValid = true; // Variable to stop main loop

        Scanner input = new Scanner(System.in); // Input variable for CLI

        System.out.println(
            "Welcome to our Checkout System!\nPlease choose your action!\n [A] Add a Shirt to cart\n [S] Show your cart contents\n [D] Remove a shirt from your cart\n"
        );
        System.out.println("or any other character to exit program.");
        
        char opt; // Variables to hold user option
        while (loopValid){ // Main loop
            System.out.print(" > ");
            // Check user input and make sure it's valid
            opt = input.next().charAt(0);
            if (opt != 'A' && opt != 'S' && opt != 'D') break;
            
            if (opt == 'A'){ // Condition where user chooses Add
                Shirt temp = new Shirt(); // New instance of Shirt
                System.out.println("Please fill the data below : ");

                System.out.println("Product Info >");
                System.out.print("ID : "); temp.setID(input.next());
                System.out.print("Name : "); temp.setName(input.next());
                System.out.print("Brand : "); temp.setBrand(input.next());
                System.out.print("Price : "); temp.setPrice(input.nextInt());

                System.out.println("Clothing Info >");
                System.out.print("Size : "); temp.setSize(input.next());
                System.out.print("Material : "); temp.setMaterial(input.next());
                System.out.print("Gender : "); temp.setGender(input.next().charAt(0));

                System.out.println("Shirt Info >");
                System.out.print("Color : "); temp.setColor(input.next());
                System.out.print("Sleeve Type : "); temp.setSleeveType(input.next());
                
                shirt_list.add(temp);
            }
            else if (opt == 'S') { // Condition where user chooses Show
                System.out.println("My Cart :\n");
                for (int i = 0; i < shirt_list.size(); i++){
                    Shirt temp = shirt_list.get(i);
                    System.out.println(String.format("%d", i+1));
                    System.out.println("Product Info >");
                    System.out.println(String.format("ID : %s", temp.getID()));
                    System.out.println(String.format("Name : %s", temp.getName()));
                    System.out.println(String.format("Brand : %s", temp.getBrand()));
                    System.out.println(String.format("Price : %d", temp.getPrice()));

                    System.out.println("Clothing Info >");
                    System.out.println(String.format("Size : %s", temp.getSize()));
                    System.out.println(String.format("Material : %s", temp.getMaterial()));
                    System.out.println(String.format("Gender : %c", temp.getGender()));

                    System.out.println("Shirt Info >");
                    System.out.println(String.format("Color : %s", temp.getColor())); 
                    System.out.println(String.format("Sleeve Type : %s", temp.getSleeveType()));
                }
            }
            else if (opt == 'D') { // Condition where user chooses Delete
                System.out.println("Choose which Product to delete");
                int del = input.nextInt();
                shirt_list.remove(del-1);
            }
            
            System.out.println();
        }
        

        
    }
}
