// Libraries
#include <bits/stdc++.h>
#include "Shirt.cpp"

int main() {
    vector<Shirt> shirt_list; // Vector for holding shirt obj
    bool loop = true; // Looping requirement

    cout << "Welcome to our Checkout System!\nPlease choose your action!\n [A] Add a Shirt to cart\n [S] Show your cart contents\n [D] Remove a shirt from your cart\n" << "or any other character to exit program" << endl;

    do {
        char opt;
        // Scan user input
        cout << " > ";
        cin >> opt;

        if (opt != 'A' && opt != 'S' && opt != 'D') break;
        
        if (opt == 'A'){ 
            Shirt temp;
            string id, name, brand, size, material, color, sleeve_type;
            int price;
            char gender;

            cout << "Please fill the data below : " << endl;

            cout << "Product Info > " << endl;
            cout << "ID : "; cin >> id; temp.setID(id);
            cout << "Name : "; cin >> name; temp.setName(name);
            cout << "Brand : "; cin >> brand; temp.setBrand(brand);
            cout << "Price : "; cin >> price; temp.setPrice(price);

            cout << "Clothing Info > " << endl;
            cout << "Size : "; cin >> size; temp.setSize(size);
            cout << "Material : "; cin >> material; temp.setMaterial(material);
            cout << "Gender : "; cin >> gender; temp.setGender(gender);

            cout << "Shirt Info > " << endl;
            cout << "Color : "; cin >> color; temp.setColor(color);
            cout << "Sleeve Type : "; cin >> sleeve_type; temp.setSleeveType(sleeve_type);
            
            shirt_list.push_back(temp);
        }
        else if (opt == 'S'){
            
            cout << "My Cart : " << endl;
            for (int i = 0; i < shirt_list.size(); i++) {
                cout << i+1;
                cout << "Product Info > " << endl;
                cout << "ID : " << shirt_list[i].getID() << endl;
                cout << "Name : " << shirt_list[i].getName() << endl;
                cout << "Brand : " << shirt_list[i].getBrand() << endl;
                cout << "Price : " << shirt_list[i].getPrice() << endl;

                cout << "Clothing Info > " << endl;
                cout << "Size : " << shirt_list[i].getSize() << endl;
                cout << "Material : " << shirt_list[i].getMaterial() << endl;
                cout << "Gender : " << shirt_list[i].getGender() << endl;

                cout << "Shirt Info > " << endl;
                cout << "Color : " << shirt_list[i].getColor() << endl;
                cout << "Sleeve Type : " << shirt_list[i].getSleeveType() << endl;
            }
        }
    } while (loop);
    return 0;
}
