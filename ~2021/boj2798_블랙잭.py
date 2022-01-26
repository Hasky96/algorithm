# Black Jack
import sys
input = sys.stdin.readline

# 시간초과 잦은듯 -> C 빠름 but java, python 느림

# input()
N, M = tuple(map(int, input().split()))

# cards list
cards = list(map(int, input().split()))

cards = sorted(cards, reverse=True)
# sol
ans = 0
for i in range(N-2):
    total = cards[i]
    for j in range(i+1,N-1):
        total += cards[j]
        for k in range(j+1,N):
            if ans < total +cards[k] <= M :
                ans = total +cards[k] 
        total -= cards[j]

print(ans)





# # Runtime Error solution
# result = 0
# for i in range(1 << len(cards)):
#     if str(bin(i)).count('1') == 3:
#         num = str(bin(i))
#         idx = len(cards)-len(num)
#         idx1=num.index('1')
#         idx2=num.index('1',idx1+1)
#         idx3=num.index('1',idx2+1)
#         ns = cards[idx+idx1]+cards[idx+idx2]+cards[idx+idx3] 
#         if ns == M:
#             result = M
#             break
#         elif ns < M and M-result > M-ns:
#             result = ns
# print(result)

            

