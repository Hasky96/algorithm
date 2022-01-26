from collections import deque
dx = [1, 0, -1, 0, 1, 1, -1, -1]
dy = [0, 1, 0, -1, 1, -1, 1, -1]


def bfs(a, b):
    global cnt
    cnt += 1
    Q = deque([(a, b)])
    adj[a][b] = 0
    while Q:
        x, y = Q.popleft()

        for d in range(8):
            nx, ny = x + dx[d], y + dy[d]
            if 0 <= nx < h and 0 <= ny < w and adj[nx][ny] > 0 and (nx, ny) not in Q:
                Q.append((nx, ny))
                adj[nx][ny] = 0




while True:
    w, h = map(int, input().split())
    if w + h == 0:
        break
    adj = [list(map(int, input().split())) for _ in range(h)]
    cnt = 0
    for i in range(h):
        for j in range(w):
            if adj[i][j]:
                bfs(i, j)
    print(cnt)