from collections import deque


def comb(i, p, r):
    if i == r:
        cases.append(operators[:r])
    else:
        for j in range(i, p):
            operators[i], operators[j] = operators[j], operators[i]
            comb(i+1, p, r)
            operators[i], operators[j] = operators[j], operators[i]


N = int(input())

nums = deque(list(map(int, input().split())))

plus, minus, multi, divid = map(int, input().split())
operators = ['+']*plus + ['-']*minus + ['*']*multi + ['/']*divid
cases = deque([])
# operators를 나열하는 경우 순열
comb(0, len(operators), N-1)

ans_list = []
for arr in cases:
    arr = arr[::-1]
    n = deque(nums)
    ans = n.popleft()
    while n:
        oper = arr.pop()
        if oper == '+':
            ans += n.popleft()
        elif oper == '-':
            ans -= n.popleft()
        elif oper == '*':
            ans *= n.popleft()
        elif oper == '/':
            if ans >= 0:
                ans //= n.popleft()
            else:
                ans *= -1
                ans //= n.popleft()
                ans *= -1
    ans_list.append(ans)
print(max(ans_list), min(ans_list), sep='\n')
