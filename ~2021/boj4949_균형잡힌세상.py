
while True:
    stack = []
    result = 'yes'
    inp = input()
    if inp == '.':
        break
    for char in inp:
        if char == ')':
            try:
                # 뽑아서 짝이 맞는지 확인
                if stack.pop() != '(':
                    result = 'no'
                    break
            except IndexError:
                result = 'no'
                break
        elif char == ']':
            try:
                # 뽑아서 짝이 맞는지 확인
                if stack.pop() != '[':
                    result = 'no'
                    break
            except IndexError:
                result = 'no'
                break
        elif char in '([':
            stack.append(char)
    else:
        # for else -> break 안걸리면 stack에 남은 값이 있는지 비교
        if stack:
            result = 'no'
    print(result)
