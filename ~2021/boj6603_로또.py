import heapq
arr = []


def dfs(level, j):
    if level == 6:
        ans = list(arr)
        heapq.heapify(ans)
        while ans:
            print(heapq.heappop(ans), end=' ')
        print()

    for i in range(j, K):
        if not used[i]:
            arr.append(S[i])
            dfs(level+1, i+1)
            arr.pop()



while True:
    inp = tuple(map(int, input().split()))
    if not inp[0]:
        break
    K = inp[0]
    S = inp[1:]
    used = [0] * K
    dfs(0, 0)
    print()


