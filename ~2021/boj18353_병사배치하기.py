# LIS
# Longest Incresing Subsquence

N = int(input())
army = list(map(int, input().split()))
# 뒤집는 합수
army.reverse()

dp = [1] * N
for i in range(1, N):
    for j in range(0, i):
        if army[j] < army[i]:
            dp[i] = max(dp[i], dp[j]+1)
print(N - max(dp))
