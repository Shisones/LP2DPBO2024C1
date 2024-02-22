<?php

class Clothing extends Product {
    // Private attributes
    private $size = '';
    private $material = '';
    private $gender = '';

    /* Constructor */ 
   public function __construct($size = 'n/a', $material = 'n/a', $gender = 'n/a') {
        $this->size = $size;
        $this->material = $material;
        $this->div_material = $div_material;
    }

    /* Methods */ 
    // Get methods
    public function getSize() { return $this->size; }
    public function getMaterial() { return $this->material; }
    public function getGender() { return $this->gender; }

    // Set methods
    public function setSize($size) { $this->size = size };
    public function setMaterial($material) { $this->material = material };
    public function setGender($gender) { $this->gender = gender };
}
