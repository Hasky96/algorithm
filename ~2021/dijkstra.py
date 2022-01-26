# 1 2 3 4 5 6
import heapq # 들어갈때 바로 크기순 정렬
arr = [[0, 0, 0, 0, 0, 0, 0],  # 0
       [0, 0, 3, 5, 0, 0, 0],  # 1
       [0, 0, 0, 1, 6, 0, 0],  # 2
       [0, 0, 1, 0, 3, 6, 0],  # 3
       [0, 0, 0, 0, 0, 2, 3],  # 4
       [0, 0, 0, 0, 3, 0, 6],  # 5
       [0, 0, 0, 0, 0, 0, 0]]  # 6

now = 2
visited = [0] * 7
# infinite
distance = [999, 999, 999, 999, 999, 999, 999]
# dijkstra
distance[now] = 0
print(distance)
possible_next = []
heapq.heappush(possible_next, now)
while possible_next:
    now = heapq.heappop(possible_next)
    for i in range(1, 7):
        if arr[now][i]:  # 갈수 있는지
            if arr[now][i] + distance[now] < distance[i]:
                distance[i] = arr[now][i] + distance[now]
                heapq.heappush(possible_next, i)
print(distance)