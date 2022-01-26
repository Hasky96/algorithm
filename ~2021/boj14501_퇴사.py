
N = int(input())
t = [0]*(N+1)
p = [0]*(N+1)
for i in range(1, N+1):
    t[i], p[i] = map(int, input().split())
dp = [0]*(N+2)

max_value = 0
time = 0
for j in range(N, 0, -1):
    # 끝나는 날
    time = j + t[j]
    if time <= N+1:
        dp[j] = max(p[j] + dp[time], max_value)
        max_value = dp[j]
    else:
        dp[j] = max_value
print(max_value)
