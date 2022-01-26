testCase = int(input())

def solution(h, w, n):
    if n%h==0:
        return h*100+n//h
    return n//h+1 + (n%h)*100

for i in range(testCase):
    a, b, c = map(int,input().split(' '))
    print(solution(a, b, c))

