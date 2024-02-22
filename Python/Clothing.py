from Product import Product

class Clothing(Product):
    # Attribute declarations
    __size = ""
    __material = ""
    __gender = ''
    
    # Constructor
    def __init__(self, size="n/a", material="n/a", gender="n/a"):
        self.__size = size
        self.__material = material
        self.__gender = gender
    
    # Methods

    # Get methods
    def getSize(self):
        return self.__size
    def getMaterial(self):
        return self.__material
    def getGender(self):
        return self.__gender

    # Set methods
    def setSize(self, size):
        self.__size = size
    def setMaterial(self, material):
        self.__material = material
    def setGender(self, gender):
        self.__gender = gender
