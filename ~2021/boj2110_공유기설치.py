import heapq
N, C = map(int, input().split())

x = [int(input()) for _ in range(N)]
x.sort()

router = []
start = 0
end = N-1
