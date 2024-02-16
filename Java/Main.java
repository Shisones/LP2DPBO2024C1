package Java;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Shirt> shirt_list = new ArrayList<>();
        boolean loopValid = true;

        Scanner input = new Scanner(System.in);

        System.out.println(
            "Please Input [A] to add a new Shirt or [S] to show currently added shirts"
        );
        System.out.println("or any other character to exit program.");
        
        char opt;
        while (loopValid){
            System.out.print(" > ");
            opt = input.next().charAt(0);
            if (opt != 'A' && opt != 'S') break;
            
            if (opt == 'A'){
                Shirt temp = new Shirt();
                
                System.out.println("Product Info");
                System.out.print(" ID Product > "); temp.id_product = input.next();
                System.out.print(" Name > "); temp.name = input.next();
                System.out.print(" Brand > "); temp.brand = input.next();
                System.out.print(" Price > "); temp.price = input.nextInt();
                
                System.out.println("Clothing Info");
                System.out.print(" Size > "); temp.size = input.next();
                System.out.print(" Material > "); temp.material = input.next();
                System.out.print(" Gender > "); temp.gender = input.next().charAt(0);
                
                System.out.println("Shirt Info");
                System.out.print(" Color > "); temp.color = input.next();
                System.out.print(" Sleeve Type > "); temp.sleeve_type = input.next().charAt(0);

                shirt_list.add(temp);
            } else if (opt == 'S') {
                for (int i = 0; i < shirt_list.size(); i++){
                    Shirt temp = shirt_list.get(i);

                    System.out.println("Product Info");
                    System.out.println(String.format(" ID Product : %s ", temp.id_product));
                    System.out.println(String.format(" Name : %s ", temp.name));
                    System.out.println(String.format(" Brand : %s ", temp.brand));
                    System.out.println(String.format(" Price : %s ", temp.price));
                    
                    System.out.println("Clothing Info");
                    System.out.println(String.format(" Size : %s ", temp.size));
                    System.out.println(String.format(" Material : %s ", temp.material));
                    System.out.println(String.format(" Gender : %s ", temp.gender));
                    
                    System.out.println("Shirt Info");
                    System.out.println(String.format(" Color : %s ", temp.color));
                    System.out.println(String.format(" Sleeve Type : %s ", temp.sleeve_type));
                } 
            }
            System.out.println();
        }
        

        
    }
}
