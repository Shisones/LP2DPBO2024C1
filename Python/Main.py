from Shirt import Shirt # Import Shirt class 

shirt_list = [] # Vector for holding shirt obj
loop = True # Looping requirement

print("Welcome to our Checkout System!\nPlease choose your action!\n [A] Add a Shirt to cart\n [S] Show your cart contents\n [D] Remove a shirt from your cart\nor any other character to exit program")
while(loop):

    opt = input(" > ")[0];

    if opt != 'A' and opt != 'S':
        break;

    if opt == 'A':
        temp = Shirt()

        print("Please fill the data below : ")

        print("Product Info > ")
        id = input("ID : ") 
        name = input("Name : ") 
        brand = input("Brand : ") 
        price = int(input("Price : ")) 
        
    
        print("Clothing Info > ")
        size = input("Size : ") 
        material = input("Material : ") 
        gender = input("Gender : ")[0]

        print("Product Info > ")
        color = input("Color : ") 
        sleeve_type = input("Sleeve Type : ")
        
        temp.setID(id)
        temp.setName(name)
        temp.setBrand(brand)
        temp.setPrice(price)
        temp.setSize(size)
        temp.setMaterial(material)
        temp.setGender(gender)
        temp.setColor(color)
        temp.setSleeveType(sleeve_type)

        shirt_list.append(temp)
    if opt == 'S':
        
        idx = 1;

        for obj in shirt_list:
            print("My Cart :")
            
            print(f"{idx}")
            print("Product Info >")
            print(f"ID : {obj.getID()}")
            print(f"Name : {obj.getName()}")
            print(f"Brand : {obj.getBrand()}")
            print(f"Price : {obj.getPrice()}")

            print("Clothing Info >")
            print(f"Size : {obj.getSize()}")
            print(f"Material : {obj.getMaterial()}")
            print(f"Gender : {obj.getGender()}")

            print("Shirt Info >")
            print(f"Color : {obj.getColor()}")
            print(f"Sleeve Type : {obj.getSleeveType()}")

            idx+=1
