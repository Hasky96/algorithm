
path = []

def dfs(level):
    if level == M:
        for i in path:
            print(i, end=' ')
        print()
    for j in range(1, N+1):
        if not used[j]:
            used[j] = 1
            path.append(j)
            dfs(level+1)
            path.pop()
            used[j] = 0

N, M = map(int, input().split())

used = [0] * (N+1)
dfs(0)
