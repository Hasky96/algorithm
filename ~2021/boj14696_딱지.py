
T = int(input())
for _ in range(T):
    A = list(map(int, input().split()))[1:]
    B = list(map(int, input().split()))[1:]
    A.sort()
    B.sort()
    for _ in range(min(len(A), len(B))):
        a = A.pop()
        b = B.pop()
        if a > b:
            print('A')
            break
        elif a < b:
            print('B')
            break
    else:
        a = len(A)
        b = len(B)
        if a > b:
            print('A')
        elif a < b:
            print('B')
        else:
            print('D')

