def find_hansu(num):
    length = len(str(num))
    num = num % 100
    ed = num % 10 - num // 10
    if ed == 0:
        return int(str(num % 10)*length)
    else:
        ret = num % 10
        for idx in range(1, length):
            ret += (int(str(ret)[0]) - ed) * 10**idx
        return int(ret)


N = int(input())

cnt = 0
for i in range(1, N+1):
    if find_hansu(i) == i:
        cnt += 1
print(cnt)
