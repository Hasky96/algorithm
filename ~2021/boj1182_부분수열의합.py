
N, S = map(int, input().split())

arr = list(map(int, input().split()))

cnt = 0
# 모든 가능한 부분집합
for i in range(1, 1 << N):
    pl = []
    # 원소를 하나씩 확인하면서 포함되는가 여부 확인
    for j in range(N):
        if i & (1 << j):
            # 리스트에 더해둠
            pl.append(arr[j])
    # 합이 S랑 같은지?
    if sum(pl) == S:
        cnt += 1
print(cnt)
