class Queue:
    def __init__(self):
        self.list = []
        self.length = 0
        
    def __str__(self):
        return str(self.list)
    
    def add(self, element):
        self.list.append(element)
        self.length += 1
    
    def offer(self, element):
        self.list.append(element)
        self.length += 1
    
    def poll(self):
        self.length -= 1
        temp = self.list[0]
        self.list.remove(self.list[0])
        return temp
    
    def peek(self):
        return self.list[0]
    
    def empty(self):
        if(self.length == 0):
            return True
        return False
    
    def search(self, element):
        if (self.list.__contains__(element)):
            return self.list.index(element)
        return -1
    
    def remove(self):
        temp = self.list[0]
        self.list.remove(self.list[0])
        return temp
    
    def size(self):
        return self.length
    
class Latihan2:
    
    queue = Queue()
    
    queue.add("Java")
    queue.add("DotNet")
    queue.offer("PHP")
    queue.offer("HTML")
    
    print(queue.remove())
    
    print("Element : ", queue)
    print(queue.poll())
    print(queue.peek())
    
    print(queue)