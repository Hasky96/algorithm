floor = [[0]*101 for _ in range(101)]
for _ in range(4):
    loc = tuple(map(int, input().split()))
    for i in range(loc[0], loc[2]):
        for j in range(loc[1], loc[3]):
            floor[i][j] = 1

total = 0
for i in range(101):
    for j in range(101):
        if floor[i][j]:
            total += 1
print(total)
