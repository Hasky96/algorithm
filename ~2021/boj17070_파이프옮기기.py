# 함수로 이동 구현하니 시간초과남 stack하는 과정에서 시간소요 예상
# right = 0 , cross = 1 , down = 2


def dfs(a, b, status):
    global cnt
    if a == N-1 and b == N-1:
        cnt += 1
    else:
        if status == 0:
            if 0 <= b + 1 < N and house[a][b + 1] == 0:
                nx, ny = a, b + 1
                dfs(nx, ny, 0)
            if 0 <= a+1 < N and 0 <= b+1 < N and house[a][b+1] == 0 and house[a+1][b+1] == 0 and house[a+1][b] == 0:
                nx, ny = a+1, b+1
                dfs(nx, ny, 1)
        elif status == 1:
            if 0 <= b + 1 < N and house[a][b + 1] == 0:
                nx, ny = a, b + 1
                dfs(nx, ny, 0)
            if 0 <= a + 1 < N and 0 <= b + 1 < N and house[a][b + 1] == 0 and\
                    house[a + 1][b + 1] == 0 and house[a + 1][b] == 0:
                nx, ny = a + 1, b + 1
                dfs(nx, ny, 1)
            if 0 <= a + 1 < N and house[a + 1][b] == 0:
                nx, ny = a+1, b
                dfs(nx, ny, 2)
        elif status == 2:
            if 0 <= a + 1 < N and 0 <= b + 1 < N and house[a][b + 1] == 0 and \
                    house[a + 1][b + 1] == 0 and house[a + 1][b] == 0:
                nx, ny = a + 1, b + 1
                dfs(nx, ny, 1)
            if 0 <= a + 1 < N and house[a + 1][b] == 0:
                nx, ny = a + 1, b
                dfs(nx, ny, 2)


N = int(input())
end_point = (N-1, N-1)
house = [list(map(int, input().split())) for _ in range(N)]
cnt = 0
dfs(0, 1, 0)
print(cnt)
