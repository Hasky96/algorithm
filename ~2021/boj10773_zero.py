
T = int(input())

stack = []
for _ in range(T):
    value = int(input())
    if not value:
        stack.pop()
    else:
        stack.append(value)

print(sum(stack))
