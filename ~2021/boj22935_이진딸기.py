sb = (list(range(1, 16)) + list(range(14, 1, -1)))
print(sb)
T = int(input())


def strawberry(num):
    ret = ''
    while num > 0:
        num, d = divmod(num, 2)
        ret = str(d) + ret

    ret = '{:0>4}'.format(ret)
    return ret


for _ in range(T):
    N = int(input())
    ans = strawberry(sb[(N-1)%28])
    print(ans)
    for i in ans:
        if i == '1':
            print('딸기', end='')
        else:
            print('V', end='')
    print()