class Factory:
    def __init__(self,material,zips):
        self.material=material
        self.zips=zips
class BophalFactory(Factory):
        def __init__(self, material, zips,color):
             super().__init__(material, zips)
             self.color=color
class puneFactory(BophalFactory):
        def __init__(self, material, zips,color, pockets):
             super().__init__(material, zips,color)
             self.pockets=pockets
        def show(self):
            print(f"your object details are material: {self.material}, zips: {self.zips}, color: {self.color}, pockets: {self.pockets}")

pune= puneFactory("leather",3,"red",2)
pune.show()