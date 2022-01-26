import sys
input = sys.stdin.readline


class Stack:
    def __init__(self):
        self.stack = []

    def push(self, x):
        self.stack.append(x)

    def stack_pop(self):
        if not self.stack:
            return -1
        else:
            return self.stack.pop()

    def size(self):
        return len(self.stack)

    def empty(self):
        if not self.stack:
            return 1
        else:
            return 0

    def top(self):
        if self.stack:
            return self.stack[-1]
        else:
            return -1


T = int(input())
stack = Stack()
for _ in range(T):
    inp = input().split()
    key = inp[0]
    if key == 'push':
        stack.push(inp[1])

    elif key == 'pop':
        print(stack.stack_pop())

    elif key == 'size':
        print(stack.size())

    elif key == 'empty':
        print(stack.empty())

    elif key == 'top':
        print(stack.top())



""" input
14
push 1
push 2
top
size
empty
pop
pop
pop
size
empty
pop
push 3
empty
top
"""
