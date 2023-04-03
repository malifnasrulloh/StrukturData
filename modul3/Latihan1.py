class Stack:
    def __init__(self):
        self.list = []
        self.length = 0
        
    def __str__(self):
        return str(self.list)
    
    def push(self, element):
        self.list.insert(0, element)
        self.length += 1
    
    def pop(self):
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
    
    def size(self):
        return self.length

class Latihan1:

    st = Stack()
    
    st.push("Aku")
    st.push("Anak")
    st.push("Indonesia")
    
    
    print("Next : " + st.peek())
    st.push("Raya")
    print(st.pop())
    st.push("!")
    
    count = st.search("Aku")
    while (count != -1) and (count > 1):
        st.pop()
        count -= 1
    
    print(st.pop())
    print(st.empty())
    
    
    
    
    
