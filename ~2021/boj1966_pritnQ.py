
T = int(input())
for _ in range(T):
    N, M = tuple(map(int, input().split()))
    Q = list(map(int, input().split()))
    print_idx = list(range(N))
    cnt = 0
    while Q:
        max_Q = max(Q)
        value = Q.pop(0)
        if value != max_Q:
            Q.append(value)
            print_idx.append(print_idx.pop(0))
        else:
            cnt += 1
            if print_idx.pop(0) == M:
                break
    print(cnt)
