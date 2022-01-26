# DFS
def dfs(n, start, li):
    dfs_ans = [start]
    visited = [0]*(n+1)
    stack = [start]
    visited[start] = 1
    while sum(visited) != n:
        for i in range(1, n+1):
            if li[start][i] and not visited[i]:
                visited[i] = 1
                stack.append(start)
                start = i
                if i not in dfs_ans:
                    dfs_ans.append(i)
                break
        else:
            try:
                start = stack.pop()
            except IndexError:
                break
    return dfs_ans


def bfs(n, start, li):
    bfs_ans = []
    queue = [start]
    visited = [0]*(n+1)
    visited[start] = 1
    while queue:
        start = queue.pop(0)
        bfs_ans.append(start)
        for i in range(1, n+1):
            if li[start][i] and not visited[i] and i not in queue:
                visited[i] = 1
                queue.append(i)
    return bfs_ans


def li2str(li):
    string = ''
    for num in li:
        string += str(num) + ' '
    return string


# 정점, 간선, 시작점
N, M, V = tuple(map(int, input().split()))

# 간선방향저장할 LIST
lines = [[0]*(N+1) for _ in range(N+1)]

# 간선저장 -> 양방향
for _ in range(M):
    st, en = tuple(map(int, input().split()))
    # 양방향
    lines[st][en] = 1
    lines[en][st] = 1

print(li2str(dfs(N, V, lines)))#[]
print(li2str(bfs(N, V, lines)))

