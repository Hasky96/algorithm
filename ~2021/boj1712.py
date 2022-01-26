
A, B, C = map(int,input().split(' '))

def solution(a, b, c):
    if b>=c:
        return -1
    return (a//(c-b)+1)
    
print(solution(A, B, C))