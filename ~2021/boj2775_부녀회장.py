T = int(input())
for _ in range(T):
    k = int(input())
    n = int(input())

    floor = [list(range(1, 15))]
    for j in range(1, 15):
        floor.append([1]*14)
        for i in range(1, 14):
            floor[j][i] = floor[j-1][i]+floor[j][i-1]
    print(floor[k][n-1])
