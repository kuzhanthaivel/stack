class Stack:
    def __init__(self):
        self.items = []

    def push(self, item):
        self.items.append(item)

    def pop(self):
        if len(self.items) == 0:
            print("Stack Underflow")
            return -1
        return self.items.pop()

    def peek(self):
        if len(self.items) == 0:
            print("Stack is Empty")
            return -1
        return self.items[-1]

if __name__ == '__main__':
    stack = Stack()
    stack.push(10)
    stack.push(20)
    stack.push(30)
    print(stack.pop()) # Output: 30
    print(stack.peek()) # Output: 20
    stack.push(40)
    print(stack.peek()) # Output: 40
