
T = int(input())
for _ in range(T):
    M, N, K = list(map(int, input().split()))

    field = [[0]*M for _ in range(N)]

    for _ in range(K):
        l, c = tuple(map(int, input().split()))
        field[c][l] = 1

    dx = [0, 1, 0, -1]
    dy = [1, 0, -1, 0]


    def find(x, y):
        for d in range(4):
            nx = x + dx[d]
            ny = y + dy[d]
            if 0 <= nx < N and 0 <= ny < M and field[nx][ny]:
                field[nx][ny] = 0
                find(nx, ny)


    cnt = 0
    for i in range(N):
        for j in range(M):
            if field[i][j]:
                cnt += 1
                find(i, j)
    print(cnt)
