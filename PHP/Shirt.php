<?php

class Shirt extends Clothing {
    // Private attributes
    private $color = '';
    private $sleeve_type = '';

    /* Constructor */ 
   public function __construct($color = 'n/a', $sleeve_type = 'n/a') {
        $this->color = $color;
        $this->sleeve_type = $sleeve_type;
    }

    /* Methods */ 
    // Get methods
    public function getColor() { return $this->color; }
    public function getSleeveType() { return $this->sleeve_type; }

    // Set methods
    public function setColor($color) { $this->color = color };
    public function setSleeveType($sleeve_type) { $this->sleeve_type = sleeve_type };
}
