from collections import deque
from pprint import pprint
dx = [1, 0, -1, 0]
dy = [0, 1, 0, -1]

def bfs(a, b):
    Q = deque([(a, b)])
    visited[a][b] = 1
    while Q:
        x, y = Q.popleft()
        for d in range(4):
            nx, ny = x + dx[d], y + dy[d]
            if 0 <= nx < N and 0 <= ny < M and maze[nx][ny] and visited[nx][ny] == 0 and (nx, ny) not in Q:
                Q.append((nx, ny))
                visited[nx][ny] = visited[x][y] + 1


N, M = map(int, input().split())

maze = [list(map(int, list(input()))) for _ in range(N)]

visited = [[0]*M for _ in range(N)]
bfs(0, 0)
print(visited[N-1][M-1])