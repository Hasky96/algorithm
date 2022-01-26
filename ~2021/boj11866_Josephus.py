# 요세푸스 문제
def my_print(li):
    string = '<'
    while li:
        string += str(li.pop(0))
        if li:
            string += ', '
    return string+'>'


N, K = tuple(map(int, input().split()))

circle = list(range(1, N+1))
ans = []
cnt = 0
while circle:
    num = circle.pop(0)
    cnt += 1
    if cnt % K:
        circle.append(num)
    else:
        ans.append(num)
print(my_print(ans))
