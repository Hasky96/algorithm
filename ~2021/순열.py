def perm(n, k):
    if k == n:
        print(p)
    else:
        for i in range(k, n):
            p[k], p[i] = p[i], p[k]
            perm(n, k+1)
            p[k], p[i] = p[i], p[k]


p = [1, 2, 3]
perm(3, 0)
"""
[1, 2, 3]
[1, 3, 2]
[2, 1, 3]
[2, 3, 1]
[3, 2, 1]
[3, 1, 2]
"""
print('###################################################')


def f(n, k):
    if n == k:
        print(p)
    else:
        for i in range(n):
            if u[i] == 0:
                u[i] = 1
                p[k] = arr[i]
                f(n, k+1)
                u[i] = 0


p = [0]*3
arr = [1, 2, 3]
u = [0]*3
f(3,0)
print('###################################################')


def f1(n, m, k):  # n 순열의 길이, k 결정할 위치
    if n == k:
        print(p)
    else:
        for i in range(m):# 주어진 숫자의 갯수만큼
            if u[i] == 0:
                u[i] = 1
                p[k] = arr[i]
                f1(n, m, k+1)
                u[i] = 0


p = [0]*3
arr = [1, 2, 3, 4, 5]
u = [0]*5
f1(3, 5, 0)

