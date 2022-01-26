
case = 0
while True:
    case += 1
    inp = list(map(int, input().split()))
    # stop
    if not sum(inp):
        break

    ans = 0
    # a: 풀로 가능한 캠핑장 사용 주기
    a, b = divmod(inp[2], inp[1])
    ans += a*inp[0]
    if b > inp[0]:
        b = inp[0]
    ans += b
    print('Case {}: {}'.format(case, ans))
