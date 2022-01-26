# BOJ 1920
# 수가 포함되는지 찾기
M = int(input())
arr = list(map(int, input().split()))
N = int(input())
inp = list(map(int, input().split()))
for li in inp:
    if li in arr:
        print('1')
    else:
        print('0')
