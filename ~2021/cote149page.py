# BFS 영역의 갯수 확인하기
N, M = tuple(map(int, input().split()))

ice_maker =[]
# up right down left
dx = [-1, 0, 1, 0]
dy = [0, 1, 0, -1]

for _ in range(N):
    arr = []
    arr.extend(input())
    ice_maker.append(arr)


def check(start):
    x, y = start[0], start[1]
    ice_maker[x][y] = 1
    # 4 방향 탐색
    for idx in range(4):
        nx, ny = x + dx[idx], y + dy[idx]
        if 0 <= nx < N and 0 <= ny < M and ice_maker[nx][ny] == '0':
            check((nx, ny))


cnt = 0
for i in range(N):
    for j in range(M):
        if ice_maker[i][j] == '0':
            cnt += 1
            check((i, j))
print(cnt)
"""
3 3
001
010
101
"""


