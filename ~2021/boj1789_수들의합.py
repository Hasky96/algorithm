# 수들의 합

sum_value = int(input())

cnt = 0
num = 1
while sum_value>0:
    sum_value -= num
    num += 1
    if sum_value<0:
        break
    cnt += 1
    
print(cnt)