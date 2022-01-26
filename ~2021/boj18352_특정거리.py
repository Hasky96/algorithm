# boj18352 Q15
import sys
from collections import deque
input = sys.stdin.readline
# 도시, 도로(단방향), 목표거리, 출발 도시
N, M, K, X = tuple(map(int, input().split()))

roads = [[] for _ in range(N+1)]

for _ in range(M):
    s, e = tuple(map(int, input().split()))
    roads[s].append(e)

# BFS
distance = [-1] * (N+1)
distance[X] = 0
Q = deque([X])
while Q:
    p = Q.popleft()
    for i in roads[p]:
        if distance[i] == -1:
            Q.append(i)
            distance[i] = distance[p] + 1
for idx in range(1, N+1):
    if distance[idx] == K:
        print(idx)
if K not in distance:
    print(-1)
