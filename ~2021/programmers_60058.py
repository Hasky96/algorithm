# https://programmers.co.kr/learn/courses/30/lessons/60058
from collections import deque
def solution(p):
    u = ''
    v = ''
    for i in range(len(p)):
        u += p[i]
        if u.count('(') == u.count(')'):
            if i < len(p)-1:
                v += str(p[i+1:len(p)])
            break
    stack = []
    while u:
        char = u.popleft()
        if char == '(':
            stack.append(u)
        else:
            if stack:
                stack.pop()
            else:

                break
    else:
        solution(v)


    answer = ''





    return answer
