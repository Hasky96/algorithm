# 1 1 1 2 2 3 4 5 7 9

padovan = [1] * 101
for i in range(4, 101):
    padovan[i] = padovan[i-3]+padovan[i-2]

T = int(input())
for _ in range(T):
    idx = int(input())
    print(padovan[idx])
