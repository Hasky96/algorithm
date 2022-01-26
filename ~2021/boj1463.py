# input
x = int(input())
 
dp = [0] * ((10**6)+1)

for i in range(2, x+1):
    dp[i] = dp[i-1] + 1
                           # dp[i-1] dp[i//2] dp[i//3]
                           #     3       1         2              

    if i % 2 == 0:
        dp[i] = min(dp[i-1], dp[i//2]) + 1
    if i % 3 == 0:      
        dp[i] = min(dp[i-1], dp[i//3]) + 1
    # dp[12]< dp[18] -> 확신 x ..? 흐름이 그렇다 .... 우연의 일치 
    if i % 6 == 0: # dp[12] dp[18] min-> ?
        dp[i] = min(dp[i-1], dp[i//3], dp[i//2]) + 1

print(dp[x])
'''
n = int(input())
dp = [0] * 1000010

for i in range(2, n + 1):
    dp[i] = dp[i - 1] + 1
    if i % 2 == 0:
        dp[i] = min(dp[i], dp[i // 2] + 1)
    if i % 3 == 0:
        dp[i] = min(dp[i], dp[i // 3] + 1)

print(dp[n])'''
