# boj11404
# dijkstra
# import heapq
# inf = 987654321
#
#
# def dijkstra(N, start, array):
#     """
#     :param N: amount of cities
#     :param start: start node of dijkstra
#     :param array: cost array
#     :return: dijkstra array at start node
#     """
#     dij_array = [inf]*(N+1)
#     dij_array[start] = 0
#     visited = [0] * (N+1)
#     visited[start] = 1
#     Q = []
#     heapq.heappush(Q, [start, 0])
#     while Q:
#         s = heapq.heappop(Q)[0]
#         for idx in range(1, N+1):
#             if s != idx:
#                 if array[s][idx]:
#                     dij_array[idx] = min(dij_array[idx], dij_array[s]+array[s][idx])
#                     if not visited[idx]:
#                         visited[idx] = 1
#                         heapq.heappush(Q, [idx, dij_array[idx]])
#     return dij_array
#
#
# N = int(input())
# M = int(input())
# ex_map = [[0] * (N+1) for _ in range(N+1)]
# for _ in range(M):
#     dep, des, ex = map(int, (input().split()))  # departure, destination, expense
#     if not ex_map[dep][des]:
#         ex_map[dep][des] = ex
#     else:
#         ex_map[dep][des] = min(ex, ex_map[dep][des])
# ans_list = []
# for i in range(1, N+1):
#     tmp = dijkstra(N, i, ex_map)
#     ans_list.append(tmp[1:])
#
# for i in ans_list:
#     for j in i:
#         if j == 987654321:
#             print("0", end=' ')
#         else:
#             print(j, end=' ')
#     print()

N = int(input())
M = int(input())
ex_map = [[987654321] * (N+1) for _ in range(N+1)]
for _ in range(M):
    dep, des, ex = map(int, (input().split()))  # departure, destination, expense
    if not ex_map[dep][des]:
        ex_map[dep][des] = ex
    else:
        ex_map[dep][des] = min(ex, ex_map[dep][des])


def floyd():
    for k in range(0, N+1):
        for i in range(0, N+1):
            for j in range(0, N+1):
                if i != j:
                    if ex_map[i][j] > ex_map[i][k] + ex_map[k][j]:
                        ex_map[i][j] = ex_map[i][k] + ex_map[k][j]


floyd()
for r in ex_map[1:]:
    for res in r[1:]:
        if res == 987654321:
            print("0", end=' ')
        else:
            print(res, end=' ')
    print()
