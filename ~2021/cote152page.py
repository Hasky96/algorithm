# BFS 미로찾기
from collections import deque
N, M = tuple(map(int, input().split()))

maze = []
for _ in range(N):
    arr = []
    arr.extend(input())
    maze.append(arr)

dx = [0, 1, 0, -1]
dy = [1, 0, -1, 0]

start = (0, 0)
Q = deque([start])
maze[0][0] = 1
while Q:
    p = Q.popleft()
    x, y = p[0], p[1]
    for i in range(4):
        nx, ny = x+dx[i], y+dy[i]
        if 0 <= nx < N and 0 <= ny < M and maze[nx][ny] == '1' and (nx, ny) not in Q:
            maze[nx][ny] = maze[x][y] + 1
            Q.append((nx, ny))
print(maze[N-1][M-1])
"""
5 6
101010
111111
000001
111111
111111
"""
