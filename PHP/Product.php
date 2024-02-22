<?php
class Product {
    // Private attributes
    private $id = '';
    private $name = '';
    private $brand = '';
    private $price = -1;

    /* Constructor */ 
    public function __construct($id = 'n/a', $name = 'n/a', $brand = 'n/a', $price = -1) {
        $this->id = $id;
        $this->name = $name;
        $this->brand = $brand;
        $this->price = $price;
    }

    /* Methods */ 
    // Get methods
    public function getID() { return $this->id; }
    public function getName() { return $this->name; }
    public function getBrand() { return $this->brand; }
    public function getPrice() { return $this->price; }

    // Set methods
    public function setId($id) { $this->id = $id; }
    public function setName($name) { $this->name = $name; }
    public function setBrand($brand) { $this->brand = $brand; }
    public function setPrice($price) { $this->price = $price; }
}

?>
