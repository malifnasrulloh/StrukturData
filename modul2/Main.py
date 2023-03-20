class ArrayList:
    def __init__(self):
        self.array = []
        self.length = 0

    def _len_(self):
        return self.length

    def _getitem_(self, index):
        if index >= self.length:
            raise IndexError('Index out of bound')
        return self.array[index]
        
    def _setitem_(self, index, value):
        if index >= self.length:
            raise IndexError('Index out of bound')
        self.array[index] = value

    def append(self, value):
        self.array.append(value)
        self.length += 1

    def insert(self, index, value):
        if index >= self.length:
            raise IndexError('Index out of bound')
        self.array.insert(index, value)
        self.length +=1
    
    def remove(self, value):
        self.array.remove(value)
        self.length -= 1

    def pop(self, index =- 1):
        value = self.array.pop(index)
        self.length -= 1
        return value

    def index(self, value):
        return self.array.index(value)
    
    def clear(self):
        self.array.clear()
        self.length = 0

    def print(self):
        len = self.length
        print("[", end=" ")
        for a in range(len):
            print(self._getitem_(a) + " ", end=" ")
        print("]")

    def removeAll(self, ArrayList):
        for a in range(ArrayList.length):
            self.remove(ArrayList._getitem_(a))


class Main:
    Hewan = ArrayList()
    DeleteHewan = ArrayList()

    Hewan.append("Sapi")
    Hewan.append("Kelinci")
    Hewan.append("Kambing")
    Hewan.append("Unta")
    Hewan.append("Domba")

    DeleteHewan.append("Kelinci")
    DeleteHewan.append("Kambing")
    DeleteHewan.append("Unta")
    
    print("Hewan              : ", end = " ")
    Hewan.print()

    print("Hewan yang dihapus : ", end = " ")
    DeleteHewan.print()

    Hewan.removeAll(DeleteHewan)
    print("Output Hewan       : ", end = " ")
    Hewan.print()

    
