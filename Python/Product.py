class Product:
    # Attribute declarations
    __id = ""
    __name = ""
    __brand = ""
    __price = -1
    
    # Constructor
    def __init__(self, id="n/a", name="n/a", brand="n/a", price=-1):
        self.__id = id
        self.__name = name
        self.__brand = brand
        self.__price = price 
    
    # Methods

    # Get methods
    def getID(self):
        return self.__id
    def getName(self):
        return self.__name
    def getBrand(self):
        return self.__brand
    def getPrice(self):
        return self.__price
    
    # Set methods
    def setID(self, id):
        self.__id = id
    def setName(self, name):
        self.__name = name
    def setBrand(self, brand):
        self.__id = id
    def setPrice(self, price):
        self.__id = id
