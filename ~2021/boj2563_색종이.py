
N = int(input())

arr = [[0]*100 for _ in range(100)]
for _ in range(N):
    a, b = tuple(map(int, input().split()))
    for i in range(a, a + 10):
        for j in range(b, b + 10):
            arr[i][j] = 1

total = 0
for i in range(100):
    for j in range(100):
        if arr[i][j]:
            total += 1
print(total)

""" Input
3
3 7
15 7
5 2
"""
# Output 260
