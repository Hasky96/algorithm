# 연구소
# BFS 전부 확인해보자
# 3 <= N, M <= 8
# 0 : space, 1 : wall, 3 : virus
import sys
input = sys.stdin.readline
dx = [0, 1, 0, -1]
dy = [1, 0, -1, 0]


def virus(p):
    x, y = p[0], p[1]
    for d in range(4):
        nx, ny = x+dx[d], y+dy[d]
        if 0 <= nx < N and 0 <= ny < M and laboratory[nx][ny] == 0:
            laboratory[nx][ny] = 2
            virus((nx, ny))


def find_safe():
    cnt = 0
    for line in laboratory:
        cnt += line.count(0)
    return cnt


N, M = tuple(map(int, input().split()))
lab = []

for _ in range(N):
    lab.extend(list(map(int, input().split())))
<<<<<<< HEAD
print(lab)
=======

>>>>>>> 77865bbd3b5e2f570cea88771e45f691bb16104f
# 2차원 배열에 3개의 벽을 놓는 경우의 수 벽을 i j k 라 생각하자
maximum = 0
for i in range(len(lab)-2):
    if lab[i] == 0:
        lab[i] = 1
    else:
        continue
    for j in range(i, len(lab)-1):
        if lab[j] == 0:
            lab[j] = 1
        else:
            continue
        for k in range(j, len(lab)):
            if lab[k] == 0:
                lab[k] = 1
            else:
                continue
            # 벽이생긴 연구실 확인
            laboratory = []
            for idx in range(N):
                arr = lab[idx*M:idx*M+M]
                laboratory.append(arr)
            for jdx in range(N):
                for kdx in range(M):
                    if laboratory[jdx][kdx] == 2:
                        virus((jdx, kdx))
            safe = find_safe()
            if maximum < safe:
                maximum = safe
            lab[k] = 0
        lab[j] = 0
    lab[i] = 0
print(maximum)
