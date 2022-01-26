N = int(input())
triangle = [list(map(int, input().split())) for _ in range(N)]
max_ans = 0

dp = [[0]*i for i in range(1, N+1)]
dp[0][0] = triangle[0][0]
# 1, 2, 3, 4
for i in range(1, N):
    for j in range(i+1):
        left, right = j-1, j
        if left < 0:
            left = 0
        elif right == i:
            right -= 1
        dp[i][j] = triangle[i][j] + max(dp[i-1][left], dp[i-1][right])
print(max(dp[N-1]))
