# https://programmers.co.kr/learn/courses/30/lessons/60058

def solution(p):
    # 비어있으면 빈문자 반환
    if not p:
        return ''
    # u와 v로 나누기
    stack = []
    for i in range(len(p)):
        stack.append(p[i])
        if stack.count('(') == stack.count(')'):
            if p[i] == len(p)-1:
                return p
            else:
                u = p[:i+1]
                v = p[i+1:]
                break
    # u가 올바른지 확인
    stack = []
    right = False
    li = list(u)[::-1]
    while li:
        g = li.pop()
        if g == '(':
            stack.append(g)
        elif g == ')':
            if stack and stack[-1] == '(':
                stack.pop()
            elif not stack:
                stack.append(1)
                break
            else:
                stack.append('(')
    else:
        if not stack:
            right = True
    if right:
        return u+solution(v)
    else:
        tmp = '(' + solution(v) + ')'
        u = u[1:-1]
        new_u = ''
        for i in u:
            if i == '(':
                new_u += ')'
            else:
                new_u += '('
        return tmp+new_u
print(solution('()))((()'))