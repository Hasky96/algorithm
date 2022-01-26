# ATM

# Input
people = int(input())

times = list(map(int, input().split()))

# 순서대로 정렬
times.sort()

# 중복되어 나오는 경우를 for문으로 곱해줌 
cnt = len(times)
total = 0
for time in times:
    total += time * cnt
    cnt -= 1 

print(total)


