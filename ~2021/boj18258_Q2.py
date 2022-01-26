import sys
input = sys.stdin.readline

# list.pop(0) -> O(N) // list.pop() -> O(1)
class Q:
    def __init__(self, n):
        self.Q = [0] * n
        self.st = 0
        self.en = -1

    def push(self, x):
        self.en += 1
        self.Q[self.en] = x

    def pop(self):
        if self.st <= self.en:
            self.st += 1
            return self.Q[self.st-1]
        else:
            return -1

    def size(self):
        return self.en - self.st + 1

    def empty(self):
        return int(self.st > self.en)

    def front(self):
        if self.st <= self.en:
            return self.Q[self.st]
        else:
            return -1

    def back(self):
        if self.st <= self.en:
            return self.Q[self.en]
        else:
            return -1

N = int(input())
q = Q(N)
for _ in range(N):
    inp = input()
    if 'push' in inp:
        q.push(inp.split()[1])
    elif 'pop' in inp:
        print(q.pop())
    elif 'size' in inp:
        print(q.size())
    elif 'empty' in inp:
        print(q.empty())
    elif 'front' in inp:
        print(q.front())
    elif 'back' in inp:
        print(q.back())