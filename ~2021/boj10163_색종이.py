
floor = [[0]*1002 for _ in range(1002)]

paper = int(input())
total = [0] * (paper+1)
for p in range(1, paper+1):
    loc = tuple(map(int, input().split()))
    for i in range(loc[0], loc[0]+loc[2]):
        for j in range(loc[1], loc[1]+loc[3]):
            if floor[i][j]:
                total[floor[i][j]] -= 1
            floor[i][j] = p
            total[p] += 1

for i in range(1, paper+1):
    print(total[i])