<?php

require_once('Shirt.php'); // Assuming your Shirt class is in a file named Shirt.php

$shirt_list = array();

// Function to add a new Shirt object to the array
function addShirt($id, $name, $brand, $price, $size, $material, $gender, $color, $sleeve_type) {
    global $shirt_list;
    $temp = new Shirt();

    $temp->setID($id);
    $temp->setName($name);
    $temp->setBrand($brand);
    $temp->setPrice($price);
    $temp->setSize($size);
    $temp->setMaterial($material);
    $temp->setGender($gender);
    $temp->setColor($color);
    $temp->setSleeveType($sleeve_type);

    $shirt_list[] = $temp;
}

// Adding shirts to the list
addShirt(1, 'T-Shirt', 'Nike', 20.99, 'M', 'Cotton', 'Male', 'Red', 'Short Sleeve');
addShirt(2, 'Polo Shirt', 'Adidas', 30.49, 'L', 'Polyester', 'Female', 'Blue', 'Long Sleeve');
addShirt(3, 'Hoodie', 'Puma', 45.99, 'XL', 'Fleece', 'Male', 'Black', 'Long Sleeve');

?>




<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Shirt Information</title>
    <style>
        table {
            border-collapse: collapse;
            width: 70%;
            margin: 20px;
        }

        table, th, td {
            border: 1px solid black;
        }

        th, td {
            padding: 10px;
            text-align: left;
        }
    </style>
</head>
<body>

    <h1>Shirt Information</h1>

    <table>
        <thead>
            <tr>
                <th>ID</th>
                <th>Name</th>
                <th>Brand</th>
                <th>Price</th>
                <th>Size</th>
                <th>Material</th>
                <th>Gender</th>
                <th>Color</th>
                <th>Sleeve Type</th>
            </tr>
        </thead>
        <tbody>
            <?php
            // Displaying shirts in the HTML table
            foreach ($shirt_list as $shirt) {
                echo "<tr>";
                echo "<td>{$shirt->getID()}</td>";
                echo "<td>{$shirt->getName()}</td>";
                echo "<td>{$shirt->getBrand()}</td>";
                echo "<td>{$shirt->getPrice()}</td>";
                echo "<td>{$shirt->getSize()}</td>";
                echo "<td>{$shirt->getMaterial()}</td>";
                echo "<td>{$shirt->getGender()}</td>";
                echo "<td>{$shirt->getColor()}</td>";
                echo "<td>{$shirt->getSleeveType()}</td>";
                echo "</tr>";
            }
            ?>
        </tbody>
    </table>

</body>
</html>
