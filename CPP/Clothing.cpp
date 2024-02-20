#include <string> // String Library
#include "Product.cpp"

using namespace std; // Standard namespace, glibc::std

class Clothing : public Product {
    private:
        // Attributes
        string size; // Clothing Size
        string material; // Clothing material
        char gender; // Clothing gender

    public:
        /* Constructors */ 

        // Empty constructor
        Clothing(){
            this->size = "n/a";
            this->material = "n/a";
            this->gender = '-';
        }
        
        // Non-empty constructor
        Clothing(string size, string material, char gender) {
            this->size = size;
            this->material = material;
            this->gender = gender;
        }
        
        /* Methods */ 
        
        // Get Methods
        string getSize() { return this->size; }
        string getMaterial() { return this->material; }
        char getGender() { return this->gender; }
        
        // Set Methods
        void setSize(string size) { this->size = size; }
        void setMaterial(string material) { this->material = material; }
        void setGender(char gender) { this->gender = gender; }
};
