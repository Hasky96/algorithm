dx = [1, 0, -1, 0]
dy = [0, 1, 0, -1]


def check(x, y):
    global cnt
    for d in range(4):
        nx = x
        ny = y
        while True:
            nx += dx[d]
            ny += dy[d]
            if nx < 0 or nx >= N or ny < 0 or ny >= N or school[nx][ny] == 'O' or school[nx][ny] == 'T':
                break
            elif school[nx][ny] == 'S':
                cnt += 1
                break


N = int(input())

arr = ''

for _ in range(N):
    arr += input()+' '
arr = arr.split()


for i in range(len(arr)-2):
    if arr[i] != 'X':
        continue
    arr[i] = 'O'
    for j in range(i+1, len(arr)-1):
        if arr[j] != 'X':
            continue
        arr[j] = 'O'
        for k in range(j+1, len(arr)):
            if arr[k] != 'X':
                continue
            arr[k] = 'O'

            school = [0] * N
            for n in range(N):
                school[n] = arr[N*n:N*n+N]
            cnt = 0
            for r in range(N):
                for c in range(N):
                    if school[r][c] == 'T':
                        check(r, c)
            if cnt == 0:
                print('YES')
                exit()
            arr[k] = 'X'
        arr[j] = 'X'
    arr[i] = 'X'
print('NO')
