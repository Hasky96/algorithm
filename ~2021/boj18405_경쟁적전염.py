import sys
from collections import deque
input = sys.stdin.readline

dx = [0, 1, 0, -1]
dy = [1, 0, -1, 0]

N, K = tuple(map(int, input().split()))
pallet = []

is_stop = False
ans = []
for _ in range(N):
    arr = []
    arr.extend(list(map(int, input().split())))
    pallet.append(arr)
s, x, y = tuple(map(int, input().split()))
if pallet[x-1][y-1]:
    print(pallet[x-1][y-1])
    exit()
visited = [[0]*N for _ in range(N)]
visited[x-1][y-1] = 1
Q = deque([(x-1, y-1)])
while Q:
    t = Q.popleft()
    i, j = t[0], t[1]
    for d in range(4):
        nx, ny = i+dx[d], j+dy[d]
        if 0 <= nx < N and 0 <= ny < N and not visited[nx][ny]:
            Q.append((nx, ny))
            visited[nx][ny] = visited[i][j]+1

for second in range(2, s+2):
    ans = []
    for q in range(N):
        for w in range(N):
            if visited[q][w] == second and pallet[q][w]:
                ans.append(pallet[q][w])
    if ans:
        break
print(min(ans) if ans else 0)



