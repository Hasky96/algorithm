dx = [0, 1, 0, -1]
dy = [1, 0, -1, 0]

c, r = tuple(map(int, input().split()))
num = int(input())
if num > c*r:
    print(0)
else:
    arr = [[0] * r for _ in range(c)]
    key = 2
    arr[0][0] = 1
    x = 0
    y = 0
    direction = 0
    while key <= num:
        nx, ny = x + dx[direction], y + dy[direction]
        if 0 <= nx < c and 0 <= ny < r and arr[nx][ny] == 0:
            arr[nx][ny] = key
            x, y = nx, ny
            key += 1
        else:
            direction = (direction+1) % 4
    print(x+1, y+1)

"""
7 6
11
"""
