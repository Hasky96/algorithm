# BFS

# 컴퓨터 수
coms = int(input())
# 연결된 네트워크 수
net = int(input())
# 네트워크 -> 양방향
network = [[0]*(coms+1) for _ in range(coms+1)]
# 연결
for _ in range(net):
    st, en = tuple(map(int, input().split()))
    network[st][en] = 1
    network[en][st] = 1

Q = [1]
visited = [0]*(coms+1)
visited[1] = 1
while Q:
    s = Q.pop(0)
    for i in range(1, coms+1):
        if network[s][i] and not visited[i] and i not in Q:
            Q.append(i)
            visited[i] = 1

print(sum(visited)-1)
