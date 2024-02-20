#include <string> // String Library

using namespace std; // Standard namespace, glibc::std

class Product{
    private:
        // Attributes
        string id; // Product ID
        string name; // Product name
        string brand; // Product brand
        int price; // Product price

    public:
        /* Constructors */ 

        // Empty constructor
        Product(){
            this->id = "n/a";
            this->name = "n/a";
            this->brand = "n/a";
            this->price = -1;
        }
        
        // Non-empty constructor
        Product(string id, string name, string brand, int price) {
            this->id = id;
            this->name = name;
            this->brand = brand;
            this->price = price;
        }
        
        /* Methods */ 
        
        // Get Methods
        string getID() { return this->id; }
        string getName() { return this->name; }
        string getBrand() { return this->brand; }
        int getPrice() { return this->price; }
        
        // Set Methods
        void setID(string id) { this->id = id; }
        void setName(string name) { this->name = name; }
        void setBrand(string brand) { this->brand = brand; }
        void setPrice(int price) { this->price = price; }
};
