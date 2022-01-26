
n = int(input())

result = []
for _ in range(n):
    num = int(input())
    result.append(num)
# 오름차순으로 입력
arr = list(sorted(result))

# 확인을 위한 인덱스
idx = 0
stack = []
# 출력을 위한 list // '+' or '-'
ans = []
for num in arr:
    stack.append(num)
    ans.append('+')
    while True:
        # 스택의 탑 값이 원하는 값이면 -> 아닐때까지 반복
        if stack and stack[-1] == result[idx]:
            idx += 1
            stack.pop()
            ans.append('-')
        else:
            break
if stack:
    print('NO')
else:
    for i in ans:
        print(i)
