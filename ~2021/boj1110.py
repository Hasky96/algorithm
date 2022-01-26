N = int(input())

check = (N%10*10)+(N//10+N%10)%10
cnt = 1
while check!=N:
    check = (check%10*10)+(check//10+check%10)%10
    cnt += 1
print(cnt)   