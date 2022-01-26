# 그대, 그머가 되어
from collections import deque
a, b = map(int, input().split())
N, M = map(int, input().split())

arr = [[] for _ in range(N+1)]

for i in range(M):
    f, t = map(int,  input().split())
    arr[f].append(t)  # 갈수있는지?
    arr[t].append(f)

used = [0]*(N+1)
used[a] = 1
Q = deque([a])
while Q:
    now = Q.popleft()
    for i in arr[now]:
        if not used[i] and now not in Q:
            Q.append(i)
            used[i] = used[now] + 1

if not used[b]:
    print(-1)
else:
    print(used[b] - 1)
#a-b-c-d 답 -> 다익스트라  연산량이 작으면 dfs
#a-b-c  경로이동값이 다 1 이기때문에 bfs 만약에 다르다면?
# 다익스트라..