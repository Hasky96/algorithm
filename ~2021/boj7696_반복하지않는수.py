<<<<<<< HEAD
def find_next(n):
    num_list = [0]*10
    len_n = len(str(n))
    return 1


ans_list = []
=======
import sys

input = sys.stdin.readline


def next_num(n):
    global num
    n = str(n)
    l = len(n)
    if l == len(set(n)):
        num = int(n)
        return
    else:
        for i in range(l - 1):
            for j in range(i + 1, l):
                if n[i] == n[j]:
                    n = (int(n[:j + 1]) + 1) * 10 ** (l - 1 - j)
                    return next_num(n)


ans = [0] * 1000001
num = 0
cnt = 0
while not ans[1000000]:
    cnt += 1
    next_num(ans[cnt-1]+1)
    ans[cnt] = num

while True:
    inp = int(input())
    if not inp:
        break
    print(ans[inp])

>>>>>>> 77865bbd3b5e2f570cea88771e45f691bb16104f

num = 1
while len(ans_list) <= 10000:
    # 겹치는 숫자가 있다면
    if 2 <= len(str(num)) != len(set(str(num))):
        num = find_next(num)
        print(num)
    else:
        ans_list.append(num)
        print(num)
        # 숫자 증가
        num += 1
print(ans_list[9999])
