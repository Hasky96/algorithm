
def find_parent(parent, x):
    if parent[x] != x:
        parent[x] = find_parent(parent, parent[x])
    return parent[x]


def union_parent(parent, a, b):
    a = find_parent(parent, a)
    b = find_parent(parent, b)
    if a < b:
        parent[b] = a
    else:
        parent[a] = b


N = int(input())
parent = list(range(N+1))

location = [list(map(int, input().split())) for _ in range(N)]
distance = []
for i in range(N-1):
    for j in range(i+1, N):
        d = min([abs(location[i][k]-location[j][k])] for k in range(3))
        distance.append((i, j, *d))

distance.sort(key=lambda x: x[2])
visited = [0]*N
result = 0
for dis in distance:
    s, e, d = dis
    if find_parent(parent, s) != find_parent(parent, e):
        union_parent(parent, s, e)
        result += d
print(result)
