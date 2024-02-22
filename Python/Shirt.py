from Clothing import Clothing

class Shirt(Clothing):
    # Attribute declarations
    __color = ""
    __sleeve_type = ""
    
    # Constructor
    def __init__(self, color="n/a", sleeve_type="n/a"):
        self.__color = color
        self.__sleeve_type = sleeve_type
    
    # Methods

    # Get methods
    def getColor(self):
        return self.__color
    def getSleeveType(self):
        return self.__sleeve_type

    # Set methods
    def setColor(self, color):
        self.__color = color
    def setSleeveType(self, sleeve_type):
        self.__sleeve_type = sleeve_type
