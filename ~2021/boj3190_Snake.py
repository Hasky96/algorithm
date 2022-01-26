# Snake
import deque


# 2 <= N <= 100 Board Size
N = int(input())
# apple 0 <= K <= 100
K = int(input())

board = [[0] * N for _ in range(N)]

# apple set
for _ in range(K):
    x, y = tuple(map(int, input().split()))

    board[x-1][y-1] = 1


# direction change
C = int(input())

d_list = [(10000, 10000)] * (C+1)
for i in range(C, 0, -1):
    d_list[i] = tuple(input().split())

dx = [0, 1, 0, -1]
dy = [1, 0, -1, 0]
direction = 0

# Snake position
head = (0, 0)
tail = (0, 0)

time = 0
# D : 오른쪽 +1 L : 왼쪽 -1
board[0][0] = 2
tail_Q = []
while d_list:
    t = d_list.pop()
    while True:
        if time > int(t[0]):
            break
        head = (head[0]+dx[direction], head[1]+dy[direction])
        # 머리 움직임
        try:  # 벽에 부딪히면 Index Error -> Except
            # 자기 몸에 부딪혔을때
            if head[0] < 0 or head[1] < 0:
                print(time-1)
                exit()
            elif board[head[0]][head[1]] == 2:
                print(time)
                exit()
            # 아닐때
            else:
                if board[head[0]][head[1]] == 1:
                    board[head[0]][head[1]] = 2
                else:
                    board[head[0]][head[1]] = 2
                    # 꼬리현재위치
                    board[tail[0]][tail[1]] = 0
                    for j in range(4):
                        try:
                            if tail[0] < 0 or tail[1] < 0:
                                continue
                            elif board[tail[0] + dx[j]][tail[1] + dy[j]] == 2:
                                tail = (tail[0] + dx[j], tail[1] + dy[j])
                                break
                        except IndexError:
                            continue
        except IndexError:
            print(time)
            exit()
        time += 1
    if t[1] == 'D':
        direction = (direction+1) % 4
    else:
        direction = (direction+3) % 4
# print(time-1)
"""
6
3
3 4
2 5
5 3
1
1 D
15 L
17 D
"""



