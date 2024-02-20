#include <string> // String Library
#include "Clothing.cpp"

using namespace std; // Standard namespace, glibc::std

class Shirt : public Product {
    private:
        // Attributes
        string color; // Shirt color
        string sleeve_type; // Shirt sleeve_type

    public:
        /* Constructors */ 

        // Empty constructor
        Shirt(){
            this->color = "n/a";
            this->sleeve_type = "n/a";
        }
        
        // Non-empty constructor
        Shirt(string color, string sleeve_type) {
            this->color = color;
            this->sleeve_type = sleeve_type;
        }
        
        /* Methods */ 
        
        // Get Methods
        string getColor() { return this->color; }
        string getSleeve_type() { return this->sleeve_type; }
        
        // Set Methods
        void setColor(string color) { this->color = color; }
        void setSleeve_type(string sleeve_type) { this->sleeve_type = sleeve_type; }
};
