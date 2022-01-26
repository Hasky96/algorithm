from collections import deque

inp = list(map(int, input().split()))
bottles = [0, 0, inp[2]]
visited = [[[0] * (inp[2]+1) for _ in range(inp[1]+1)] for _ in range(inp[0]+1)]
visited[0][0][inp[2]] = 1

def p(bot, f, t):
    if bot[f] == 0 or bot[t] == inp[t]:
        return False
    bt, bf = bot[t], bot[f]
    bot[t] += bot[f]
    bot[f] = 0
    if bot[t] > inp[t]:
        bot[f] = bot[t]-inp[t]
        bot[t] = inp[t]

    if visited[bot[0]][bot[1]][bot[2]] == 0:
        print(bot)
        visited[bot[0]][bot[1]][bot[2]] = 1
        return bot
    else:
        bot[t] = bt
        bot[f] = bf
        return False

def dfs(a):
    if not a:
        return
    bot = a
    for i in range(3):
        for j in range(3):
            if i == j: continue
            dfs(p(bot, i, j))



dfs([0, 0, 10])
arr = []
for i in range(inp[1]+1):
    for j in range(inp[2]+1):
        if visited[0][i][j]:
            arr.append(j)
print(*sorted(set(arr)))
# 1 -> 2
# 1 -> 3
# 2 -> 1
# 2 -> 3
# 3 -> 2
# 3 -> 1
