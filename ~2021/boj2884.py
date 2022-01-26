A, B = map(int,input().split(' '))
#0 0 ~ 24 00 -> 0 ~ 24*60 

# 원래시간 분으로 계산
time = A*60+B
# 45분 이른시간 
time -= 45
#0시 이전이 될 경우
if time < 0:
    time=23*60+(60-abs(time))
#다시 튜플 형대로 전환
A, B = divmod(time, 60)
print(A, B, sep=' ')