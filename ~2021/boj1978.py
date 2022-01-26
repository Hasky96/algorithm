N = int(input())
nums = list(map(int,input().split(' ')))

cnt = 0

for i in nums:
    div = i-1
    while i>1:
        if i%div ==0:
            break
        div-=1
    if div==1:
        cnt+=1
print(cnt)