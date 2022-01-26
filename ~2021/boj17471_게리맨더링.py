"""
# if 6 -> 1,5 / 2,4 / 3,3  1,5 / 2,4 / 3,3

1. 구역을 나눈다?
2. 구역나눈게 맞게 나눈건지? 인접하는지?
dfs bfs -> 갈수있는 위치 배열 -> 갈수 있는 이동시켜본다. 이동한 횟수 -> 구역의 구역수
3. 나눈 구역에 몇명이 있는지?
[1, 2]
"""
from collections import deque


def bfs(g):
    q = deque()
    check = [0] * (N+1)
    q.append(g[0])
    check[g[0]] = 1

    cnt = 1
    ans = 0
    while q:
        tmp = q.popleft()
        ans += population[tmp]
        for jdx in d_map[tmp]:
            if jdx in g and not check[jdx]:
                check[jdx] = 1
                cnt += 1
                q.append(jdx)
    if cnt == len(g):
        return ans
    else:
        return 0


def dfs(cnt, x, end):
    global value

    if cnt == end:
        group1, group2 = deque(), deque()
        # 방문한 것들을 group1 에 아닌것은 group2에
        for idx in range(1, N+1):
            if visited[idx]:
                group1.append(idx)
            else:
                group2.append(idx)

        # 만들어진 그룹이 연결되어 있는지 확인
        population_group1 = bfs(group1)
        if not population_group1:
            return  # 인접하지 않을경우 함수 종료
        population_group2 = bfs(group2)
        if not population_group2:
            return
        # 2개의 구역 모두 인접한 그룹 -> 가능한 그룹
        value = min(value, abs(population_group1 - population_group2))
        return

    for idx in range(x, N+1):
        if visited[idx]:  # 방문 했다면 스킵
            continue

        visited[idx] = 1  # 방문처리
        dfs(cnt+1, idx, end)  # 조합이기 때문에 x 에 현재 값을 넣어줌
        visited[idx] = 0  # 방문 리셋


# input
N = int(input())
population = [0] + list(map(int, input().split()))

d_map = [0]
for i in range(N):
    d_map.append(list(map(int, input().split()))[1:])

# solution
value = 987654321
for i in range(1, N//2+1): #  number of district
    visited = [0] * (N+1)
    dfs(0, 1, i)

if value == 987654321:
    print(-1)
else:
    print(value)
