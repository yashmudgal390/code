class Factory:
    def __init__(self,material,zips,pockets):
        
        self.material=material
        self.zips=zips
        self.pockets=pockets
    def show(self):#INTENCE METHOD
        print(f"your object details are material: {self.material}, zips: {self.zips}, pockets: {self.pockets}")

    @classmethod
    def change_material(cls):
        print("this is class method")
    
    @staticmethod
    def static_method():
        print("this is static method")

reebok = Factory("leather",3,2)
reebok.show()

at = Factory('cotton',2,4)
at.show()
at.change_material()
at.show()
at.static_method()