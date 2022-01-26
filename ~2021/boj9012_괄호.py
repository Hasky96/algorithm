
T = int(input())

for _ in range(T):
    stack = []
    inp = input()
    result = 'YES'
    for char in inp:
        if char == ')':
            try:
                stack.pop()
            except IndexError:
                result = 'NO'
                break
        else:
            stack.append(char)
    else:
        if stack:
            result = 'NO'
    print(result)
